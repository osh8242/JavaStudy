import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//InnerClass (OuterClass)의 자원을 사용하고싶어요.. >> 코드간소화
//InnerClass >> ClientSend
//InnerClass >> ClientReceive
public class Ex04_TCP_Chatt_Client {
    Socket socket;
    BufferedReader br;
    public Ex04_TCP_Chatt_Client(){
        try {
            this.socket = new Socket("192.168.0.160",9999);
            this.br = null;
            System.out.println("Chatt 서버와 연결되었습니다");

            // ClientSend Thread start
            // ClientReceive Thread start

            new ClientSend().start();
            new ClientReceive().start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Ex04_TCP_Chatt_Client client = new Ex04_TCP_Chatt_Client();
    }

    // 읽기용 innerClass
    class ClientReceive extends Thread{
        @Override
        public void run() {


            try {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String data = null;
                while((data = br.readLine()) != null){
                    System.out.println("Server에서 받은 메세지 : [ " + data +" ]");
                }
                System.out.println("ClientReceive 종료");
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

    // 쓰기용 innerClass
    class ClientSend extends Thread{
        @Override
        public void run() {

            PrintWriter pw = null;

            try {
                br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 역할 대체
                pw = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    String data = br.readLine(); //sc.nextLine()
                    if(data.equals("exit")) break;
                    pw.println(data); //접속한 클라이언트에게 메세지를 보내기
                    //dos.writeUTF(msg);

                    System.out.println("ClientSend 작업종료");
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
}
