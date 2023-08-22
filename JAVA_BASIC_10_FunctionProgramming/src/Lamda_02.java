/*
[함수적 프로그래밍 기법]
y=f(x) 형태의 함수로 구성된 프로그래밍 기법
-데이터를 매개값으로 전달하고 결과를 받는 코드들로 구성
-객체 지향 프로그래밍 보다는 효율적인 경우
-- 대용량 데이터의 처리시 
-- 이벤트 지향 프로그래밍(이벤트가 발생하면 핸들러 함수 실행) 적합
현대적 프로그래밍 기법
-객체 지향 프로그래밍 + 함수적 프로그래밍

[자바 8부터 함수적 프로그래밍 지원]
람다식(Lamda expressions)을 언어 차원에서 제공
-람다 계산법에서 사용된 식을 프로그래밍 언어에 접목
-익명 함수(anonymous function)을 생성하기 위한식
(타입 매개 변수) -> {실행문;}
     x             y
자바에서 람다식을 수용한 이유
-코드가 매우 간결해 진다
-컬렉션요소(대용량 데이터)를 필터링 또는 매핑해서 쉽게 집계할 수 있다

[자바는 람다식을 [함수적 인터페이스]의 [익명구현 객체]로 취급]

람다식 -> 매개변수를 가진 코드 블럭 -> 익명 구현 객체

**어떤 인터페이스를 구현할지는 대입되는 인터페이스에 달려 있다**
**인터페이스가 함수를 하나 가지고 있는 경우 **
아래는 Runnable 익명객체(1회성) 객체 생성 사용...
Runnable runable = new Runnable() {
			@Override
			public void run() {
				//구현코드				
			}
		};

Runnable runnable = ()->{System.out.println("구현코드");};
runnable.run();

*/

public class Lamda_02 {

	public static void main(String[] args) {
		/*
		Object obj  = new Object() {
			int max(int a , int b) {
				return a > b ? a : b;
			}
		};
		
		int value = obj.max(3,5); //불가능
		*/
		
		//함수적 인터페이스의 가장 대표적인 녀석이 Runnable 인터페이스
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("run");
				
			}
		};
		run.run();
		
		//람다 표현식으로... run 논리를 람다식으로
		Runnable runable = () -> {System.out.println("구현코드");};
		runable.run();
	}

}
