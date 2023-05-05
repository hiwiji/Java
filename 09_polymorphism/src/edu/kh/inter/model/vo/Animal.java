package edu.kh.inter.model.vo;

public abstract class Animal {  // 2번 작업
	// abstract 붙는 순간, 객체화(인스턴스화)가 안되는 클래스
	// 단, 타입으로서의 의미는 그대로!!
	
	
	public abstract void eat(); // 추상메서드 
	// 먹기라는 메서드는 있지만 어떻게 동작할지 정의하지 않아야 한다.
	// + 추상메소드가 있다면, 추상 클래스여야함.
	// abstract 붙이면 중괄호는 삭제해야한다.
	
	public abstract void cry(); 
	public abstract void move();

	
}
