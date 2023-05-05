package edu.kh.abs.model.vo;

public class Dog extends TypeMammalia{  //1번 : 조건하나씩 만들기
	public void eat() {
		System.out.println("강아지가 밥을 먹는다.");
	}
	
	public void cry() {
		System.out.println("강아지가 운다.");
	}
	
	public void move() {
		System.out.println("강아지가 움직인다.");
	}

	@Override
	public void breastfeed() {
		System.out.println("강아지가 수유를 한다.");
	}
	
}
