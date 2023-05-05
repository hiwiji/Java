package edu.kh.booklist.vo;

public class Bookinfo {

	//필드
	private String bookName;  // 도서명
	private String bookAuthor;  // 저자
	private int bookPrice;  //가격
	private String bookPublisher; // 출판사
	
	// 생성자
	
	public Bookinfo() {}  // 기본생성자

	//매개변수 생성자
	public Bookinfo(String bookName, String bookAuthor, int bookPrice, String bookPublisher) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	
	//메소드
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	
	//toString
	
	@Override
	public String toString() {
		return bookName +"  "+ bookAuthor +"  "+ bookPrice+"원   "+ bookPublisher;
	}
	

}
