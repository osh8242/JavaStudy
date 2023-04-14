
public class Ex02_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		int num = 100;
		int result = 0;
		try {
			for (int i = 0 ; i < 10 ; i++) {
				result = num / (int)(Math.random()*10);  // 0~9까지의 난수을 발생시킴
				System.out.println("result : "+result+" / i : "+ i);
			}
		} catch (ArithmeticException e) { // Exception e는 [유지보수]가 힘들어용...ㅜㅜ (가독성)
			System.out.println("문제가 발생했어요 ^^ 관리자에게 이 기쁜 소식을 알려주세요 ㅎㅎ");
			System.out.println("원인 : "+e.getMessage());
		} finally {
			
		}
		
		System.out.println("main end");
	}

}
