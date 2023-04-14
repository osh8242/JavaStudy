/*
오류
1. 에러(error)		: 개발자가 해결할 수 없는 장애(ex. 네트워크 장애, 메모리 누수, 하드웨어적 문제) >> 코드적으로 해결할 수 없음
2. 예외(exception)	: 개발자가 코드 실수로 발생 >> 문제 발생 코드를 찾아서 수정 후 배포
2.1 컴파일시... 실행파일 생성 안되요 (무조건 해결해야됨)
2.2 런타임시(실행도중)에 문제가 발생 >> 강제 종료 >> 문제가 생긴 시점부터 나머지 코드가 실행되지 않음

예외처리 : 프로그램이 안정적으로 종료되게 하려고함 >> 종료 후 원인분석 >> 코드 수정... >> 다시 배포

try {
	>> 문제가 의심되는 코드
	>> 문제가 발생되면
	>> 예외가 발생한 정보를 담을 수 있는 객체를 자동생성함
	ex)
	[0][1][2] >> car[3] =""; >> ArrayIndexOutofBoundsException (생성) >> 예외담기
	엄밀히는 new ArrayIndexOutofBoundsException("예외정보");
	
} catch(Exception e) { // Exception은 모든 예외의 부모타입
	>> 문제 파악
	>> 처리 보고(코드는 자동수정되지않아요)
	>> 일반적으로는 보통 catch 안에 다음과 같은 기능이 담긴다
	>> 1. 관리자에게 email 보내기
	>> 2. 로그기록 (장애 발생 기록)
	>> 3. 강제종료는 막는다..

{
finally{
	>> 문제가 발생되던 말던 강제적으로 실행되는 코드
	>> 함수는 보통 return을 만나면 종료하지만 finally는 무조건 실행됨
	>> DB작업... DB자원 종료 강제...
}




 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		
		System.out.println(0/0);
		//java.lang.ArithmeticException: / by zero
		//"야 너.. 0으로 나눴잖아"라고 알려줌

		// 문제가 발생하면 종료.. 더이상 코드를 실행하지 않음
		System.out.println("main end");
		
		*/
		
		System.out.println("main start");
		try {
			System.out.println(0/0);
		} catch (Exception e) { //부모타입 변수는 자식타입의 주소값을 받을 수 있다 (다형성)
			// 문제를 파악하고 e로 전달되었음
			System.out.println("문제가 발생했습니당..T^T : "+e.getMessage());
			e.printStackTrace();
		} 
		System.out.println("main end");
		
		
		
	}

}
