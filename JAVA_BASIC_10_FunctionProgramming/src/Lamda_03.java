/*
[람다식 기본 문법]

(타입 매개변수, ...) -> {실행문;...}
: (int a) -> {System.out.println(a);}

1. 매개타입은 런타임시에 대입값에 따라 자동으로 인식하기 때문에 생략가능  (int a) , (String a)
   (a) -> { System.out.println(a);}

2. 하나의 매개변수만 있을 경우에는 괄호() 생략 가능
    a -> {System.out.println(a);}   
   
3. 하나의 실행문만 있다면 중괄호 { } 생략 가능
    a -> System.out.println(a);

4. 매개변수가 없다면 괄호()를 생략할 수 없음
    () -> {실행문;...};
    
5. 리턴값이 있는 경우, return 문을 사용 
    (x,y) -> {return x + y;};   

6. 중괄호 {} 에 return문만 있을 경우 , 중괄호를 생략가능
   (x,y) -> x + y;


[타켓 타입과 함수적 인터페이스]
-타켓 타입(target type)
--람다식인 대입되는 인터페이스를 말환다
--익명 구현 객체를 만들때 사용할 인터페이스이다
ex) 인터페이스 변수 = 람다식;
    [타켓타입]

-함수적 인터페이스(functional interface)
-모든 인터페이스는 람다식의 타겟 타입이 될 수 없다
 --람다식은 하나의 메소드를 정의하기 때문에
 --하나의 추상 메소드만 선언된 인터페이스만 타켓 타입이 될 수 있음
-함수적 인터페이스
--하나의 추상메소드만 선언된 인터페이스를 말한다

-@Functionalinterface annotation
--하나의 추상 메소드만을 가지는지 컴파일러가 체크 하도록 함
--두개 이상의 추상 메서드가 선언되어 있으면 컴파일 오류 발생

*/

@FunctionalInterface
interface MyFunction{
	void method();
	//void method2();
}

public class Lamda_03 {
	public static void main(String[] args) {
		
		MyFunction myfun = new MyFunction() { //클래스 이름이 없는 익명 클래스 구현 
			@Override
			public void method() {
				System.out.println("World");
			}
		};
		myfun.method();
		////////////////////////////////////////////////////
		MyFunction my = () -> System.out.println("Hello");
		my.method();
		
		my = () -> {
			System.out.println("A");
			System.out.println("B");
		};
		my.method();
		
	}

}
