package edu.kh.oarr.model.vo;

public class Member {
	// 필드 == 멤버변수
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;  //지역(서울,경기,충북,전남...)
	
	// 생성자
	// 생성자 규칙
	// 1. 생성자 이름은 클래스명과 같아야 한다.
	// 2. 반환형이 없다.
	public Member() {} // 기본생성자

	 // 매개변수 생성자
	 // alt + shift + s => generate constructor using field 클릭
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}
	// 메소드
	// getter/setter
	// alt + shift + s + r => select all => Generate
	
	 /*getter
	  * 다 접근 가능하도록 public
	  * String 자료형 돌려보내겠다.
	  * 매개변수가 없어서 중복된 이름의 memberId가 없기 떄문에 memberId라고만 써도 ok
	  * */
	public String getMemberId() {
		return memberId;
	} 

	public void setMemberId(String memberId) {
		
	  /* setter는 말그대로 세팅하는 애.
	   * 무엇을 셋팅할지 전달받아올 아이가 필요합니다!! ==? 매개변수
	   * setter는 ★보통★ 변환 값은 없음 => void    
	   * */ 
		this.memberId = memberId;
		// 모든 메서드는 종료시 호출한 곳으로 돌아가는
		// return 구문이 작성되어야 하지만 단, void일 경우 생략 가능하다.
		// -> 생략 시 컴파일러가 자동 추가 (우리눈에는 안보일 뿐)
		// return;
	}
		public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
