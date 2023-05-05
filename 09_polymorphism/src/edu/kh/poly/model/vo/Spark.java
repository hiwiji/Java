package edu.kh.poly.model.vo;

public class Spark extends Car { // 경차
	// ★★11번 : Spark 라는 클래스 생성 후 
	//         기존 클래스 이름 뒤에 extends Car라고 써주기
	
	private double discountOffer; // 할인혜택
	// ★★12번 : 해당클래스의 필드값 만들어주기
	
	
	
	// ★★13번 : 기본생성자, 매개변수 생성자, getter/setter 만들어주기 
	// 기본생성자
	public Spark() {}  // super() 생략 시 컴파일러가 자동 추가
	
	
	
	// 매개변수 생성자(상속버전)
	// alt + shift + s -> o -> (아래방향키 -> enter)
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	// getter/setter
	public double getDiscountOffer() {
		return discountOffer;
	}


	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	// ★★14번 : toString 이용해서 
	@Override
	public String toString() {
			return super.toString() + " / " + discountOffer;
	}
	
  
	
}
