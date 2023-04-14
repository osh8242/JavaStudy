import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
		간단한 사칙연산기 (+ - * / )
		입력값 3개 (입력값은 nextLine()) 받아서 필요하다면 숫자변환
		목적 Integer.parseInt(), **java equals() 활용 : 문자열의 비교**
		
		입력값:(숫자)
		입력값:(+ - * /)
		입력값:(숫자)
		연산결과:200
		-------------
		>입력값:100		
		>입력값(기호): -		
		>입력값:100		
		>연산결과 :0
		
		hint)		
		■ if문은 조건값이 boolean형, 		
		■ switch문은 정수형(byte, short, int)과 문자형(char), 문자열(String)		
		■ long, boolean, float, double형 사용 불가	
		
		********************문자열(String)의 비교는 ==을 사용하지말고 equals()를 사용해라!!!!!!***************
		
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1:");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자:");
		String op = sc.nextLine();
		System.out.print("숫자2:");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int result=0;

		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println("부정확한 값을 입력하셨습니다");
		}
		System.out.println("결과값은 : " + result);
		
	}

}
