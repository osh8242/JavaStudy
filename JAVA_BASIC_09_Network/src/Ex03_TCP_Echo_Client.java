import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트 (socket)

//서버 IP : 192.168.0.46 , 서버 PORT : 9999

public class Ex03_TCP_Echo_Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket socket = new Socket("192.168.0.160", 9999);
        System.out.println("서버와 연결 되었습니다");

        //서버에게 메세지 보내기
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        //서버에서 보낸 메세지를 받기
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        while(true){
            System.out.println("서버에 전송할 내용을 입력하세요");
            String msg = br.readLine();

            //서버에 전송하기
            dos.writeUTF(msg);
            dos.flush();

            if(msg.equals("exit")) break;
            String serverMsg = dis.readUTF();
            System.out.println("serverMsg = " + serverMsg);
        }
        System.out.println("클라이언트 종료");
        dis.close();
        dos.close();
        socket.close();
    }

}
