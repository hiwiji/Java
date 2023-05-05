package com.hw3.model.vo;

public class Product {
	//필드
	private String brand;
	private String name;
	private String color;
	private int price;
	
	//생성자
	public Product() {} //기본생성자
	
						//매개변수 생성자
	public Product(String brand, String name, String color, int price) {
			this.brand = brand;
			this.name = name;
			this.color = color;
			this.price = price;
	}
		
	
	
	//메소드
	
}
