package edu.kh.book.model.vo;

public class Book {

	private String bookName;
	private String auther;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(String bookName, String auther, int price, String publisher) {
		super();
		this.bookName = bookName;
		this.auther = auther;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return   " "+ bookName + "  " +  auther + "  " + price + "  " + publisher
		;
	}
	
	
	
	
	
	
	
}
