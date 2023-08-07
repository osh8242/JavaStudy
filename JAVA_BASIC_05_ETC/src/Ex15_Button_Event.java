import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Brn_Handler implements ActionListener {
    //버튼을 클릭하면...
    //id 입력값, pwd 입력값을 가지고 와서 유효성 검증

    private TextField txtid;
    private TextField txtpwd;

    public Brn_Handler(TextField txtid, TextField txtpwd) {
        this.txtid = txtid; //주소값
        this.txtpwd = txtpwd;
    }


    //버튼 클릭이 되면 실행될 함수 ... actionPerformed
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        if (txtid.getText().equals("hong")) {
            System.out.println("방가 : " +txtid.getText() +" / " + txtpwd.getText());
        } else {
            System.out.println("배고픈 당신은 누구?");
        }
    }
}

class LoginForm extends Frame {
    Label lbl_id;
    Label lbl_pwd;
    TextField txt_id;
    TextField txt_pwd;
    Button btn_ok;

    public LoginForm(String title) throws HeadlessException {
        super(title);
        this.lbl_id = new Label("ID:", Label.RIGHT);
        this.lbl_pwd = new Label("PWD:", Label.RIGHT);

        this.txt_id = new TextField(10);
        this.txt_pwd = new TextField(10);
        this.txt_pwd.setEchoChar('#');
        this.btn_ok = new Button("login");

        this.setLayout(new FlowLayout());
        this.setSize(500, 100);
        this.setVisible(true);

        this.add(lbl_id);
        this.add(txt_id);

        this.add(lbl_pwd);
        this.add(txt_pwd);

        this.add(btn_ok);
        btn_ok.addActionListener(new Brn_Handler(txt_id, txt_pwd));

    }
}

public class Ex15_Button_Event {
    public static void main(String[] args) {
        LoginForm2 loginForm2 = new LoginForm2("로그인");
    }

}
