package edu.kh.abs.model.vo;

public class Eagle extends TypeBirds {

	@Override
	public void eat() {
		System.out.println("독수리가 먹이를 먹는다.");
	}
	
	@Override
	public void cry() {
		System.out.println("독수리가 울부 짖는다.");
		
	}

	@Override
	public void move() {
		System.out.println("독수리가 날아간다");
		
	}

}
