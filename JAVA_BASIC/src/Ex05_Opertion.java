OF
public class Ex05_Opertion {

	public static void main(String[] args) {
		//연산자 (산술, 논리, 관계)
		int result = 100 / 100;
		System.out.println("result : "+result);
		
		result = 13/2;
		System.out.println("result : " + result);
		
		//나머지를 구하는 연산자 %
		result = 144%10;
		System.out.println("result : "+ result);
		
		//증가, 감소 (증가감 연산자 : ++, -- )
		int i = 10;
		++i; // 전치증가
		System.out.println("i : "+i);
		i++; // 후치증가
		System.out.println("i : "+ i);
		//다른 것과 결합되지 않은 전치, 후치 증가는 구분의 의미가 없다
		
		//today point (증가감 연산자와 다른 연산이 결합되면...)
		int i2 = 5;
		int j2 = 4;
		int reuslt2 = i2 + ++j2;
		
		byte b=100;
		byte b2=1;
		
		// byte b3 = b + b2; // type mismatch error
		//자바는 연산시 기본적으로 4byte 공간을 만들고 그 공간에서 값을 연산한다 (int + int 형태로 계산되었음)
		//따라서..//
		byte b3 = (byte)(b + b2);
		System.out.println("b3 : "+b3);
		
		/* Key Point
		1. 정수의 연산은 [int] 타입으로 변환 후 처리된다.
		ex) byte + short >> 컴파일러가 내부적으로 값들을 int 방에 넣고 처리하므로 >> int + int 처리로 반환되어 int로 나옴
		ex) char + char >> 컴파일러가 내부적으로 int + int 처리
		정수의 연산에서 int 보다 작은 타입들은 내부적으로 모두 int로 바꾸어서 연산 처리 된다.
		정수에서 long은 예외... long은 long으로 연산됨.
		char, short, byte는 int로 전환되어 처리됨.
		ex) char + int >> int
			int + int >> int
			int + long >> long (예외)
		
		2. 정수 + 실수 >> 타입의 크기와 상관없이 실수로 맞춰짐 (because 실수 타입이 더 크다)
			
		 */
		
		long lo = 10000000000l;
		float fo = 1.2f; // 기본적으로 실수는 double이므로 f를 붙여야함..
		// long result3 = lo + fo; // long + fo 이므로 float 타입이 됨. (실수 타입이 정수 타입을 항상 덮어씀)
		// long result3 = (long) (lo + fo) ; 강제로 float 을 long 으로 변환
		float result3 = lo + fo ; 
		
		char c2 = '!';
		char c3 = '!';
		int result4 = c2 + c3;
		System.out.println("result4 : "+ result4);
		
		//학습이력 : 변수 >> 타입(자료형) >> 연산(산술, 논리, 관계) >> 제어문(if, for, while ...)
		//제어문
		int sum = 0; // sum이라는 local variable을 선언하고 초기화함.
		for ( int j=0; j<=100; j++) {
			if(j%2==0) { // 얌마! 너 짝수냐?
				sum += j; // sum = sum + j...				
			}
		}
		System.out.println("sum : " + sum);

		// == 연산자 : 값을 비교하는 연산자(타입을 비교하진 않음)
		if(10 == 10.0f) {
			System.out.println("true");	
		} else { System.out.println("false");}
		
		// != 부정연산자 : 
		if('A' != 65){
			System.out.println("true");	
		} else { System.out.println("false");}
		
		//Today Point
		//연산자 중에서 제어문 역할 (조건, 반복)
		//삼항연산자
		int p = 10;
		int k = -10;
		int result5 = (p==k) ? 1 : 0;
		System.out.println(result5);
		
		// cf) === 연산자 (값과 타입까지 같은지 판별하는 연산자, 자바스크립트에서만..)
		
		int result6 = 0;
		if(p == k) {
			result6 = 1;
		} else { result6 = 0; }
		System.out.println(result6);
		
		/*
		 진리표 (논리연산)
		 0 : 거짓 (false)
		 1 : 참 (true)
		 
		 OR연산, AND연산
		 
		 DB쿼리 oracle)
		 select * from emp where job='IT' and sal > 3000
		 select * from emp where job='IT' or sal > 3000
		 
		 			AND		OR
		 0   0		0		0
		 0   1		0		1
		 1   0		0		1
		 1   1		0		1
		   
		 연산자 비트 연산 ( | : or연산 ............... & : and연산 )
		 || 논리연산 (OR), && 논리연산 (AND)
		 
		 */
		
		int x=3;
		int y=5;
		//비트 연산 ( 십진수를 이진수로 바꾸어서 연산함)
		System.out.println("x|y : " + (x|y)); // 비트연산으로 0011과 0101의 or연산으로 0111이 됨.
		
		System.out.println("x & y : " + (x&y)); // 0001
		
		// 비트 연산 (영상 처리, 판독 등에서 주로 쓰임)
		/*
		 today Point
		 && : AND 연산
		 || : OR 연산
		 if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A} else {B}
		 if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) {A} else {B}
		 &&, || 연산자 : short circuit. 거짓, 참이 하나만 나와도 나머지는 판단하지 않아도 되므로 이것을 이용해서 잘 짜면
		 코드 실행속도가 빠를 수 있다.
		 */
		
		int data = 90;
		switch (data) {
			case 100 : {System.out.println("100입니다"); break;}
			case 90 : {System.out.println("90입니다"); break;}
			case 80 : {System.out.println("80입니다"); break;}
			case 70 : {System.out.println("70입니다"); break;}
			case 60 : {System.out.println("60입니다"); break;}
			default : {System.out.println("안타깝지만.. 탈락입니다..");}
		}
		
		int month = 13; //달을 데이터로 제공
		String res = ""; // 빈문자열로 초기화
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println(month+"월은 31일까지 있습니다"); break;
			case 2 : System.out.println(month+"월은 28일까지 있습니다. 윤년이 아니라면..."); break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println(month+ "월은 30일까지 있습니다");break;
			default : System.out.println("당신은 머리가 있습니까?");	
		}
		
		//난수 (랜덤값, 임의의 추출값)을 얻기를 원해요...
		//쉬운 방법 : 구글 검색
		//자바를 만들이는 자습서 (API 문서) 자원에 설명과 사용방법 (Englisg)
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//패키지 기준 (폴더별로 자원을 모아모아..뀽)
		//java.lang.Math 클래스를 활용하면 여러가지 수학적인 기능 사용...
		//java.lang.*; 은 생략.. 애는 default로 열려있다..
		
		//public static double random();
		//double greater than or equal to 0.0 and less than 1.0
		//결과 : 0.0 <= random() <1.0
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random()*10 : " + Math.random()*10);
		System.out.println((int)(Math.random()*10) +1);
		
		System.out.println(((int)(Math.random()*10) +1)*100);
		
		int score = ((int)(Math.random()*10) +1)*100;
		String present = "";
		switch (score) {
		case 1000: {present += "TV, ";}
		case 900: {present += "노트북, ";}
		case 800: {present += "냉장고, ";}
		case 700: {present += "한우세트, ";}
		case 600: {present += "휴지"; break;}
		default: {present = "칫솔";}			
		}
		System.out.println("점수는 "+score+"입니다");
		System.out.println("경품은 "+present+"입니다");
		
		//switch(조건)정수만.. 아니죠/
		// 조건식은 "문자열"도 가능, '문자'도 가능
		

		
	}
}
