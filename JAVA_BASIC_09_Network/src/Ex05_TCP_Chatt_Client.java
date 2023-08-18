import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Ex05_TCP_Chatt_Client extends JFrame implements ActionListener, Runnable {
    JTextArea ta; //출력창 (다중라인)
    JTextField txtInput; // 채팅내용 입력창
    DataInputStream in;
    DataOutputStream out;

    public Ex05_TCP_Chatt_Client() throws HeadlessException {
        //초기화
        //UI 구성
        this.setTitle("Multi 채팅");
        ta = new JTextArea(); //출력창
        txtInput = new JTextField(); //입력창
        JScrollPane sp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setAutoscrolls(true);
        ta.setBackground(Color.WHITE);
        ta.setLineWrap(true); // 텍스트 자동 줄바꿈여부
        ta.setEditable(false); // 텍스트 편집 가능여부

        txtInput.setText("이름을 입력하세요");
        txtInput.requestFocus();
        txtInput.selectAll();

        this.add(sp, "Center");
        this.add(txtInput, "South");
        this.setSize(500, 600);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtInput.addActionListener(this);

        //소켓을 생성하고 설정
        try {
            Socket socket = new Socket("192.168.0.160", 9999);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //서버와 연결
            ta.append("서버와 연결되었습니다\n\r");

            Thread client = new Thread(this);
            client.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            String msg = in.readUTF();
            ta.append(msg + "\n\r");
            while (in != null) {
                msg = in.readUTF();
                ta.append(msg + "\n\r");
            }
        } catch (IOException e) {
            System.out.println("접속중인 서버와의 연결이 종료되었습니다");
            return;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(txtInput)) {
            String msg = txtInput.getText();
            try {
                out.writeUTF(msg); //서버로 출력
                txtInput.setText("");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        Ex05_TCP_Chatt_Client client = new Ex05_TCP_Chatt_Client();
    }

}
