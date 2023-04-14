/*
인터페이스 : 약속, 규칙, 규약, 표준을 만드는 것..

1. 스스로 객체 생성 불가능 (New 연산자를 사용불가)
1.1 두놈의 차이점 : 추상 클래스(완성+미완성), 인터페이스(모든 것이 미완성)

2. 사용
추상클래스 extends
인터페이스 implements

class Car extends AbClass { }
class Car implements Ia{ }

둘다 추상자원을 가지고 있다 >> 강제적 구현이 목적(재정의)

추상클래스 인터페이스 다른 점은?
3. 추상클래스는 완성된 코드도 일부 가질 수 있음,
	그러나 인터페이스는 전체가 미완성 코드(but 상수와 디폴트 함수는 제외)
	(인터페이스의 버전업 시 생기는 문제를 방지하기 위해서 디폴트 함수가 구현되어있긴함)
3.1 원칙적으로는 클래스는 다중상속하기 위해선 계층적 상속 또는 포함관계로 나타내야함
	그러나 인터페이스는 [다중 구현]이 가능하다 >> 여러개의 작은 인터페이스를 모아모아서... 쓰려하기 때문에
	다중 구현이 가능함~~~
	Ia, Ib, Ic
	class Test extends Object implements Ia, Ib, Ic
	
	Tip) 인터페이스와 인터페이스는 서로간 상속이 가능
	작은 규약들을 서로 상속해서 큰 규약(여러 규약)으로 만듬
	
4. 인터페이스 (상수를 제외한 나머지는 미완성 추상함수) >> JDK8부터는 default, static 기능 추가

초급개발자의 시선으로 보면,,
1.인터페이스를 '다형성' 관점으로 접근 (인터페이스는 모든 타입 부모이다********)
2.서로 연관성이 없는 클래스를 하나로 묶어주는 역할 (같은 부모(인터페이스)를 갖게함으로써)
3.JAVA API 수많은 인터페이스를 생성해 놓았어요 (사용이라는 관점에서)
4.인터페이스(~able 형태로 네이밍) : 날 수 있는, 수리할 수 있는,
5.인터페이스는 객체간 연결 고리 (객체간 소통의 역할 == 다형성)

Interface
1. 실제 구현부를 가지고 있지않다 >> 실행블럭이 없다 (예외. 상수, 디폴트함수)
2. interface Ia { void move(int x, int y); } >> 구현은 알아서... 재정의
3. JAVA API >> Collection의 시작은 인터페이스 Ex) List, Set, Map

interface 생성방법
1. 상수 구현 가능
모든 자원이 public static final이다
 >> '표준이고 규약이므로' private이면 안되고 정적(static)해야하며 변하지않는(final) 값이어야한다.
 >> 따라서 컴파일러가 알아서 public static final을 붙인다.

2. 추상함수
public abstract void run(); >> void run()

종류
interface Aable { } // 아무 자원도 없어도 괜찮아요 (그래도 같은 가족으로 묶는 기능을 할 수도 있음)
interface Aable { int NUM=10; }
interface Aable { void run(); } 
 */

interface Ia{
	public static final int AGE = 100; // 어차피 컴파일러가 public static final 을 붙임..
	String GENDER = "남"; // 어차피 컴파일러가 public static final 을 붙임..
	
	public abstract String print(); // 구현부 { } 가 없음,,  어차피 컴파일러가 public abstract를 붙임
	void message(String str); // { },, 어차피 컴파일러가 public abstract를 붙임
}

interface Ib {
	int AGE = 10;
	void info();
	String val(String s);
}

class Test2 extends Object implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test3 extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}




public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Ia ia = t2; // 부모는 자식객체의 주소를 가질 수 있다*******
		ia.message("재정의"); // 인터페이스가 재정의된 자원을 호출
		System.out.println(ia.GENDER);
		
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ia2.AGE);
		System.out.println(ib2.val(null));
		System.out.println("ib2.info()");
	}

}
