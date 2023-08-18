/*
    서버 1개이고
    여러명의 Client가 하나의 서버에 접속한다 >> 채팅방 1개를 가정
    KEY POINT : HashMap >> key : 사용자id, value : socket객체주소

    여러개의 채팅방 : 어떤 collection
    HashMap<K, V> >> key : 채팅방주소(이름), value : ArrayList<사용자소켓주소>
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class Ex05_TCP_Chatt_Server {
    ServerSocket serverSocket = null;
    Socket socket = null;

    //POTIN MAP
    HashMap<String, DataOutputStream> clientMap;
    //DataOutputStream은 소켓이 가지고 있는 Stream의 주소값
    //kglim, Socket
    //hong, Socket

    public Ex05_TCP_Chatt_Server() {
        this.clientMap = new HashMap<>(); // 각각의 socket이 가지는 출력객체의 주소 관리
    }

    //1. 서버 초기화 하는 작업
    public void innit() {
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("[ 서버시작 .. 요청대기증 .. ]");
            while (true) {
                socket = serverSocket.accept();
                System.out.println(" [ " + socket.getInetAddress() + " / " + socket.getPort() + " ] ");
                //코드작업
                //클라이언트가 접속시 마다
//                Thread client = new
//                Thread start()

                Thread client = new MultiServerRev(socket);
                client.start();
            }
        } catch (IOException e) {
            System.out.println("Init " + e.getMessage());
        }
    }

    //2. 접속된 모든 클라이언트 (socket) 메세지를 전달하고 싶어요
    //Map<K,V>
    //key >> 사용자ID(고유값) ex) kglim, hong, kim
    //clientMap<kglim, 각각의 소켓객체로부터 얻어낸 DataOutputStream 의 주소값>
    //clientMap<hong, 각각의 소켓객체로부터 얻어낸 DataOutputStream 의 주소값>
    public void sendMsgToAll(String msg) {
        Iterator<String> clientKeySet = clientMap.keySet().iterator();
        while (clientKeySet.hasNext()) {
            try {
                DataOutputStream clientOut = clientMap.get(clientKeySet.next());
                //각각의 Client에게 메세지를 전달
                //clientMap.get >> key가 가지고 있는 value 얻기(각각의 socket에서 얻은 DataOutputStream 주소값)
                clientOut.writeUTF(msg);
            } catch (Exception e) {
                System.out.println("send Exception : " + e.getMessage());
            }
        }
    }

    //3. 접속된 모든 유저 리스트 목록으로 관리하기
    public String showUserList(String name) {
        StringBuilder sb = new StringBuilder("<<접속자 목록 >>\n\r"); //개행처리, enter처리
        Iterator<String> users = clientMap.keySet().iterator();
        while (users.hasNext()) {
            try {
                String user = users.next(); //접속한 ID >> kim, hong
                sb.append(user.equals(name) ? "(*)" : user + "\n");
            } catch (Exception e) {
                System.out.println("showUserList method : " + e.getMessage());
            }
        }
        return sb.toString();
    }

    //4. 옵션(귓속말하기)
    public void sendMsgToOne(String msg, String senderName, String receiverName) {
        try {
            clientMap.get(receiverName).writeUTF("귓속말 from (" + senderName + ") => " + msg);
            //clientMap.get(receiverName) >>> socket이 가지는 DataOutputStream 주소값
            clientMap.get(senderName).writeUTF("귓속말 to (" + receiverName + ") => " + msg);
        } catch (IOException e) {
            System.out.println("sendMsgToOne 예외발생 : " + e.getMessage());
        }
    }

    //Thread 사용 (보내기, 받기)
    //inner class 형태로
    class MultiServerRev extends Thread {
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        public MultiServerRev(Socket socket) {
            try {
                this.socket = socket;
                in = new DataInputStream(this.socket.getInputStream());
                out = new DataOutputStream(this.socket.getOutputStream());
            } catch (IOException e) {
                System.out.println("MultiServerRev 예외발생 : " + e.getMessage());
            }
        }

        @Override
        public void run() {
            //read, write (readUTF(), writeUTF())
            String name = ""; //클라이언트의 이름(id) 저장

            try {
                //연결된 socket을 통해서 clinet 메세지를 전달
                out.writeUTF("이름을 입력하세요");
                name = in.readUTF();
                out.writeUTF("현재 채팅방에 입장하셨습니다"); // 현재 1개의 채팅방

                //현재 채팅방 10명의 user가 접속해있다고 가정
                //서버에 접속된 모든 사용자(socket) 입력된 내용 전달
                sendMsgToAll(name + "님 입장! 뿜뿜!!"); //10개의 socket에게 모두 메세지 전달

                //KEY POINT
                //현재 접속한 socket도 관리 (Map)
                clientMap.put(name, out); //Map("김씨", socket으로 가는 출력객체 주소)
                System.out.println("서버 모니터링 : 현재 " + clientMap.size() + "명 접속중");

                //추가기능 (대화)
                while (in != null) {
                    String msg = in.readUTF();

                    //채팅방에 참여하고 있는 모든 접속자에게 전달
                    if (msg.startsWith("/")) {
                        if (msg.trim().equals("/접속자")) {
                            //현재 접속한 사용자 목록
                            out.writeUTF(showUserList(name));
                        } else if (msg.startsWith("/귓속말")) {
                            String[] msgArr = msg.split(" ", 3);
                            // 예시) /귓속말 홍길동 방가방가!
                            if (msgArr == null || msgArr.length < 3) {
                                out.writeUTF("HELP:사용법\n\r /귓속말 [상대방ID] [보낼 메세지]");
                            } else {
                                String receiverName = msgArr[1];
                                String toMsg = msgArr[2];
                                if (clientMap.containsKey("receiverName")) {
                                    //Map 안에 id가 있으면
                                    //메세지 보내기 (특정 상대방)
                                    sendMsgToOne(toMsg, name, receiverName);
                                } else {
                                    out.writeUTF("해당 사용자가 없습니다....");
                                }
                            }
                        } else {
                            out.writeUTF("잘못된 형태의 명령어입니다");
                        }
                    } else {
                        //전체사용자에게 write
                        sendMsgToAll("[ " + name + " ]" + msg);
                    }

                }//while

            } catch (IOException e) {
                System.out.println("Thread run() 예외발생 : " + e.getMessage());
            } finally {
                //client 퇴장
                clientMap.remove(name);
                sendMsgToAll(name + "님이 퇴장하셨습니다");
                System.out.println("finally 서버모니터링 : 현재 접속자수 " + clientMap.size() + "명");
            }
        }
    }

    public static void main(String[] args) {
        Ex05_TCP_Chatt_Server server = new Ex05_TCP_Chatt_Server();
        server.innit();


    }
}
