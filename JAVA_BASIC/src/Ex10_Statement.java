import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문 (while, do ~ while)
//		int i = 10;
//		while(i >= 10) {
//			//반드시
//			//증가감을 통해서 true, false 판단
//			--i;
//			System.out.println(i);
//		}
		
		//while 1~100까지의 합
//		int j = 1;
//		int sum = 0;
//		while (j <= 100) {
//			sum += j;
//			j++;
//		}
//		System.out.println(sum);
		
		//while 문으로 구구단 맹글기
//		int i = 2;
//
//		while(i <= 9) {
//			int j = 1;
//			while ( j <= 9) {
//				System.out.printf("[%d]*[%d]=[%d] \t",i,j,i*j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		/*
		메뉴 구성
		점심 메뉴를 선택하세요
		1. 짜장
		2. 짬뽕
		3번 입력값 하면 잘못된 입력입니다.....
		다시 메뉴를 보여주어야함. (계속 대기하여 동작해야하는 경우)
		
		do {} while ()은 반드시 한번은 실행함
		
		 */

		 Scanner sc = new Scanner(System.in);
		 int inputData = 0;
		 do {
			 System.out.println("숫자 입력해 (0~9) : ");
			 inputData = Integer.parseInt(sc.nextLine());
		 }while(inputData >= 10); // while 조건 utre 계속해서 do 문을 실행
		 						  // while 조건 false do 실행하지 않음
		 System.out.println("당신이 입력한 숫자는 : "+inputData);
		
		
		
		
	}

}
