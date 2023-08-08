import javax.swing.*;

/*
    게임 ....

    문제 ....
    시간 ....
    2개의 작업을 동시에(경합) >> CPU를 점유할 수 있는 상태

    기존의 단일 Thread로는 구현이 불가능 (stack 하나로는 불가능)
    multi Thread를 통해서 (stack 여러개를 만들어서..)
 */

class WordTime extends Thread {
    @Override
    public void run(){
        for(int i = 10 ; i > 0 ; i--){
            try {
                System.out.println("남은 시간 : " + i);
                Thread.sleep(1000); // 휴게실 가서 1초간 쉬었다가 (점유) >> runnable 상태
                if(Ex04_Multi_Word_Game.inputCheck) break;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class WordInputThread extends Thread{
    @Override
    public void run(){
        int dan = 2;
        int multiple = (int)(Math.random() * 9) + 1;
        String inputData = JOptionPane.showInputDialog(dan + "x" + multiple + " 값을 입력하세요");
        if(Integer.parseInt(inputData) == dan*multiple) {
            System.out.println("정답입니다!!!!");
        } else {
            System.out.println("틀렸습니다!!");
        }
        Ex04_Multi_Word_Game.inputCheck = true;
        System.out.println("입력 = " + inputData);
        System.out.println("정답 = " + dan*multiple);
    }
}
public class Ex04_Multi_Word_Game {
    static boolean inputCheck = false;
    public static void main(String[] args) {
        WordTime timerThread = new WordTime();
        timerThread.start(); // stack 만들고 .... run() 올려 놓는다 ... start() end

        WordInputThread wordInputThread = new WordInputThread();
        wordInputThread.start();

        //상태 (일시정지) >> 실행되고 있는 스레드를 휴게실로 보내기

        //위성과 지구와의 거리
        //목성(T), 토성(T), 금성(T) >> 총 거리의 합

        //main thread는 word, time이 끝난 다음에 종료하고 싶어요
        try {
            timerThread.join(); // main에게 내가 끝날때까지 기다려주겠니?
            wordInputThread.join(); // main에게 내가 끝날때까지 기다려주겠니?
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main End");
    }
}
