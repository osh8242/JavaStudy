import kr.or.kosa.Emp;

public class Ex02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int value; //4byte 크기의 int형 변수 value 선언
		value = 100; // value에 값을 할당
		
		int age = 99; // 선언과 할당을 동시에
		
		//초기화 : 변수에 최초로 값을 부여하는 것
		
		//main 함수 -> stack
		//int value -> stack의 main 영역의 지역변수 (main과 생사를 함께함)
		//int age -> stack의 main 영역
		
		int num=0; //Local Variable must be initialized before it is used.
		System.out.println(num);
		//지역변수는 사용시 반드시 초기화를 해야한다..
		
		Emp emp; // stack의 main 영역에 지역변수. emp를 가리키는 주소가 할당됨. 초기화 아직안함.
		emp = new Emp(); // emp의 초기화. new 연산자 메모리에 올리는 작업
		//초기화 작업 >> heap에 생성된 객체의 주소값(0xff..번지)
		//설계도(class)를 토대로 새로운 emp를 만든다.(메모리에)
		
		System.out.println(emp); //kr.or.kosa.Emp@626b2d4a
		
		// .은 주소를 찾아가는 연산자
		System.out.println(emp.empno); //default 값 0이 출력됨
		
		int a, b, c; // 같은 타입의 변수를 나열 -> 같은 타입이 반복되는 걸 선호하지않음
		// -> 배열(Array) int[]로 가야함
		a=100;
		b=200;
		c=300; //초기화하여 이제서는 변수 사용가능
		
		int date=100;
		//int date; // 같은 지역 내에서 같은 변수명은 존재할 수 없음
		
		int result = a+b; //초기화임
		System.out.println("result 값은 " + result + "입니다^^");
		
	}//main 종료

}
