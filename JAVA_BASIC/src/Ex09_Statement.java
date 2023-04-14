import java.util.Scanner;

public class Ex09_Statement {

	public static void main(String[] args) {
		/*
		 * -제어문 1. 조건문 : if(3가지), switch(조건) { case 값 : ... } 2. 반복문 : for(){}, 개선된 for,
		 * while(){}, do{}while() for문은 반복횟수가 명확, while은 명확치않음 3. 분기문 : break(블럭탈출),
		 * continue(아래 구문 skip)
		 * 
		 * 
		 */

//		int count = 0;
//		if (count < 1)
//			System.out.println("true"); // 단일 if문 : {}생략가능
//		if (count < 1) {
//			System.out.println("true");
//		}
//
//		char data = 'A';
//		switch (data) {
//		case 'A':
//			System.out.println("문자가 같아요♥");
//			break;
//		case 'B':
//			System.out.println("문자가 같지 않아요");
//			break;
//		default:
//			System.out.println("나머지 처리");
//		}
//
//		// for문
//		// 1~100까지의 합
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.printf("1부터 100까지의 합은 %d♡\n", sum);
//
//		// 1부터5까지의 합
//		// for문과 while 쓰지말고..
//		// 공식을 쓰는게 가장 좋다..;;
//
//		// 1부터 10까지의 홀수 합
//		// 단 for문안에 if문을 하지마세요
//
//		sum = 0;
//		for (int i = 1; i <= 10; i += 2) {
//			sum += i;
//		} // 홀수의 합 공식은 (int)n/2의 제곱이다
//		System.out.println(sum);
//
//		// for문과 if문을 사용해서 1~1000까지의 짝수의 합을 구하세요
//		sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("1부터 1000까지의 합 : " + sum);
//		System.out.println("1부터 1000까지의 합 : " + 1000 * (1000 + 2) / 4);

//		int unit = 10000;
//		int num = 0;
//		int sw = 0;
//		int money = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("분류를 원하는 금액을 입력하세요 : ");
//		money = sc.nextInt();
//		while(unit >= 1) {
//			num = (int)(money/unit);
//			System.out.println("화폐단위 " + unit + " : "+ num+"개");
//			money -= unit*num;
//			switch(sw) {
//				case 1: unit /= 5; sw = 0; break;
//				case 0: unit /= 2; sw = 1;
//			}
//		}
		
		
		// 초급자 구구단 못하면...ㅠㅠ
		// 중첩 for문
		// 행과 열
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//100부터 0까지의 출력 (시작값이 100)
		for (int i = 100 ; i >= 0 ; i--) {
			System.out.printf("%d \t",i);
			if (i%10==0) {
				System.out.println();
			}
		}
		
		

	}

}
