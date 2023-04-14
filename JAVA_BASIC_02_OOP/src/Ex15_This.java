/*
	살이 찌면 입에도 살이 찐다 -> 입안을 자주 깨문다
this(이것)
1. 객체 자신을 가리키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
	>> 인스턴스 자신을 참조변수로 보는 형태, 인스턴스의 주소가 저장되어있당~!
2. this 객체 자신 (주소) 활용처: 생성자 호출 (원칙적으로 생성자 객체 생성시 한개 호출)
그런데 this를 활용하면 예외적으로 this를 통해서 여러개의 생성자를 호출할 수 있당~!





 */

class Test5 {//extends Object {
	int i;
	int j;
	Test5(){//생성자
		
	}
	Test5(int i , int j){
		this.i = i;
		this.j = j;
	}
}

class Book2 {
	String bookName;
	
//	Book2(String name){
//		bookName=name; // 코드 좀 이쁘게 >> 가독성
//	}
	Book2(String bookName){
		this.bookName = bookName;
	}
}

//Today Point
//생성자를 호출하는 this (중복코드 감소 가능)

class Socar{
	String color;
	String gearType;
	int door;
	Socar(){ //기본 설정
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	};
	Socar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void socarPrint() {
		System.out.println(this.color + " , " + this.gearType + ", " + this.door);
	}
	
}

public class Ex15_This {

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		
		Socar socar = new Socar();
		socar.socarPrint();
		
		Socar socar2 = new Socar("blue", "manual", 2);
		socar2.socarPrint();
	}

}
