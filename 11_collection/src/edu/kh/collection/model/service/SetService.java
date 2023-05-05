package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Member;   


public class SetService {

	// Set(집합)
	// - 순서를 유지하지 않음(== 인덱스 없음) // <=순서를 유지하지 못하는 이유
	// - 중복을 허용하지 않는다. ( + null도 중복X, 1개만 저장 가능)
	
	// ***** Set이 중복을 확인하는 방법 *****  ★★★★아주중요한개념 꼭꼭기억하기
	// 컬렉션은 객체만 저장할 수 있음 (Set은 컬렉션이기 때문에 객체만 저장)
	// -> 객체가 가지고 있는 필드값이 모두 같으면 중복으로 판단
	// --> 이 때 필드값이 모두 같은지 비교하기 위해서
	//     객체에 "equals()" 가 반드시!!! 오버라이딩 되어야 한다.
	
	
	public void ex1() {
		
		Set<String> set = new HashSet<String>();   // 3,4열에 Set과 HashSet 직접 import 써줌
		  // -> 저장하고 있는 객체 : String임
		
		// HashSet : Set의 대표적인 자식 클래스
		// 사용조건 1 : 저장되는 객체 equals() 오버라이딩 필수
		// 사용조건 2 : 저장되는 객체 hashCode() 오버라이딩 필수
		// String은 굉장히 완성도 높은 클래스로,
		// 이미 equals, hashCode가 오버라이딩 되어있음
		// 다른클래스 만들 때는 equals, hashCode가 오버라이딩 해야함.
		
		// Set.add(String e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("쿠팡");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add("배민");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		// 확인한 것 : 1. 순서 유지  X / 2. 중복 X  / 3. null 중복 X
		
		//size() : 저장된 데이터의 개수 반환
		System.out.println("저장된 데이터의 수 : " +set.size() );		
		
		// remove(String e) : Set에 저장된 객체 중 매개변수 e와  
		// 					  필드 값이 같은 객체를 제거
		//					+ Hash라는 단어가 포함된 Set이면 hashCode()도 같아야함.
		
		System.out.println( set.remove("배민") ); // 삭제하면 True, 못지우면 False
		System.out.println( set.remove("당근") ); // 삭제가 안되어서 False 뜸
		
		System.out.println(set);  // 제거 확인용도용 / 52행 배민 지워진거 확인완료함 
		
		// 
		
		// List는 index가 있어서 get()로 요소 하나 얻어올 수 있었지만,
		// Set은 순서가 없어서 저장된 객체 하나를 얻어올 수 있는 방법이 없다.
		// (set은 주머니에서 순서상관없이 꺼내오는 것과 같은 느낌...)
		// -> 대신에 Set 전체의 데이터를 하나씩 반복적으로 얻어올 순 있다.
		//    그걸 아래 Iterator 를 통해 할 수 있다.^_^
		
		
		// 1. Iterator (반복자)
		// - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
		// (컬렉션에 저장된 데이터를 임의로 하나씩 반복적으로 꺼내는 역할)
		
		// ** Iterator 사용방법
		Iterator<String> it = set.iterator();   // 이것도 import 해줌
		//set.iterator() : Set을 Iterator 하나씩 꺼내갈 수 있는 모양으로 변환
		
		while(it.hasNext() ) {  // hasNext : 다음 값이 있는지?
			//it.hasNext() : 다음 값이 있으면 true를 반환
			//it.next() : 다음 값(객체)를 얻어와서 저장해주는 애 != sc.next()와 다름
			
			String temp = it.next();
			System.out.println(temp); 
		} 
			
		System.out.println("========================================");
		
		// 이에 Iterator는 너무 어려워@@@@ ㅠㅠㅠㅠㅠㅠㅠㅠ 
		// 향상된 for문을 사용
		// for ( 하나씩 꺼내서 저장할 변수 : 컬렉션)
		// 내부로직은 Iterator와 같지만 훨씬 간결합니다^_^
		
		for(String temp :set) {
			System.out.println(temp);
		}
			
	}
	
	
	
	public void ex2() {   //member클래스 같이 사용함
		 
		// Hash 함수 : 입력된 단어를 지정된 길이의 문자열로 변환하는 함수(중복X)
		// ex) 입력 : 111 -> "asdfg" ( 5글자)
		// ex) 이력 : 1234579789 -> "qwert" (5글자)
		// == HashCode 암호화에 사용함
		// 암호와에 사용하는 이유 : 일정한 길이의 랜덤값 생성, 중복되지 않음
		
		// hashCode() : 필드 값이 다르면 중복되지 않는 숫자를 만드는 메서드
		// -> 왜만들까? 빠른 데이터 검색을 위해서 (객체가 어디에 있는지 빨리 찾고, 찾기 쉬움.)
		
		// HashSet() : 중복없이 데이터 저장(set)하고 데이터 검색이 빠름(Hash)
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user02", "pass02", 20);
		
		System.out.println( mem1 == mem2 ); // 참조형이기 때문에 주소를 비교(false)
		// 얕은 복사 경우가 아니라면 다 false
		
		if(mem1.getId().equals(mem2.getId()) ) {
			if( mem1.getPw().equals( mem2.getPw()) ) {
				if( mem2.getAge() == mem2.getAge())  {
					System.out.println("같은 객체입니다. (true) ");
				}
			}
		}
	
		// ==> 매번 이렇게 비교하기 힘듬... 
		// 지금은 필드값이 3개지만 필드값이 100개면 하나하나 어느세월에 써주나요.......
		
		// == equals() 메소드 오버라이딩
		
		System.out.println("=============================");
		
		System.out.println(mem1.equals(mem2) ); // mem1, mem2의 필드가 같은가?
		// => 결과값 true
		
		System.out.println(mem1.equals(mem3) ); // mem1, mem3의 필드가 같은가?
		// => 결과값 false
		
		// equals 출처 확인하면 오버라이딩 된걸로 넘어감... 
		// 이게 이해 안되면 ★★★객체 & 상속 & 다형성 ★★★ 꼼꼼히 공부하세요
				
	}
	
	
	
	public void ex3() {
		
		// 오버라이딩 된 equals()를 이용하여 Member를 Set에 저장
		
		// [Key Point!] : 중복이 제거 되는가?
		
		Set<Member> memberSet = new HashSet<Member>();  
		 // => Member만 들어올 수 있는 set임 제네릭 <> 써서 
	
		memberSet.add(new Member("user01", "pass01", 30) );
		memberSet.add(new Member("user02", "pass02", 40) );
		memberSet.add(new Member("user03", "pass03", 20) );
		memberSet.add(new Member("user04", "pass04", 25) );
		memberSet.add(new Member("user04", "pass04", 25) );
		
		// 향상된 for문 사용
		for( Member mem : memberSet ) {
			System.out.println(mem);
			// => 순서는 지맘대로지만 중복제거는 되어있다. 출력값 4개만 나옴
			// 실제 중복된거 없어지는 건 Member클래스에 오버라이딩 된 hashCode 때문임.
			// hashCode 주석처리(Member클래스 58~61행) 하면 중복값도 그대로 출력됨.
	
		}
		
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user02", "pass02", 20);
	
		System.out.println(mem1.hashCode() );
		System.out.println(mem2.hashCode() );
		System.out.println(mem3.hashCode() );
	}
	
	
	
	public void ex4() {
		// Wrapper 클래스 정의 : 기본자료형을 객체로 포장하는 클래스
	
		// - 컬렉션에 기본 자료형 값을 저장하고 싶을 때 사용
		// - 기본 자료형에 없던 추가 기능, 값을 이용하고 싶을 때 사용 
		
		// <Wrapper 클래스 종류> ★★ 잘외워두기... 내용정리한거 수정하기 
		// int -> Integer 
		// double -> Double
		// Boolean, Byte, Sort, Long, Float, Character, 
		
		int iNum = 10;
		double dNum = 3.14;
		
		// 기본 자료형 -> 포장
		Integer w1 = new Integer(iNum); 
		Double w2 = new Double(dNum);
		// 가운데 밑줄 -> 삭제선 
		// 옛날에 쓰던거라서 사용안하고 곧 없어질 예정.
		
		// Wrapper 클래스 활용
		System.out.println("int 최대값 : " + w1.MAX_VALUE); // 기울어진 글씨는 static
		// => 양수에서의 int 최대값 출력
		System.out.println("int 최대값 : " + w1.MIN_VALUE); // 기울어진 글씨는 static
		// => 음수에서의 int 최대값 출력
		
		System.out.println("========static 방식으로 Wrapper클래스 사용 ========="); 
		
		System.out.println("int 최대값 : "+ Integer.MAX_VALUE);
		System.out.println("int 최소값 : "+ Integer.MIN_VALUE); // static
		
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE); // static
		
		// ***************************************************************
		
		// parsing : 데이터의 형식을 변환
		
		// String 데이터를 기본 자료형으로 변환 
		
		int num1 = Integer.parseInt("100");
		double num2 = Double.parseDouble("1.23456");
		
		System.out.println(num1); // 숫자 100 출력
		System.out.println(num2); // 실수 1.23456 출력
		System.out.println(num1 + num2);  
		// -> 문자열인지, 숫자인지 확인하는용도.  Double형에 맞춰서 더해짐  
		
		
		// ***************************************************************
	}



	public void ex5() {
		// Wrapper클래스의 AutoBoxing / AutoUnboxing

		Integer w1 = new Integer(100); 
		
		Integer w2 = 100;
		Integer w3 = 200;
	//(Integer)    (int -> Integer) 자동포장
		           // AutoBoxing
		
		// w2와100은 원래 연산이 안되어야 하지만
		// Integer는 int의 포장형식이라는걸 Java가 인식하고 있음
		// -> 위와 같은 경우 int를 Integer로 자동 포장 해준다.
		
		System.out.println("w2 + w3 = " + (w2 +w3));
		
		// w2 + w3 == 객체 + 객체 (Integer는 객체임) => 객체끼리 더하는건 원래 불가능함 
		
		// 하지만 Integer는 int의 포장형태라는걸 Java가 인식하고 있음
		// -> 연산시 포장을 자동으로 벗겨냄. 
		// Interger + Integer -> int + int (자동포장 해제)
								//=> 위 내용을  AutoUnBoxing 이라고 함 
		
		
		
		
		
	}


	
	public void lotto() {
		
		// 로또 번호 생성기 Ver2
		
		// HashSet
		// LinkedHashSet  // 순서유지 Set
		// TreeSet (오름차순)
		
		Set<Integer> lotto = new HashSet<Integer>();  // 순서유지x, 중복제거만
		// Integer는 equals(), hashCode() 오버라이딩 완료 상태
		//Set<Integer> lotto = new LinkedHashSet<Integer>();  // 순서유지 Set, import 해주기
		//Set<Integer> lotto = new TreeSet<Integer>();  // 자동정렬 Set,  import 해주기
		
		
		while( lotto.size() < 6) {
			// lotto에 저장된 값이 개수가 6개 미만이면 반복
			
			int random = (int)(Math.random() * 45 + 1); // 1~45까지의 난수만 발생하도록 만들기
			// 그냥 돌리면 미스매치 나서 강제형변환 해줘야함
			
			System.out.println(random); // 발생순서 확인
			
			
			lotto.add(random);
			// int값이 자동으로 Integer로 포장(AutoBoxing)되어 lotto 추가
			
		}
		
		
		System.out.println("로또 번호 : " + lotto);
		
		
		
	}
	
	
	
} 
