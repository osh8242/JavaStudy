import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    Ex01 ~ Ex03 하나의  Thread 가지고 작업 (순차적인 데이터 처리)

    Server : read, write
    Client : read, write

    read, write가 동시에 처리되려면? >> Thread를 이용하자!

    stack을 여러개 사용해서 구현하자!
    1:1 통신(server와 client) >> read, write를 동시에 처리해보자!

 */
public class Ex04_TCP_Chatt_Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("접속 대기중...");
            Socket socket = serverSocket.accept();
            System.out.println("Client와 연결완료");

            //기존코드
            //read
            //InputStream in = socket.getInputStream();
            //DataInputStream dis = new DataInputStream(in);

            new ServerSend(socket).start();
            new ServerReceive(socket).start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}

//write 전용 Thread
class ServerSend extends Thread {
    Socket socket;

    public ServerSend(Socket socket) { //new ServerSend(socket).start();
        this.socket = socket;
    }

    @Override
    public void run() { //Thread의 main 역할
        //기존
        //OutputStream out = socket.getOutputStream();
        //DataOutputStream dos = new DataOutputStream(out);

        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 역할 대체
            pw = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String data = br.readLine(); //sc.nextLine()
                if(data.equals("exit")) break;
                pw.println(data); //접속한 클라이언트에게 메세지를 보내기
                                //dos.writeUTF(msg);

                System.out.println("ServerSend 작업종료");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                pw.close();
                br.close();
            } catch (Exception e2){
                System.out.println(e2.getMessage());
            }

        }
    }
}

//read 전용 Thread
//socket : inputStream
class ServerReceive extends Thread{
    Socket socket;
    public ServerReceive(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String data = null;
            while((data = br.readLine()) != null){
                System.out.println("Client에게 받은 메세지 : [ " + data +" ]");
            }
            System.out.println("ServerReceive 종료");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}