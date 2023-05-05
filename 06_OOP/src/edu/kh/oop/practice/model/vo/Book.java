package edu.kh.oop.practice.model.vo;

public class Book {
	// 필드    //인스턴스 4개 만들기                 
	private String title;  //도서명 
	private int price; //가격
	private double discountrate; //할인율
	private String author; //저자명
	
	//생성자 만들기 
	public Book() {}   // 기본생성자
	
	public Book(String title, int price, 
			double discountrate, String author){  // 매개변수 생성자
				this.title = title;
				this.price = price;
				this.discountrate = discountrate;
				this.author = author;
	}
	//메소드 // getter setter 만들기 
				
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountrate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountrate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	// 어노테이션 to String() 오버라이딩
	@Override
	public String/*(자료형)*/ toString() {         // 반환형
		return title + "/" + price + "/" +
			   discountrate + "/" + author;
		
		// c언어 / 30000 / 0.3 
	}
	
	

}
