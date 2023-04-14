/*
static 초기화
1. static variable (객체 간) 공유 자원 : 객체마다 같은 값을 공유할 거야~~~~~
2. instance variable : 생성되는 객체마다 다른 값을 가지게 하겠다.

두 자원은 default 값이 있다
초기화는 필요에 따라 할 수도 있고 안할 수도 있고~


*/
class Test2 {
	static int cv = 10; //초기화
	static int cv2; // default값 (실수 0.0, 정수 0, 문자 null)
	int iv = 9;
	//3. 이 녀석들(instance variable)은 default 값이 있어서 초기화를 하지 않아도 사용하는 데 문제 없다...!!!
	// local variable은 반드시 선언하고 초기화한 뒤에 사용할 수 있음
	
	//1. static 자원 초기화		static {}
	//static 초기화 블럭
	static {
		
		cv = 1111;
		//static 초기화 블럭이 실행되는 시점은 
		//이 클래스가 갖고 있는 모든 static 자원이 메모리에 올라간 직후 자동 호출이라서
		//여기서는 조작된 표현이 가능...! (for나 while 같은 제어문도 가능함니다!!!!)
		cv2 = cv + 2222;
	} // 얘는 가끔 쓰입니당~
	
	//2. 일반 자원. member field 초기화 블럭 { }
	{
		//int iv=9; // 이게 메모리에 올라감 >> 선행 >> Test2 test2 = new Test2();
		// { } 초기화 블럭 언제..? member field가 heap에 올라간 직후
		// instance 변수는 선언과 초기화만 가능하지. 원래 제어문, 연산처리를 할 수 없으나
		// {}에서는 가능하다.. (제어, 연산처리 용도)
		System.out.println("초기화 블럭 실행");
		if(iv<10) {iv=10000;}
		
	} // 생성자 함수와 기능이 동일하기 때문에 잘 쓰이지 않습니당
}


public class Ex06_Static_Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
		
		Test2 test2 = new Test2();
		
	}

}
