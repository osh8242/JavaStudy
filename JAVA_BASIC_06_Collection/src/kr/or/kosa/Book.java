package kr.or.kosa;

public class Book {
	private int isbn;
	private String bookName;
	private int bookPrice;	
	
	public Book(int isbn, String bookName, int bookPrice) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
}
