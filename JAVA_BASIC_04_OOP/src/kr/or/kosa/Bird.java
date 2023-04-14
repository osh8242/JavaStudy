package kr.or.kosa;
//새 ( 공룡 : 일반, 추상) : 새는 날 수 있다, 새는 빠르다
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("flying");
	}
	
	//설계자 고민
	//꼭 날아댕기는 새만 있는건 아닌데 이걸로 충분해? 
	//>> protected라고 해서 상속받는 사람에게 재정의하라고 하자
	protected void moveFast() {
		fly();
	}
}
