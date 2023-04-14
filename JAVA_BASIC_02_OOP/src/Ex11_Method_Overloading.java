import java.util.Arrays;

/*
OOP 객체 지향 프로그래밍 (여러개의 작은 조각(작은 설계도) 만들어서 조합(큰 설계도)하는 행위)
>> 설계도 재사용(반복 사용)

1. 상속 (재사용성)
2. 캡슐화 (은닉화 >> private 사용 >> getter, setter로 간접제어)
3. 다형성 : 하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것

>> method >> overloading (오버로딩)
>> 하나의 이름으로 여러가지 기능을 하는 함수 
ex) System.out.println(); 함수 >> 이름은 println 으로 같지만 기능은 parameter의 개수,타입에 따라서 여러갯~
1. 오버로딩을 사용하면 성능향상은 없음(컴파일러가 힘듬)
2. 그저 편할라고..
3. 그러나 같은 이름으로 오버로딩해서 같은 기능을 갖는 함수를 여러개 개발자를 편하게 해줌니다(개발자가 편함)

문법)
1. 함수의 이름은 같고 parameter 개수나 타입을 달리해서 만든다.
1.1 함수의 이름 동일
1.2 parameter 개수, 타입을 달리하는 것이 오버로딩
1.3 return type은 오버로딩의 판단기준이 아님니다
1.4 parameter의 순서가 달라도 다른 것으로 봅미다

 */

class Human {
	String name;
	int age;
	
}

class OverT{
	int add(int i) {
		return 100+i;
	}
	
	int add(int i, int j) {
		return i+j;
	}
	
	String add(String str) {
		return str;
	}
	
	String add(String s, int i) {
		return "hello"+s;
	}
	
	String add(int i, String s) {
		return "hello"+s;
	}
	
	//POINT
	void add(Human human) {
		human.age++;
		human.name = "홍길동";
	}
	
}


public class Ex11_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverT overt = new OverT();
		overt.add(10,10); // parameter 정의가 일치하는 add함수를 자동으로 찾아냄
		overt.add("a");
		
		//1.
		Human h = new Human();
		overt.add(h);
		
		//2.
		overt.add(new Human());
		
	}
	

}
