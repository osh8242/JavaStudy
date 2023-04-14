/*
문제 풀어 보세요 ^^
요구사항
 >> 매장카트 구현하기 입니다 <<
카트 (Cart) >> member field로 만드세요
카트 매장에 있는 [모든 전자제품]을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... [카트에 담는다]
---------------------------------------
계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 )
hint) Buyer ..>> summary()  main 함수에서 계산할때  사용합니다

Buyer >> buy() , summary() >> 카트에 물건 계산 (어떤 물건, 각 가격 >> 당신은 총 얼마를 내야하나?)

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다

*/

class Product2 {
	int price;
	int bonuspoint;
	
	public Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(price/10.0);
	}
}

class KtTv2 extends Product2{
	
	KtTv2(){
		super(500);
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	
	Audio2(){
		super(100);
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Audio2";
	}
}

class Notebook2 extends Product2{
	
	Notebook2(){
		super(500);
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Notebook";
	}
}

class Buyer2 {
	int money;
	int bonuspoint;
	Product2[] products;
	int cartIndex;
	
	public Buyer2() {
		this(5000);
	}
	
	public Buyer2(int money) {
		this.money = money;
		this.bonuspoint = 0;
		this.products = new Product2[10];
		this.cartIndex = 0;
	}
	
	public void buy (Product2 n){
		if(cartIndex > 9 || money < n.price) {System.out.println("돌아가세요"); return;}
		products[cartIndex++] = n;		
	}
	
	public void summary () {
		int psum= 0;
		int bsum= 0;
		String list = "";
		for (int i = 0 ; i < cartIndex ; i++) {
			psum += products[i].price;
			bsum += products[i].bonuspoint;
			list += products[i].toString() + "[" + products[i].price + "원]\n";
		}
		System.out.println("장바구니 총 금액 : " + psum);
		System.out.println("획득하게될 총 포인트 : " + bsum);
		System.out.println(list.trim());
	}
}

class Ex13_Inherit_KeyPoint{
	
	public static void main(String[] args) {
		KtTv2 tv2 = new KtTv2();
		Audio2 audio2 = new Audio2();
		Notebook2 notebook2 = new Notebook2();
		Buyer2 buyer2 = new Buyer2();
		
		buyer2.buy(notebook2);
		buyer2.buy(notebook2);
		buyer2.buy(notebook2);
		buyer2.buy(notebook2);
		buyer2.buy(notebook2);
		buyer2.buy(audio2);
		buyer2.buy(audio2);
		buyer2.buy(audio2);
		buyer2.buy(audio2);
		buyer2.buy(tv2);
		buyer2.buy(tv2);
		buyer2.buy(tv2);
		buyer2.summary();
		
		
	}
	
	
}












