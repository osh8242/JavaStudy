import java.util.Scanner;

/*
//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리

//입력값 : 123456-1234567 

//static 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력
*/
public class Ex07_String_Total_Quiz {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력하세요 (제발 잘 좀 입력하세요ㅡㅡ^)");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		is14Length(num);
		isHuman(num);
		ruXXorXY(num);
		
	}
	
	public static boolean is14Length (String num) {
		if(num.length()==14) {
			System.out.println("14자리 OK");
			return true;
			} else {
				System.out.println(num.replace("-", "").length()+"자리를 입력하셨습니다.");
				System.out.println("잘 좀 합시다잉");
				return false;
			}
		
	}
	
	public static boolean isHuman (String num) {
		if(num.charAt(7) >= 49 && num.charAt(7) <= 52) {
			System.out.println("당신은 휴먼이군요?");
			return true;
		} else {
			System.out.println("당신은 휴먼이 아닙니다.");
			return false;
		}
	}
	
	public static void ruXXorXY (String num) {
		if(num.charAt(7) == 49 || num.charAt(7) == 51) {
			System.out.println("당신은 남성이군요?");
		} else {
			System.out.println("당신은 여성이군요?");
		}
	}
	
}