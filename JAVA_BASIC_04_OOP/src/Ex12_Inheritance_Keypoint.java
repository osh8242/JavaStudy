/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라 전자제품 매장이 오픈되면

[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 모든 제품이 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름정보를 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다 (ex) Tv , Audio , Computer
각각의 전자제품은 다른 가격정보를 가지고 있다( Tv:5000 , Audio : 6000)
제품의 포인트는 가격의 10%적용한다

시뮬레이션 시나리오
구매자: 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
ex) 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게 되면 가지고 있는 돈은 감소하고 (가격) 포인트는 증가한다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook( ) {
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

//구매자
class Buyer{
	int money = 5000;
	int bonusPoint;
	
	//기능 구매기능
	//제품을 구매할 수 있는 기능 (3개를 구매할 수 있는 기능)
	//내 잔액에서 -제품가격, +포인트
	void kttvBuy(KtTv n) {//함수의 파라미터로 제품객체를 받아서(가격, 포인트)
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; //함수의 강제종료
		}
		//실구매행위
		this.money -= n.price;
		this.bonusPoint += n.bonusPoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void audioBuy(Audio n) {//함수의 파라미터로 제품객체를 받아서(가격, 포인트)
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; //함수의 강제종료
		}
		//실구매행위
		this.money -= n.price;
		this.bonusPoint += n.bonusPoint;
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void notebookBuy(NoteBook n) {//함수의 파라미터로 제품객체를 받아서(가격, 포인트)
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; //함수의 강제종료
		}
		//실구매행위
		this.money -= n.price;
		this.bonusPoint += n.bonusPoint;
		System.out.println("현재 잔액은 : " + this.money);
		System.out.println("구매한 물건은 : " + n.toString());
	}
	
	void Buy(Product p) {
		if(this.money<p.price) {
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; //함수의 강제종료
		}
		//실구매행위
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println("현재 잔액은 : " + this.money);
		System.out.println("구매한 물건은 : " + p.toString());
	}
}
/*
1차 오픈....
팀장>>하와이로 휴가를 갑니다

매장에 제품을 더 구매하겠대.. 1000개의 제품 추가(마우스, 토스트기, 청소기 ....)
pos시스템(제품들 자동등록)
매장에 1000개의 제품이 전시...... 후........
업체가 전단지를 뿌림 >> 주말에 오픈세일~!!
1.오픈 3개 구매 >> 997제품이 구매가 안되요(허위매물)
2.팀장>>하와이>>PC방>>국내전산망>>개발서버접속>>이틀간밤샘작업>>구매함수997개를추가


 */




public class Ex12_Inheritance_Keypoint {

	public static void main(String[] args) {
		//임시오픈을 가정하여 개장
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		Buyer buyer = new Buyer();
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.notebookBuy(notebook);

	}

}
