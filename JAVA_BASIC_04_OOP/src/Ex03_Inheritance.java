//두개의 설계도
class Tv{
	boolean power;
	int ch;
	
	void power() { // 두개의 기능을 하나의 함수로 처리
		//boolean
		this.power = !this.power; // 전원 스위치
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class Vcr{ //비디오 플레이어
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {}
	void ff() {}
}

//설계도가 2개
/*
티비와 vcr이 있음

제품 Tv와 Vcr이 합쳐진 것을 만들고 싶다
TvVcr을 출시!

class TvVcr extends Tv, Vcr >>> 이렇게는 안됨 (x)
>> 계층적 상속을 통해서 두개 기능을 합치자 >> 누가 할아버지 클래스고 아버지 클래스냐? and 기능이 겹치면 사용불가..!

한놈은 상속 하고 한놈은 포함
둘다 포함하기 위해서는..?
class TvVcr extends Tv { Vcr vcr };
Tv가 더 일반적이고 메인적인 기능이므로 Tv를 상속하고 Vcr 객체를 따로 생성해서 사용하는 것이 바람직
정해진 것은 아님 융통성있게 사용할 것
 */
// Tv와 Vcr을 합치는 첫번째 방법
// 둘다 객체 만듬
class TvVcr {
	Tv tv;
	Vcr vcr;
	TvVcr(){
		this.tv = new Tv(); // 초기화 (주소값 할당)
		this.vcr = new Vcr();
	}
	
}
// 두번째 방법
// 주요 클래스를 상속하고 부수적인 클래스를 객체로 생성함
class TvVcr2 extends Tv{
	Vcr vcr;
	public TvVcr2() {
		this.vcr = new Vcr();
	}
}

public class Ex03_Inheritance {

	public static void main(String[] args) {
		TvVcr my = new TvVcr();
		my.tv.power();
		my.vcr.power();
		System.out.println(my.tv.power);
		System.out.println(my.vcr.power);
		//---------------------------------------------------------
		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("TV전원 : "+tv2.power);
		tv2.vcr.power();
		System.out.println("VCR전원 : "+tv2.vcr.power);
	}

}
