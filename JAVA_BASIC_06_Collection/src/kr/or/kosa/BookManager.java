package kr.or.kosa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BookManager {
	private HashMap<Integer, Book> books;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public BookManager() {
		this.books = new HashMap<>();
	}
	
	
	public void run() throws NumberFormatException, IOException {
		
		boolean runState = true;
		while(runState) {			
			System.out.println("1:추가\t2:삭제\t3:검색\t4:도서 목록\t5:ISBN 목록\t 0:종료");
			System.out.println("원하시는 메뉴번호를 입력하세요");
			int inputValue = Integer.parseInt(br.readLine());
			switch(inputValue) {
			case 1: addBook(); break;
			case 2: removeBook(); break;
			case 3: findBook(); break;
			case 4: showBookList(); break;
			case 5: showIsbnList(); break;
			case 0: runState = false; break;
			default: System.out.println("잘못된 값입니다");
			}	
		}
	}
	
	private void addBook() throws IOException {
		System.out.print("추가할 도서(ISBN) : ");
		int isbn = Integer.parseInt(br.readLine());
		if(!books.containsKey(isbn)) {
			System.out.println("해당 도서가 이미 존재합니다");
			return;
		} else {
			System.out.print("도서 제목 : ");
			String bookName = br.readLine();
			System.out.print("가격 : ");
			int bookPrice = Integer.parseInt(br.readLine());
			books.put(isbn, new Book(isbn, bookName, bookPrice));
			System.out.printf("ISBN:%d 이름:%s 가격:%d 생성하였습니다.\n",isbn, bookName, bookPrice);		
		}
	}
	
	private void removeBook() throws NumberFormatException, IOException {
		System.out.print("삭제할 도서의 ISBN : ");
		int isbn = Integer.parseInt(br.readLine());
		if(books.containsKey(isbn)) {
			books.remove(isbn);
			System.out.println("해당 도서를 삭제하였습니다");
			System.out.println("삭제된 도서 ISBN : " + isbn);
		} else {
			System.out.println("해당 도서가 없습니다.");
		}
	}
	
	private void findBook() throws NumberFormatException, IOException {
		System.out.print("검색할 도서의 ISBN : ");
		int isbn = Integer.parseInt(br.readLine());
		if(books.containsKey(isbn)) {
			System.out.printf("검색 결과>> ISBN:%d 이름:%s 가격:%d\n",isbn, books.get(isbn).getBookName(),books.get(isbn).getBookPrice());
		} else {
			System.out.println("해당 도서가 없습니다.");
		}
	}
	
	private void showBookList() {
		System.out.println("도서목록");
		System.out.println("도서 수 : "+ books.size());
		for (int i : books.keySet()) {
			System.out.printf("ISBN:%d 이름:%s 가격:%d\n", books.get(i).getIsbn(), books.get(i).getBookName(), books.get(i).getBookPrice());			
		}
	}
	private void showIsbnList() {
		System.out.println("도서목록");
		System.out.println("도서 수 : "+ books.size());
		for (int i : books.keySet()) {
			System.out.printf("ISBN:%d\n", books.get(i).getIsbn());			
		}
	}
	
	
}
