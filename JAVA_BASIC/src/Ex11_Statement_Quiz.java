import java.util.Scanner;

public class Ex11_Statement_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메뉴를 보여주고 사용자에게 선택하도록 하는 프로그램~~~*^^* ㅡㅡ;; ㅡㅡ^ T^T ^^; O_O;; ㅡ,.ㅡ
		//원하는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여줘야함
		
		//1. 예금
		//2. 출금
		//3. 잔고
		//4. 종료

		//잔액 변수를 생성해서 초기화 balance
		//예금처리 + 누적
		//출금처리 - 누적
		//잔고조회 balance 출력
		//종료
		Scanner sc = new Scanner(System.in);
		long money = 0L;
		long balance = 123456L;
		boolean statement = true;
		int num = 0 ;
		do {
			System.out.println("원하는 메뉴번호를 입력해주세요");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고");
			System.out.println("4. 종료");
			System.out.println("메뉴번호입력 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : {
				System.out.println("원하시는 예금액을 입력해주세요 : ");
				money = sc.nextInt();
				balance += money;
				System.out.printf("%d원이 입금되어 잔고는 %d입니다.\n", money, balance);
				System.out.println("--------------------------");
				break;
			}
			case 2 : {
				System.out.println("원하시는 출금액을 입력해주세요 : ");
				money = sc.nextInt();
				if (balance > money) {
					balance -= money;
					System.out.printf("%d원이 출금되어 잔고는 %d입니다.\n", money, balance);
					System.out.println("--------------------------");
					}
				else {System.out.println("잔액이 부족합니다");}	
				System.out.println("--------------------------");
				break;
			}
			case 3 : {
				System.out.println("잔고를 조회합니다.");
				System.out.println("계좌의 잔고은 "+balance+"원입니다.");
				System.out.println("--------------------------");
				break;
			}
			case 4 : {
				System.out.println("은행업무를 종료합니다.");
				statement = false;
				break;
			}
			default : {
				System.out.println("똑바로 입력안함?");
				System.out.println("--------------------------");
			}
			}
		} while(statement);
		
		
			
	}
	
	public static String Comma (long balance) {
		String balance_str = "";
		int residue = (int)balance%3;
		switch (residue) {
			case 0 : {
				for (int i = 0 ; i < )
				return balance_str;
			}
			case 1 :
			case 2 :
		}
		return balance_str;
	}
	
	
}
		
		

		
		
	


