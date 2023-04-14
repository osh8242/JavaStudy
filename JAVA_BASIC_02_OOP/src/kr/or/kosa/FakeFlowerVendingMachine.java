package kr.or.kosa;

public class FakeFlowerVendingMachine {
	private int serialNum;
	private String brandName;
	private int asPeriod;
	
	private String productName1, productName2, productName3, productName4;
	private int productPrice1, productPrice2, productPrice3, productPrice4;
	private boolean isInStock1 = true, isInStock2 = true, isInStock3 = true, isInStock4 = true; 

	
	public void showSelectedProduct (int buttonValue) {
		switch(buttonValue) {
		case 1 : showProductInfo(productName1, productPrice1); break;
		case 2 : showProductInfo(productName2, productPrice2); break;
		case 3 : showProductInfo(productName3, productPrice3); break;
		case 4 : showProductInfo(productName4, productPrice4);
		}
	}
	
	public void showProductInfo(String productName, int productPrice) {
		System.out.printf("선택하신 상품은 [%s], 가격은 [%d]입미다.\n",productName, productPrice);
		System.out.println("결제하시겠습니까?");
	}
	
	public void buyProduct (boolean answer) {
		if (answer) { /*결제진행 + 상품반환*/ }
		else { /*프로그램 초기화*/ };
	}
	
	
		

	

	
	
	
	
	
	
	
}
