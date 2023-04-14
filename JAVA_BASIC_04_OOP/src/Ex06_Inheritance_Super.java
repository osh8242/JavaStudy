/*
객체 한개만 가지고 놀 때는
this : 객체 자신을 가리키는 this (this.empno, this.ename)
this : 생성자를 호출하는 this (this(100,"red"))

상속관계
부모, 자식
super(상속관계에서 자식이 부모의 자원에 접근하는 주소를 제공함) : 상속관계에서 부모에 접근 (super)
1. super : 상속관계에서 부모자원에 접근
2. super : 상속관계에서 부모의 생성자를 호출

Tip)
C# : base()
JAVA : super()

 */

class Base {
	String basename;

	Base() {
		System.out.println("부모 클래스의 기본 생성자");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + basename);
	}
	
	void method() {
		System.out.println("부모 method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {// 생성자
		System.out.println("자식 클래스의 기본 생성자");
	}

	Derived(String dname) {
		//부모의 생성자를 호출하고 싶음니다 (super)
		super(dname); //부모도 오버로딩된 생성자를 호출
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	@Override
	void method() {
		// TODO Auto-generated method stub
		// super.method();
		System.out.println("부모 함수 재정의");
	}
	
	void pMethod() {
		//재정의한 부모 메소드를 사용하고 싶다면 
		//자식 객체 안에서 super.를 사용하여 간접적으로 호출할 수 있다
		//그러나 안쓸꺼라고 생각하고 재정의했는데 다시 사용할 이유가^^;;
		//다시 부모꺼 쓸꺼였음 이미 다른 이름으로 만들었겠지요~
		super.method();
	}
}

public class Ex06_Inheritance_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Derived d = new Derived();
		Derived d = new Derived("홍길동");
		d.method();
	}

}
