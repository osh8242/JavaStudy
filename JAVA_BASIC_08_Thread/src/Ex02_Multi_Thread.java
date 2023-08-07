/*
Thread : 프로세스에서 하나의 최소 실행단위(흐름) >>  method >> 실행되는 공간 stack

결과 : stack 여러개 생성해서 >> 동시에 함수를 실행 (실행가능하게 한다) >> cpu 점유 할 수 있는 상태로 만든다

Thread 생성방법
1. Thread 클래스 상속 >> class Task extends Thread >> run 함수 구현
2. Runnable 인터페이스 구현 >> class Task implements Runnable >> run 추상함수 구현
   Runnable 인터페이스 Thread 아니예요 >> 사용  >>  Thread thread = new Thread(new Task())

   ex) class Task extends Car ..implements Runnable
*/

class Task_1 extends Thread{
	@Override
	public void run() {  //함수는 Thread 의  main 함수 역할 >> 새로운 stack 처음 올라가서 실행되는 함수
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("Task_1 " + i + this.getName()); //내부적으로 생성된 이름 반환
		}
		System.out.println("Task_1 run() 함수 END");
	}
}

class Task_2 implements Runnable{   //Task_2 스레드가 아니예요 >> run() 구현한 객체

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("Task_2 " + i ); //내부적으로 생성된 이름 반환
		}
		System.out.println("Task_2 run() 함수 END");

	}

}



public class Ex02_Multi_Thread {

	public static void main(String[] args) {
		//main Thread

		Task_1 th = new Task_1();
		th.start(); //POINT : memory 에 call stack 생성하고 ... Thread 가지는 run() 함수를 stack 올려놓기

		Task_2 ta = new Task_2(); //runnable 인터페이스 구현한 객체 일 뿐 .....
		Thread th2 = new Thread(ta);
		th2.start();


		//익명 객체
		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				//제어 구문 사용
				for(int i = 0 ; i < 1000 ; i++) {
					System.out.println("th3 " + i); //내부적으로 생성된 이름 반환
				}
				System.out.println("th3 함수 END");
			}
		});
		th3.start();



		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("main " + i); //내부적으로 생성된 이름 반환
		}
		System.out.println("main() 함수 END");
	}

}
