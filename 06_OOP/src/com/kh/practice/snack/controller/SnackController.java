package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();  //변수는 기본생성자 위에 만든다 
	
	public SnackController() {} // 기본생성자
	
	// 데이터를 setter를 이용하여 저장하고, 저장완료 결과 반환하는 메소드
	public String saveData(String kind, String name, String flavor, 
			int numOf, int price) {
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다."
				+ "\n저장한 정보를 확인하시겠습니까?(y/n) : ";
	}
	
	public String confirmData() {
		// 저장된 데이터를 반환함
		return s.infomation();
		// s.infomation()
		// ==  kind +"(" + name + " - " + flavor +  ") " + numOf +"개 " + price+"원";
	}
}
