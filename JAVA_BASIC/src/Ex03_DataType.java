/*
 자바가 제공하는 기본 타입(원시타입)은 8가지이다.
 8가지 타입은 값을 저장하는 타입
숫자 --- 정수 --- 음의 정수		byte(8bit) -128~127
			---	0			char : 한문자(내부적으로는 정수)
			---	양의 정수		영문자, 특수문자, 공백은 1byte이고 한글은 2byte.
							협의(국제) >> 모든 문자는 2byte로 하자 >> 표준화 >> unicode
							>> ASCII CODE TABLE
							EX. char c = 'A';
							short 호환성 때문에 쓰지 않음.
							int (4byte -21.47억~21.47억) <- **정수 리터럴의 기본타입은 int
							long
    --- 실수			float (4byte) : 7자리 정도의 소수 표현이 가능하다
    				double (8byte) : 16자리 정도의 소수 표현이 가능하다
    				정밀도가 높다(표현범위가 더 넓다) **실수 리터럴의 기본 타입은 double
 논리			(boolean)참, 거짓을 표현하는 타입 (true, false) 판단
 
 요약...
 정수 int, 실수 double 타입을 사용하면 별 문제가 없다.
 
 가장 많이 사용되는 타입(String)은 class 타입이다..**
 String str = "홍길동";
 String 타입은 문자열을 담을 수 있습니다.
 class 타입이기에 원래는.. String str = new String("홍길동");
 그러나 초급자로서 8가지 기본타입 + @인 것처럼 여기자.

 자바타입은
 1. 값 타입 : 8+1개
 2. 참조 타입 : (주소값을 저장) class, interface, array, enum...
 
 [정수값을 표기하는 방법]
 100	십진수
 0x2a	16진수
 0123	8진수
 0b1101	2진수
 123L or 123l	리터럴 long 타입 십진수**
 0x2aL or 0x2al	리터럴 long 타입 16진수
 
 [실수값을 표기하는 방법]
 3.14
 123.4
 123.4F or 123.4f
 
 [문자값을 표기하는 방법]
 'A' or '가'
 '\u0065'
 
 [진리값 표기하는 방법]
 true
 false
 
 [문자열을 표기하는 방법]
 "홍길동"
 "ABCD"
 
 
 
 
 */



public class Ex03_DataType {
	public static void main(String[] args) {
		//int ( -21.47억~21.47억)
		int num = 100000000;
		System.out.println("num : "+num);
		//int num2 = 100000000000; // The literal 100000000000 of type int is out of range
		//literal은 사용자가 직접 입력한 값 (있는 그대로의 값)
		//literal은 4byte의 크기로 약 21.47억까지밖에 표현하지 못하므로 컴파일오류가 됨
		
		//int에서 long으로 바꿔주면 된다...
		//사용자가 입력하는 값의 타입은 int로 간주되므로 long으로 바꾸어 입력해한다.
		//숫자 뒤에 L을 붙임으로써 long 타입으로 변경할 수 있다.
		long num2 = 100000000000l;
		System.out.println("num2 : " +num2);
		
		long num3 = 100; // 속지 않으려면 값을 보지 말고 타입을 봐야한다(literal도 봐야함)
						 // long num3 = (long)100
						 // 암시적 형변환이 일어남(complier가 자동으로 큰 타입에 작은 타입을 넣는 것은 형변환 해준다)
						 // 작은 타입 잇는 갑슬 큰 타이베 넣ㄴㄴ거슨ㅇㄴ 당그니잊
		//해결하세요
		//손실이 발생하더라도 담아보겠다
		//int num4 = 100000000000; // The literal 100000000000 of type int is out of range
		//int num4 = 100000000000L; // Type mismatch: cannot convert from long to int
		int num4 = (int)100000000000L; // (int): 명시적 형변환, casting
		System.out.println("num4 : " + num4); // 그러나 알 수 없는 쓰레기 값으로 변환된다... 의미가 없다...
		//정상적인 해결방법이 아니다.. 내가 원하는 값이 아님;;;
		
		//데이터 손실이 없어요~~ 그러나 캐스팅 형변환이므로 데이터 손실이 있을 수도 있음....
		//1. 강제 형변환
		int num5 = (int)1000L;
		System.out.println("num5 : " + num5);
		
		//2. 담는 그릇 (변수)를 크게 만들기
		long num6 = 1000L;
		System.out.println("num6 : " + num5);
		
		//char(2byte) : 한 문자를 표현하기 위해서 만든 타입 >> 0~65535까지
		//영문자, 특수문자, 공백, 한글 >>>> 한문자로 표현하는 표준화
		//한문자 >> 'A', '가', ' '
		//문자열 >> "abcd", >> String str="abcd";
		
		char ch = '가';
		System.out.println("한 문자 : " + ch);
		//char ch2 = '가나'; 예외 발생 (컴파일도 안되요) ... 한문자만 가능해요..
		ch = 'a';
		ch = 'A';
		
		//char는 정수타입(문자를 저장한다곤 하지만 실제로는 숫자로 저장되고 코드표를 통해 문자로 치환됨)
		//아스키 코드표에서 십진수값과 문자값을 비교해 보세요
		
		int chint = ch;
		System.out.println("ch라는 문자열을 숫자로 보면 "+chint);
		
		// int chint = ch;
		//내부적으로 암묵적으로 ㅈ동 형변환이 발생했어요(자동으로)
		//int chint = (int)ch;
		
		char chint2 = 'a';
		System.out.println(chint2);
		int intch2 = (int)chint2; // 사용자가 직접 형변환해도 문제없다.
		
		int intch3 = 65;
		//char chint3 = intch3; // Type mismatch: cannot convert from int to char
		
		//1. 해결방법 (명시적 형변환) >> 데이터 손실 발생가능
		// char chint3 = (char) intch3;
		
		//2. 그릇의 크기를 크게 (그러나 사용자의 의도와는 다름...)
		//int chint3 = intch3;
		
		//3. 
		//char chint3 = intch3; >> 위로 올라가서 char intch3 = 65;로 바꿔버림..^^;;;; 
		
		char chint3 = (char) intch3;
		System.out.println("chint3이 가지는 문자값 : "+chint3);
		
		/*
		1. 할당에 있어서 값을 보지 말고 값이 가지는 타입을 보자
		1.1 literal 값에 대하여
		1.1.1 정수 literal의 기본 타입은 int
		1.1.2 실수 literal의 기본 타입은 double
		
		2. 암시적 형변환, 명시적 형변환
		2.1 큰타입에다가 작은 타입의 값을 집어넣는 것은 암시적 형변환을 통해서 자동으로 허용됨
		2.2 작은 타입에다가 큰 타입의 값을 집어넣는 것은
			명시적 형변환을 해주어야하여 그럼에도 불구하고 값이 overflow되면 의미없는 쓰레기값으로 변환된다**
		2.2.1 접미사 L, l, (int), (long)
			강제적 형변환은 데이터 손실을 감수할 수 있어야한다.
			ex) char c = (char) int 범위값 .... 손실 발생.....
			
		

*/
		
		//String 타입 (8+1)인 기본 값타입.. 사실은 class 타입이지만 기본 타입처럼 쓸 수 있게 해주었다)
		//문자열 >> 문자의 집합 >> 문자의 배열 >> 문자열
		//int, long 처럼 동일하게 사용가능
		
		String name = "홍길동";
		name = "오승환";
		
		String color = "red";
		color = color + " 방가방가"; // 오라클에서는 +가 산술연산만 한다 >> 결합연산자는 ||
		System.out.println(color);
		
		//Tip
		//연산자는 언어마다 약간의 표현이 다르다

		//자바에서 특수문자 처리하기
		//char sing = ''; 한문자 공백, 영문, 한글 등
		//char sing = '''; // Invalid character constant
		//이스케이프 문자 : 특정 문자 앞에 \를 붙이면 다음 입력값은 data로 인식함
		char sing = '\'';
		System.out.println(sing);

		//Quiz) 홍"길"동   이라는 문자열을 출력하고 싶음
		String username = "홍\"길\"동";
		System.out.println(username);
		
		String str1 = "1000";
		String str2 = "10";
		String result = str1 + str2; // 문자열에서의 +는 결합연산자로써 작용함
		System.out.println("result : "+result);
		// System.out.println 의 종류가 많음 -> 오버로딩, 오버라이딩
		
		System.out.println("100"+100); //100100
		System.out.println(100+"100"); //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+(100+"100")); //100100100
		System.out.println(100+"100"+100); //100100100
		
		//Quiz 경로 "C:\Temp" 문자열을 String 변수에 담아서 출력하기
		System.out.println("\"C:\\Temp\"");
		
		// \t는 탭기능, \n은 다음줄
		String path = "C:\\\tT\te\tm\tp\nHelloWorld!!";
		System.out.println(path);
		
		//byte : 네트워크 데이터 교환 ... 파일처리 .... 이미지 read >> Array
		//long : 숫자가 크므로 금융, 화폐 쪽에서 주로 사용..
		
		//실수형 (부동소수점)
		//float 4byte
		//double 8byte
		//***실수 literal은 기본이 int이고, 문자 literal은 기본이 double
		
		//실수는 거의 대부분 기본적으로 double을 사용하지만 float을 사용할 일이 있으면
		//명시적으로 접미사 f를 붙여서 사용한다.
		float f = 3.14f;
		float f2 = (float) 3.14 ; // 데이터 손실이 일어날 수 있음
		
		//현명한 개발자
		//처음부터 타입을 크게 잡아서 사용..
		double d = 3.14;
		
		//1. int 4byte, float 4byte 실수인 double의 표현범위가 크다
		//2. float과 double 중에서 double이 더 정밀한 표현 >> double
		
		float data = 1.123456789f;
		System.out.println("float data\n"+ "1.123456789"+"\n"+data);
		// 대략적으로 소수점 7번째 자리까지 반올림해서 보여줌
		
		double data2 = 1.123456789123456789;
		System.out.println("doblue data2\n"+ "1.123456789123456789"+"\n" + data2);
		
		//Quiz 1)
		//double data3 = 100;
		//결과값은? -> 100 // because 리터럴 100은 int로 double보다 크기가 작아서 자동 형변환됨
		
		//Quiz 2)
		double data4 = 100;
		int number = 100;
		//int result2 = data4 + number; 오류남.. double형 + int형 은 double형
		//해결방법은?
		//1. int result2 = (int)data4 + number; // 큰 것은 작은 것으로 강제형변환
		2. double result2 = data4 + number; // 담는 그릇을 더 큰 형식으로 변환
		System.out.println(result2);
		
		//Quiz 3)
		int number2 = 100;
		//byte b2 = number2; // type mismatch
		//byte b2 = (byte)number2; // 캐스팅(강제 형변환)
		//int b2 = number2;
		
		//Today Point
		//1. 큰 타입과 작은 타입의 연산 결과는 큰타입
		//2. 타입간 변환 >> 변수가 가지는 값을 보지 말고 변수의 타입으로 판단하자
		//3. 명시적(강제적) 형변환을 할 때에는 데이터 손실을 고민하자
		
		int data5 = 100;
		byte b3 = (byte)data5; // 명시적(강제적) 형변환 : Casting
		
		byte b4 = 20;
		int data5 = b4; // 컴파일러가 내부적으로 암시적 형변환
		int data6 = (int)b4; // 강제적 형변환
		
		
		
		
		
		
		
		
	}
}
