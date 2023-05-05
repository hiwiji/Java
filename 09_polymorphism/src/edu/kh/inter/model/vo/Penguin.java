package edu.kh.inter.model.vo;

public class Penguin extends TypeBirds implements WaterLife, Test{

	
	@Override
	public void eat() {
		System.out.println("펭귄이 먹이를 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("펭귄이 소리를 낸다.");
	}

	@Override
	public void move() {
		System.out.println("펭귄이 움직인다.");
	}

	@Override
	public void water() {
		System.out.println("펭귄을 물에서 사냥하져");
		
	}

	@Override
	public void Test() {
		System.out.println("다중상속 인터페이스 테스트용");
		
	}

}
