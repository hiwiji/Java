package edu.kh.inter.model.vo;

public class Cat extends TypeMammalia{
	
	// 3번작업 : 
	// 기존 내용 없애면 오류나서 오류창에 있는 작업내용 클릭해서 오버라이드 만들어줌

	@Override
	public void eat() {
		System.out.println("냐미냐미~ ");
		
		
	}

	@Override
	public void cry() {
		System.out.println("미유~~");
	
		
	}

	@Override
	public void move() {
		System.out.println("살금살금");
		
		
	}

	public void breastfeed() {
		System.out.println("고양이가 수유를 한다.");
		
	} 

}
