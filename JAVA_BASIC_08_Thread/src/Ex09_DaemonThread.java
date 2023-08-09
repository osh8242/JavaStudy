class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 자동 저장하였습니다");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
            save();
        }
    }
}

public class Ex09_DaemonThread {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //autoSaveThread를 데몬으로 설정하였다.
        //main thread가 종료되면 daemon thread도 같이 종료된다.
        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main thread 종료");
    }
}
