package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { //클래스
	// 속성 (필드) 
	// 필드는 기본적으로 캡슐화 원칙에 의해 private이라는 접근제한자를 꼭 작성
	// 필드에 변수를 하나 작성하면, 클래스 안에서 어디에서든 사용 가능
	
	private Scanner sc = new Scanner(System.in);
	// System.in : 자바에서 기본적으로 지정해둔 입력장치(키보드)
	
	private Member memberInfo = null;  // 가입한 회원의 정보를 저장할 변수
	// 자료형 Member이며, memberInfo라는
	// 변수명으로 생성 후 null값을 초기화 값으로 저장해둠(명시적으로)
	// ==> memberInfo에 대입할 수 있는 값은 무엇일까?
	
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수

	
	//기능(생성자, 메서드)
	//** 여러기능을 하나의 메소드에 모두 작성하지 말 것!
	//되도록 하나의 기능만 수행하도록 작성
	//메소드는 메소드당 딱 하나의 기능만 가지고 있는게 좋다.
	
	//왜??
	//기능별로 세분화 해놔야 필요한 기능만 호출하여 쓸 수 있다.
	/*
	public void today() {
		// 1. 밥먹는 행위
		// 2. 일하는 행위
	}
	*/
	// public void eat() {}
	// public void work() {}
	// 두가지를 나눠서 메소드를 만들고
	// eat(); work(); 하나씩 불러서 쓸 수 있게 된다.
	
	public MemberService() {}  // 기본생성자 만들어주기
	// public MemberService(int a) {}   // 기본생성자 미 작성시 에러  (이건 매개변수임)

	// ** 메서드 작성법 **
	
	// 	 [접근제한자]      [예약어]              반환형                       메소드명([매개변수])   {  }
	//     public       static         기본자료형(int/double같은거) 
	//   protected      final          참조형(배열,클래스같은거)
	//   (default)     abstract         void
	//    private    static final 
	
	// ** 반환형 void **
	// - 반환(return)이란? 메서드 수행 후 호출부로 돌아가는 것
	// - 반환 값 : 돌아가면서 가져갈 결과 값
	// - 반환 형 : 반환 값의 자료형
	// -> void (텅빈, 없는, 무효의) : 돌려보낼 값(반환 값)이 없다.
	
	
	// 5가지 메서드 테스트
	// 1. 메뉴 화면 출력 기능 
	public void displayMenu() {
		// 일은 하는데요... 결과값은 없어요
		int menuNum = 0; //  메뉴 선택할 변수 만들기 // 얘는 지역변수
		
		do { // do while문 특징!!! 한 번은 무조건 반복
			System.out.println("=====회원 정보 관리 프로그램 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료"); 
			
			System.out.print("메뉴 입력 >>> ");
  			menuNum = sc.nextInt(); // 필드에 작성된 Scanner sc 사용 
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거  ....... 이게 무슨 말이죠.....ㅠㅠㅠㅠ
			
			switch(menuNum) {
			case 1 : System.out.println(signup() ); break;
			case 2 : System.out.println(login()  ); break;
			case 3 : System.out.println(selectMember()  ); break;
			case 4 : 
				// 회원 정보 수정 메서드 수행 후
				// 반환되는 결과를 result 변수에 저장
				int result = updateMember(); // -1 or 1 or 0
				
				if( result == -1 ) {
					System.out.println("로그인 후 이용 해주세요! ");
				} else if( result == 0) {
					System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");
				} else {
					System.out.println("회원 정보가 수정 되었습니다:-)");
				}
				
				break;
			case 0 : System.out.println("프로그램 종료합니다..."); break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다!");
			}
			
		}while(menuNum != 0);  // menuNum이 0이면 반복 종료
	}
	
	
	// 2. 회원가입 기능 
	public String signup() {
		// (반환형)
		System.out.println("*****회원 가입*****");
		System.out.println("아이디: ");
		String memberId = sc.next(); //user01
		
		System.out.println("비밀번호: ");
		String memberPw = sc.next();
		
		System.out.println("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.println("이름: ");
		String memberName = sc.next();
		
		System.out.println("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if( memberPw.equals(memberPw2)) { // 일치하는 경우
			memberInfo = new Member(memberId, memberPw, memberName, memberAge); // 뉴멤버를 통해 매개변수 전달
			return "회원가입 성공!!!";
		
		} else {
			return "회원가입 실패!!!(비밀번호 불일치)";
		}
		
		

	}
	
	// 3. 로그인 메서드 (기능)
	public String login() {
		System.out.println("******로그인******");
		
		// 회원 가입을 했는지 부터 확인
		// memberInfo가 객체를 참조하고 있는지 확인
		
		if(memberInfo == null) { //회원가입을 먼저 안한 경우
			return "회원 가입부터 진행하십쇼";
		}
		
		
		System.out.print("아이디 입력: ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) &&
		   memberPw.equals(memberInfo.getMemberPw()) ) {
			
		   loginMember = memberInfo;
			
		   return loginMember.getMemberName()+"님 환영합니다.";
		   
		} else {
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		}
	}
	
	
	
	
	// 4. 회원 정보 조회 기능            // 숙제숙제
	// 아이디, 이름, 나이
	
	// CRUD ( C:Create R:read U:update D:Delete )
	public String selectMember() {       // 메소드 이름은 selectMember /
		//메소드 이름은 목적에 맞는 이름으로 동사형으로 쓰는게 좋다.
		System.out.println("*******회원 정보 조회******");
		
		// 1) 로그인 여부 확인 -> 필드 loginMember가 참조하는 객체가 있는지 확인
		if (loginMember == null) {
			return "로그인 후 이용해주세요";    // 위에 string이라고 해줘서 한글만써도 오류안남. 숫자쓰면 오류뜸
		}
		
		// 2) 로그인이 되어있는 경우
		//      -> 회원정보를 출력할 문자열을 만들어서 반환(return)
		//         단, 비밀번호는 제외
		
		// 다른 클래스에서 정보 불러와야 해서 get메소드로 불러옴. 리턴값 써주기
		String str = "이름 : " + loginMember.getMemberName(); // 이름 
		str += "\n아이디 : " + loginMember.getMemberId();  // 아이디
		str += "\n나이 : " + loginMember.getMemberAge();  // 나이
		
		// 이름 : 유저일
		// 아이디 : user01
		// 나이 : 50세
		
		return str;           
	}
	
	// 5. 회원 정보 수정 (update) 기능    // 숙제숙제
		public int updateMember() {
			
			System.out.println("\n***** 회원 정보 수정 *****");
			
			// 1) 로그인 여부 판별
			// 로그인이 되어있지 않으면 -1 반환
			if(loginMember == null) {
				return -1;
			}
			
			// 2) 수정할 회원 정보 입력 받기 (이름, 나이)
			System.out.print("수정할 이름 입력 : ");
			String inputName = sc.next();
			
			System.out.print("수정할 나이 입력 : ");
			int inputAge = sc.nextInt();
			//sc.next(), sc.nextInt(), sc.nextDouble()
			//sc.nextLine();
			sc.nextLine();      // 개행(=줄바꿈)하기
			// 입력버퍼 정리하기 
			
			// 3) 비밀번호 입력 받아서
			//    로그인한 회원의 비밀번호와 일치한지 확인
			System.out.print("비밀번호 입력 : ");
			String inputPw = sc.next();
			
			if( inputPw.equals(loginMember.getMemberPw())) {			
			// 4) 비밀번호가 같은 경우
			//    로그인한 회원의 이름, 나이 정보를 입력받은 값으로 변경 후
			//    1 반환
				loginMember.setMemberName(inputPw);
		    // 입력받은 inputName을
		    // loginMember가 참조하는 Member객체의 필드 memberName에 대입
				loginMember.setMemberAge(inputAge);
				return 1;
			} else {
			// 5) 비밀번호가 다를 경우 0 반환
				return 0;
			}
			
			
			
			
			
		}


}
