import java.util.ArrayList;

/*
    멀티 스레드 환경 (이슈 : 공유자원)

    synchronized (동기화)

    Collection (Vector, ArrayList) 비교

    Vector 동기화 보장 ... >> 멀티 스레드 환경 >> 자원 보호 >> 화장실처럼 (Lock) >> 성능 저하 ...
    ArrayList 동기화 보장하지 않아요 >> 성능 보장 >> 자원 보호 보장 .... 하지 않아요

    한강을 생각해보자
    화장실이 1개라고 가정하자.
    화장실 1개는 공유자원이다.
    여러명의 사람들(10명)은 공유자원을 사용하는 10개의 스레드라고 볼 수 있다.

    성능을 위해서라면 동기화를 사용하면 안된다.
    한강 비빔밥 축제 : 여러사람이 동시에 접근해서 빨리빨리 먹어야한다. Lock 처리하면 안됨;
 */
class Wroom{
    synchronized void openDoor(String name){
        System.out.println(name + "님 화장실 입장 ^^");
        for(int i =0 ; i < 11 ; i++){
            System.out.println(name + " 사용 중 " + i);
            if(i == 10) {
                System.out.println(name + "님이 '끙'하고 힘을 주셨습니다");
            }
        }
        System.out.println(name + "님이 시원해하며 미소를 짓습니다 ^^*");
    }
}
class User extends Thread{
    Wroom wr;
    String name;
    User(String name , Wroom wr){
        this.name = name;
        this.wr = wr;
    }
    @Override
    public void run(){
        wr.openDoor(this.name);
    }
}
public class Ex07_Sync_Thread {
    public static void main(String[] args) {
        //한강 둔치의 화장실
        Wroom wroom = new Wroom();

        //사람들
        User kim = new User("김씨", wroom);
        User lee = new User("이씨", wroom);
        User park = new User("박씨", wroom);

        //배가 아픕니다
        kim.start();
        lee.start();
        park.start();
    }
}
