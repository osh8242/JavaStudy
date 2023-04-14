package kr.or.kosa;
/*
책은 책이름과 가격정보를 가지고 있다
책이 출판되면 반드시 책이름과 책 가격정보를 가지고 있어여 한다
책의 이름과 가격정보는 특정 기능을 통해서만 볼 수 있고 , 출판된 이후에는 수정 할 수 없다 (책의 가격,이름)
책이름과 가격정보는 각각 확인 수 있다
*/
public class Book {
	private String bookName;
	private int bookPrice;
	public Book(int price, String name) {
		bookName = name;
		bookPrice = price;
	}
	public String getBookName() {
		return bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void showPrice () {
		System.out.println(getBookPrice());
	}
	public void showName () {
		System.out.println(getBookName());
	}
	
}
