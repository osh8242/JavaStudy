/*
추상 클래스 : 미완성 클래스 (설계도)
1. 완성된 코드 + 미완성된 코드로 구성되어있음 >> 미완성된 부분을 완성해야함
2. 미완성된 코드(==메소드) >> 실행블럭이 없는 클래스가 abstract 클래스 >> public void run() >> {} <- 실행블럭이 없음
	>>함수 이름만 있음
3. 미완성된 클래스는 단독으로 객체 생성 불가

반드시 override를 통해 미완성 메소드를 구현하는 자식 클래스로 상속하여 사용해야함
>> 의도 >> '강제적으로 미완성 파트를 구현을 해라''
상속을 기반으로..


 */

class Car {

	void run() {
	} // 실행블럭 {}만 있으면 객체를 생성하고 사용하느 데 문제 없다
	// 만약 run()을 재정의했으면 좋겠는데... 강제성이 없다
	// >> 재정의를 하지 않아도 사용하는데 전혀 문제가 없다
}

class Hcar extends Car {
	// 믿음
	@Override
	void run() {
		System.out.println("run()을 재정의했습니다");
	}
}

//재정의하는 것에 대해 강제성이 없어요..(의무가 아니다)
//재정의를 반드시 하게 만들고 싶으면?

abstract class Abclass { // 클래스 안에는 최소 1개 이상의 추상함수를 가지고 있겠다
	int pos;

	void run() {
		pos++;
	}

	// 재정의가 필요한 함수를 추상함수로 설계하면 강제성을 부여가능
	abstract void stop(); // 실행블럭이 없다 >> 사용할 때 반드시 상속을 통해서만 구현가능 >> 사용 후 재정의
}

//상속을 통해 구현
class Child extends Abclass {

	@Override
	void stop() {
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}

}

class Child2 extends Abclass {

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop : " + this.pos);

	}
}

public class Ex01_Abstract_Class {

	public static void main(String[] args) {
		Hcar hc = new Hcar();
		hc.run();

		//Abclass ab = new Abclass();
		
		Child child = new Child();
		child.run();
		child.run();
		child.stop();
		
		Child2 child2 = new Child2();
		child2.run();
		child2.run();
		child2.stop();
		//////////////////////////////////////////////////////////////
		//다형성
		Abclass ab = child;
		//상속관계에서 부모타입의 참조변수가 자식타입객체들의 주소를 받을 수 있다(다형성)
		//단, 부모는 자식만의 자원에는 접근할 수 없다.
		//단, override된 메소드는 자식의 메소드에 접근할 수 있다
		ab.run(); // 
		ab.stop(); // 재정의된 자식 함수 호출
	}

}
