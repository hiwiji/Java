package edu.kh.booklist.vo;

public class Bookmark {
	int bookNo;
	
	//생성자
	public Bookmark(){}

	//매개변수 생성자
	public Bookmark(int bookNo) {
		super();
		this.bookNo = bookNo;
	}

	
	//메소드
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	//toString
	@Override
	public String toString() {
		return "Bookmark [bookNo=" + bookNo + "]";
	}
	
	
	
	
	
}
