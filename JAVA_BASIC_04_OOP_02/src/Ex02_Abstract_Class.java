/*
게임 : 유닛(unit)

unit : 공통기능(이동좌표, 이동, 멈춘다) : 추상화, 일반화
unit : 이동방법은 다르다 (이동방법은 unit마다 다르므로 별도의 구현이 '반드시' 필요하다)

Class Unit{
	void move(){}; 
} // 이렇게 구현하면 move() 메소드의 재정의가 강제되지 않는다

//각각 유닛을 만드는데 반드시 move()를 다른형태(재정의)로 구현하도록해라~~
 
 */

abstract class Unit {
	int x, y;

	void stop() {
		System.out.println("Unit Stop");
	}

	// 이동의 방법은 다르므로
	abstract void move(int x, int y); // 실행블럭이 없어용.. >> 추상함수 >> 미완성 함수
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 소리내며 이동 : " + this.x + "," + this.y);
	}
	//필요에 따라서 구체화+특수화된 기능구현 (고유구현)
	void changeMode() {
		System.out.println("탱크모드 변환");
	}

}

class Marine extends Unit {
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동 : "+this.x+","+this.y);
	}
	
	//특수화, 구체화
	void stimpack() {
		System.out.println("스팀팩기능");
	}
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship은 하늘로 이동합니다");
	}
	
	//특수화, 구체화
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
}

public class Ex02_Abstract_Class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500, 200);
		tank.stop();
		tank.changeMode();
		
		Marine marine = new Marine();
		marine.move(200, 300);
		marine.stop();
		marine.stimpack();
		
		//Today Point (다형성을 공부하는 동안 자주 사용하게 될 거예요~~)
		//JAVA : Instanceof (객체의 타입 비교하는 연산자 true, false 반환)
		//JavaScript : typeof
		
		if(tank instanceof Unit) {
		  //객체           //타입
			
			System.out.println(tank instanceof Unit);
		}
		
		//1. 탱크 3대를 만들고 같은 좌표(600,800)로 이동시키세요
		Unit[] t3 = {new Tank(), new Tank(), new Tank()};
		for (Unit t : t3) {
			t.move(600, 800);
		}
		
		//2. 여러개의 tank 1대, marine 1기, dropship 1기 생성하고 같은 좌표 (666,888)
		Unit[] units = {new Tank(), new Marine(), new Dropship()};
		for (Unit t : units) {
			t.move(666, 888);
		}		
	}

}
