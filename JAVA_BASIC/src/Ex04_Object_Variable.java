/*
 클래스 == 설계도 == 데이터 타입
 
 tip)
 하나의 물리적인 java 파일에 여러개의 클래스 생성가능 (but 연습할 때만..)
 원칙적인 방법은 : package > kr.or.kosa.utils.Apt 또는 kr.or.kosa.model.Apt에 클래스를 만들어요..
 
 
 */

class Apt { //설계도 == 데이터 타입 (작은 타입을 여러개 가지고 있는 큰타입)
			//설계도는 구체화 되지 않으면 아무런 의미가 없다.
			//목적 : Apt라는 설계도를 가지고 같은 아파트를 원하는 만큼 반복적으로 짓겠다..(memory상에)
			//new 라는 연산자를 통해서 Apt 설계도를 토대로 새 아파트를 만든다.
	String aptColor;
	
}


public class Ex04_Object_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apt apt; //apt 변수는 Apt 객체의 주소를 담을 수 있는 변수
		apt = new Apt(); //()는 생성자를 호출하는 것이다.
		//heap memory에 아파트가 한채 만들어지고 그 주소가 apt1 변수에 할당된다.
		//apt는 참조값을 가지고있다.
		System.out.println("apt 주소 : "+ apt); //Apt@75a1cd57
		//Apt(클래스이름) + @(문자) + 주소값(16진수) 으로 결합된 주소가 return
		
		Apt apt2 = new Apt();
		System.out.println("apt와 apt2의 주소는 같은가? " +(apt==apt2));
		System.out.println("apt2의 주소 " + apt2);
		
		Apt apt3 = apt2; // apt3에 apt2의 주소값을 할당
		//apt3와 apt2는 같은 주소를 갖는가? -> true
		
		apt2.aptColor = "Red"; //apt2.aptColor의 색을 Red로 할당
		System.out.println(apt3.aptColor); // apt3의 apt3.aptColor도 Red가 됨
		
		//동작원리
		/*
		 Ex04_Object_Variable.java >> javac.exe > Ex04_Object_Variable.class (실행파일)
		 >> java Ex04_Object_Variable \n
		 >> 자바가 동작함 >> OS에게 메모리 요구 >> 메모리를 용도에 맞게 구획정리 >> 각각의 메모리 영역에 자원을 할당함
		 >> 프로그램 종료 >> 사용했던 Memory 반환 >> 리얼로 종료..
		 이 과정이 이클립스에서 코드를 실행하면 나오는 과정..
		 1. main 함수 실행.. 반드시 local variable 초기화
		 2. main이 시작점이다..
		 
		 
		 */
		
		
	}

}
