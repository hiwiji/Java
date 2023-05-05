package edu.kh.poly.model.vo;
	
public class Tesla extends Car { // 전기차
	// Car를 상속받을 수 있도록 => extends Car(부모)
	// ★★6번 : Tesla 라는 클래스 생성 후 
	//         기존 클래스 이름 뒤에 extends Car라고 써주기
	
	private int batteryCapacity; //배터리 용량  (테슬라에만 있는거)
	
	//★★7번 : 기본생성자 만들고, Super 써주기
	//기본생성자 자동완성 : ctrl + space바 +엔터 
	public Tesla() {  
		super();   // Car  이상해여
	}

	//★★8번 : 매개변수 생성자 만들기
	// 매개변수 생성자 단축키 : alt + shift + s + o 들어가서 car드롭박스 안에 채워져 있는걸로 선택
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	//★★9번 : getter/setter 만들기
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	//★★10번 : toString 만들고 + 어노테이션 했다고 Override 상단에 써주기
	//Car.toString()오버라이딩
	@Override
	public String toString() {
		// 밑에 슈퍼는 super.이 아니라 super 참조변수 임
		return super.toString() + " / " + batteryCapacity; 
	}
	

	
}
