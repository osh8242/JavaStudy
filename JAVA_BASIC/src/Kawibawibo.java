import java.util.Arrays;
import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보\n선택하세요 : ");		
		int user = sc.nextInt(); //사용자에게 가위바위보 입력받기
		
		double random = Math.random();		
		int com = (int)(3*random+1); //1 <= random < 4; // 컴퓨터 가위바위보 뽑기
		System.out.println("you : "+ user +"   "+"com : "+com); // 나와 컴퓨터가 낸 것 출력

		switch (user - com) {
			case 0 : {System.out.println("비겼습니다.");break;	}
			case 1, -2 : {System.out.println("당신이 이겼습니다");break;}
			case 2, -1 : {System.out.println("당신이 졌습니다.");}
		}
	}
	

	public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        return answer;
    }

}
