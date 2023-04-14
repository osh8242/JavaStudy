
class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP; //최대 에너지
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}


/*
인터페이스
//~ 할 수 있는 (수리할 수 있는)
 */
interface Irepairable{}

//지상유닛, 공중유닛, 건물
class GroundUnit extends Unit2{

	GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}

class AirUnit extends Unit2 {

	AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}

class CommandCenter implements Irepairable {}

// 유닛..
class Tank2 extends GroundUnit implements Irepairable {

	Tank2() {
		super(150);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
	
}

class Marine2 extends GroundUnit {
	public Marine2() {
		super(40);
		this.hitpoint = MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}

//Scv : 채광기능, 수리기능
class Scv extends GroundUnit implements Irepairable {

	public Scv() {
		super(60);
		this.hitpoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Scv";
	}	
	
	void repair(Irepairable ir) {
		//Tank2, Scv, CommandCenter
		//수리하는 방법이 달라요
		//Tank2, Scv >> HP 가지고 올려주면 되요
		//다른 방법으로 repair
		
		//repairunit 일반 Unit2이냐 아니냐를 판단하는 기준이 필요함
		if(ir instanceof Unit2) {
			//Tank2, Scv
			Unit2 unit2 = (Unit2) ir;
			if(unit2.hitpoint != unit2.MAX_HP) {
				unit2.hitpoint = unit2.MAX_HP;
			} else {
				//건물수리
				System.out.println("다른 충전 방식을 통해서 repair합니다");
			}
		}
	}
	
	//Scv가 가지는 구체화된 특수화된 고유한 기능구현
	//수리하다(repair)
	//수리하는 대상(기계, 건물만)
	//Tank2, Scv, CommandCenter
	
	//전자제품 매장에 제품 1000개 >> buy() >> 1000개의 buy()를 만들지않고 하나로 되게함
	//다형성을 사용해서 한번의 buy(Product p)로 끝내보자

	//  void repair(Unit2 unit) {}
	//  이렇게 하면 marine, airunit도 들어올 수 있게됨;;;;;
	//  	void repair(GroundUnit unit) >> Tank2, Marine2(x), Scv
	//		이렇게 하면 CommandCenter가 포함안됨;;;;;;;;;;
	//>> 해답은 interface
	
	// class CommandCenter implements Irepairable {}
	// class Tank2 extends GroundUnit implements Irepairable {}
	// class Scv extends GroundUnit implements Irepairable {}
	// 수리가능한 친구들에게 implements Irepairable {}를 붙여서 수리가능한 유닛으로 묶을 수 있음
	
	// 부모로서 Irepairable이 서로 연관성 없는 객체들을 포용할 수 있는 interface가 됨
	
	// 다형성
	
}
	


public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank2 tank2 = new Tank2();
		Marine2 marine2 = new Marine2();
		Scv scv = new Scv();
		
		CommandCenter center = new CommandCenter();
		
		//전투
		tank2.hitpoint -= 20;
		System.out.println("탱크 : " + tank2.hitpoint);
		System.out.println("SCV 수리요청");
		scv.repair(tank2);
		System.out.println("탱크 수리 완료 : " + tank2.hitpoint);
		

		scv.hitpoint -= 30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("scv 수리요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
	}


}
