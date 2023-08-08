/*
    여러개의 Thread가 존재할 때
    우선순위의 default 값은 5이다.
    Min(1)에서부터 Max(10)까지 가질 수 있다.

    상대적 수치값을 올리면 CPU를 점유할 확률이 높아진다.
 */
class Pth1 extends Thread {
    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
class Pth2 extends Thread {
    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        }
    }
}
class Pth3 extends Thread {
    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
}
public class Ex08_Priority {
    public static void main(String[] args) {
        Pth1 pth1 = new Pth1();
        Pth2 pth2 = new Pth2();
        Pth3 pth3 = new Pth3();

        pth1.setPriority(1);
        pth2.setPriority(10);
        pth3.setPriority(10);

        System.out.println(pth1.getPriority());
        System.out.println(pth2.getPriority());
        System.out.println(pth3.getPriority());

        pth1.start();
        pth2.start();
        pth3.start();
    }
}
