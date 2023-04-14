/*
user 사용자 <> provider 제공자

class A {}
class B {}

관계 : A는 B를 사용한다.

구현방법 1. 상속(extends)
>> A extends B

구현방법 2. 포함(member field)
>> class A { B b; }
2.1 부분포함
2.2 전체포함

class B{}
class A{
	int i;
	B b; //A는 B를 사용합니다 (포함관계로)
	A(){ //생성자
		this.b=new B();
	}
}

>> main(){
	A a = new A(); // A클래스 a와 B클래스 b는 같은 운명체
	a = null;
	// b에 접근하는 방법 "a.b.자원명"
}

포함관계
>> B는 독자생성이 불가능 >> A라는 객체가 만들어지면 B도 같이 생성되는 공동 운명체
>> 공동운명체 (전체집합 composition)
>> ex) 자동차-엔진, 컴퓨터-cpu

class B{}
class A{
	int i;
	B b; //A는 B를 사용합니다
	A(){
		
	}
	//method
	void m(B b){
		this.b = b;
	}
}
>> main(){
	A a = new A(); //
	B b = new B();
	//필요에 따라서
	A.m(b);
	//같은 운명은 아니다
	//부분집합 관계(사용자가 사라져도 공급자가 사라지지않음)
	//ex) 노트북과 마우스, 학교와 학생 관계
}

A는 B를 사용합니다(참조) >> 포함 >> A가 B를 member field 
>> 생성을 같이 하느냐? 따로 하느냐?에 따라 전체집합이냐 부분집합이냐로 나뉘어짐
 */

interface Icall {
	void m(); // public abstract 가 생략되어있음(컴파일러가 자동으로 해줌)
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D.... Icall 인터페이스의 m()을 재정의");			
	}
	
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F.... Icall 인터페이스의 m()을 재정의");		
	}
}

//현대적인 프로그래밍 방식은 (interface 방식이 대세) >> 유연성 >> 대충 만들어도 대충...
//느슨하게 만들어라~ ( approximately 다형성) >> interface

class C {
	//이 함수의 parameter에는 Icall을 구현하고 있는 모든 객체의 주소는 올 수 있다*****
	void method(Icall ic) {
		ic.m();
	}
}

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);
	}

}
