import java.util.ArrayList;
import java.util.List;

/*
람다 표현식
람다식은 함수를 하나의 식으로 표현한것

자바에서 람다식을 사용하기 위해서 
함수형 인터페이스를 생성 ....

함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
interface MyFunc {
   int max(int a, int b);
}

//익명 클래스 익명 객체 선언을 통해서
MyFunc f = new MyFunc() {
   int max(int a , int b) {  return a > b ? a : b ; }  //안쪽을 람다식으로 표현
}
int value = f.max(3,5);


람다식 장점
코드 간결하다
가독성이 높아진다
병렬프로그래밍이 가능

람다식 단점
람다를 사용하면 무명함수는 재사용 불가능
디버깅 어렵다
재귀적 구현이 어렵다


*/

//함수적 인터페이스
@FunctionalInterface
interface MyLamdaFunction{
	int max(int a, int b);
}


public class Lamda_01 {

	public static void main(String[] args) {
		
		
		//기존 방식 익명객체 ... 익명함수
		System.out.println(new MyLamdaFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;  //구현 
			}
		}.max(3, 5));
		
		
		//람다식
		MyLamdaFunction lamdaFunction = (int a , int b) -> a > b ? a : b;
		System.out.println(lamdaFunction.max(3, 5));
		
		
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("react");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		list.stream().forEach((String str) -> {System.out.println(str);});
		list.stream().forEach(str -> {System.out.println(str);} );
		list.stream().forEach(System.out::println); //참조...

	}

}
