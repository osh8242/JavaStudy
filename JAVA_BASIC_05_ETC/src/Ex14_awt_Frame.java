import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame{
    public MyFrame(String title) throws HeadlessException {
        super(title);
    }
}
//익명 타입을 쓰지 않는 경우
class BtnClickHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("나 클릭.....");
    }
}
public class Ex14_awt_Frame {
    public static void main(String[] args) {
        MyFrame my = new MyFrame("Login");
        my.setSize(350,300);
        my.setVisible(true);
        my.setLayout(new FlowLayout());

        Button btn = new Button("one");
        Button btn2 = new Button("two");
        Button btn3 = new Button("three");
        
        //버튼에 이벤트
        //이벤트 : 소스, 행위, 감지기
        
        //익명객체를 사용해서 이벤트핸들러 추가
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("인터페이스 익명 객체 구현");
            }
        });
        
        //일반적인 방법으로 버튼에 이벤트핸들러 추가하기
        BtnClickHandler handler = new BtnClickHandler();
        btn2.addActionListener(handler);

        my.add(btn);
        my.add(btn2);
        my.add(btn3);


    }
}
