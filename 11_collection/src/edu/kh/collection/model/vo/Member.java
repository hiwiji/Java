package edu.kh.collection.model.vo;

import java.util.Objects;

public class Member {
	//필드
	private String id;
	private String pw;
	private int age;
	
	//기본생성자
	public Member() {}
	
	//매개변수 생성자
	public Member(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	// getter, setter 메소드 만들기 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	// toString 만들기
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}
		
	
	//set을 사용 할 때는 equals, Hashcode 오버라이딩 꼭 해주기!!!
	// 밑에 주석내용 처럼 하나하나 쓸 필요는 없고 자동완성 alt +shift + s 눌러서 하기!
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, pw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
	
	
		
	/*
	
	// Object.equals() 오버라이딩
	// - 현재 객체와 매개변수로 전달받은 객체의 필드가 같은지 비교하는 형태로 오버라이딩
	
	public boolean equals(Object obj) // obj를 member라는 객체와 동일하게 해야함. {
		Member other = (Member) obj; // member로 강제형변환 하여 다운캐스팅 한걸
									 //	other로 
		// 단축기 alt + shift + s => Generate Hashcode				
		return this.id.equals(other.id)
				&& this.pw.equals(other.pw)
				&& this.age == other.age; 
		
		//위에 있는 필드(id)와 this id 
	
		
		
	}
	
	
	// Object.hashCode() 오버라이딩
	 * 
	 * 
	 */
	
}
