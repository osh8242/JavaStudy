import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트 (socket)

//서버 IP : 192.168.0.46 , 서버 PORT : 9999

public class Ex02_TCP_Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("192.168.0.168",9999);
        System.out.println("서버와 연결 되었습니다");

        //서버에서 보낸 메세지를 받기
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);

        String msg = dis.readUTF();
        System.out.println("msg = " + msg);

        dis.close();
        in.close();
        socket.close();

    }

}
