/*
static member field : 객체간 공유 자원
static method : ex) public static void main (첫시간에...)

1. 객체 생성없이 사용...
2. 편하게 빠르게...
3. 많이 사용하니까~~ 걍 클래스 영역에 static으로 올려두고 걍 맘대로 부름~~~ ex) System.out.println();
4. 설계도 : 자원을 많이 사용할 것 같아.. 근데 new 하고 쓰는게 귀찮을 것 같네요..
>> 편하게 쓰게 하자 >> new 없이 쓰게 하자(코드 간소화) >> static을 붙여서 설계하믄 된다


 */

class StaticClass {
	int iv;
	
	static int cv;
	
	static void print() {
		System.out.println("Static print 함수를 호출하셨습니다");
		//static 함수
		//일반자원 int iv; 은 static 함수가 일반자원보다 먼저 호출되기 때문에 걍 쓰기엔 어렵^^;;
	}
	
	void printIv() {
		//일반함수
		//static int cv;
		//why : static 자원은 객체 생성 이전에 memory에 로드 되기때문에
		cv = 100;
	}	
}
//공존의 관계 : 생성시점에 대한 해결 제시
//상호 호출, 제어시 오류를 줄이는 방법.. >> static은 static끼리 일반은 일반끼리 놀게하자
// 그럼에도 static과 일반을 상호사용하려면 생성시점에 대한 고민을 하고 써야함~!

public class Ex08_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.print();
		
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv);
	}
	
	

}
