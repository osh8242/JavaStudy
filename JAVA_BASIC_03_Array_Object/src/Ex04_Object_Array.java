import java.util.Arrays;

class Person{
	String name;
	int age;
	
	//만약 사람을 만들 때 이름, 나이 강제하고 싶으면
	//Person(){} 생성자 사용
	//Person(String name, int age){this.age name = name; this.age = age;}
	void print() {
		System.out.println(this.name + " : " + this.age);
	}
}



public class Ex04_Object_Array {

	public static void main(String[] args) {
		int[] intArr = new int[10]; //0이 디폴트값
		boolean[] boolArr = new boolean[5]; //false가 디폴트값
		
		Person p = new Person(); // local 참조변수 p에는 Person이라는 클래스로 만든 새 객체의 주소를 가지고 있다
		p.name = "홍길동";
		p.age = 100;
		
		//Person 타입의 사람 3명을 만드세요
		//== heap에 객체를 3개 만들어라~!!
		Person na_eun = new Person();
		Person chang_hyun = new Person();
		Person seok_jin = new Person();
		
		Person[] persons = new Person[3]; //방을 만들고 방에 아무도 살지 않아요 Person탕ㅂ이 오는 방
		System.out.println(persons);
		System.out.println(persons[0]); //null
		System.out.println(persons[1]); //null
		System.out.println(persons[2]); //null
		//확인해보니 방이 비어져있었네용
		
		persons[0] = new Person();
		Person p5 = new Person();
		persons[1] = p5;
		
		persons[2] = new Person();
		persons[2].name = "김유신";
		persons[2].age = 100;
		
		System.out.println(persons[2].name);
		System.out.println(persons[2].age);
		
		//초급자는 유의하세요!!!
		//객체 배열은 방을 만드는 것과 방을 채우는 작업은 별도다***************************************************************
		
		//객체 배열은 방을 만드는 작업과 채우는 작업, 2가지가 필요하다
		
		//객체 배열 3가지 방법.....
		//1. int[] arr = new int[10];
		Person[] parray = new Person[10]; //
		//parray[0] >> null이 있음
		//방에 들어갈 주소도 만들어야 합니다 Person 타입과 동일
		for (int i = 0 ; i < parray.length ; i++) {
			parray[i] = new Person();
		}
		
		//2. int[]arr = new int[]{10,20,30};
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()};
		
		//3. int[] arr = {10,20,30};
		Person[] parray3 = {new Person(), new Person(), new Person()};
	}	

}
