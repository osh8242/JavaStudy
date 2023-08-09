import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_TCP_Echo_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(9999);
        System.out.println("접속 대기중....");
        Socket socket = sc.accept(); // 클라이언트 요청이 오면 (접속)
        System.out.println("연결 완료");

        /*
            Client 서버로 write 데이터를 서버가 받아서 그대로 다시 Client 전송
            server : read, write
            client : read, write

            socket으로부터 input, ouput stream을 얻어야하는구나
         */

        //client가 보낸 내용 읽기
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);

        //write로 메아리 전송
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        while(true){
            String clientMsg = dis.readUTF();
            System.out.println("clientMsg = " + clientMsg);
            if(clientMsg.equals("exit")) break;
            dos.writeUTF(clientMsg);
            dos.flush(); //close() 해도 되는데 ... 바로바로 내용을 전달
        }
        System.out.println("서버 종료");
        dis.close();
        dos.close();
        in.close();
        out.close();
        socket.close();
        sc.close();
    }
}
