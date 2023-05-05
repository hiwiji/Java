package edu.kh.poly.model.vo;        // Car클래스 1~5번 순서

public class Car {   /*extends Object*/
	/* 자동차라면 가지고 있는 것? */  
	
	/*★★1번 필드 만들어주기*/
	private String engine; //엔진
	private String fuel;   //연료
	private int wheel;     // 바퀴개수

	public Car() { //기본생성자 ★★2번:기본생성자, 부모생성자만들어주기
		super();   //부모생성자(Object)    오브젝트는 모든클래스의 조상?
		   //안적으면 컴파일러가 자동으로 만들어준다
	}

	// ★★3번 : 매개변수 생성자 만들기
	// 자동완성방법 : alt + shift + s + o 
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	// ★★4번 : getter/setter 자동완성
		// 자동완성방법 : alt + shift + s+ r 
		
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	
	// ★★5번 toString으로 출력값에 오버라이딩 해주기
	//Object.tiStrring() 오버라이딩
	@Override // 오버라이드 했다는걸 알려주는 Override 어노테이션 작성
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
		// 엔진 / 연료 / 바퀴개수 
	}
	
	

}
