package edu.kh.booklist.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.booklist.vo.Bookinfo;
import edu.kh.booklist.vo.Bookmark;


public class BooklistService {
	//필드
	private Scanner sc = new Scanner(System.in);// 검색 목록 보일 스캐너 출력
	
	private List<Bookinfo> bookList = new ArrayList<Bookinfo>();  // 등록할 북리스트 만들기 
	//기본생성자  

	public BooklistService() {
		bookList.add(new Bookinfo("c++ 배우기", "김혜남", 20000, "영진출판사"));
		bookList.add(new Bookinfo("Java 배우기", "김호연", 30000, "영진출판사"));
		bookList.add(new Bookinfo("Spring 배우기", "정지아", 10000, "웅진출판사"));
		bookList.add(new Bookinfo("DB-SQL 배우기", "이준영", 40000, "웅진출판사"));
	}
	
	
	public void displayMenu() {
		int menuNum = 0; 
		
		do { 
			System.out.println("\n================도서 목록 프로그램 ================\n");
			System.out.println("1. 도서 목록 등록");
			System.out.println("2. 도서 목록 조회");
			System.out.println("3. 도서 목록 수정");
			System.out.println("4. 도서 목록 삭제");
			System.out.println("0. 프로그램 종료"); 
			
			System.out.print("\n메뉴번호 입력 >>> ");
  			
			// try-catch 만들기
			try {
				menuNum = sc.nextInt(); 
				sc.nextLine(); // 줄바꿈용도
				
				switch(menuNum) {
				case 1 : bookresister(); break;
				case 2 : bookcheck(); break;
				case 3 : bookupdate(); break;
				case 4 : bookremove(); break;
				case 0 : System.out.println("프로그램 종료합니다..."); break;
				default : System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다!");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("\nerror : 입력 형식이 유효하지 않습니다. 다시 시도해주세요!");
				sc.nextLine();  // 버퍼, 줄바꿈 용도
				menuNum = -1; 
			}
				
				
		} while(menuNum != 0);
		
		
	
	}
	
	

	
	
	// 1. 도서 목록 등록
	public void bookresister(){
		System.out.println("==========1.도서 목록 등록=============");
		
		System.out.println("도서명 : ");
		String bookName = sc.next();
		
		System.out.println("저자 : ");
		String bookAuthor = sc.next();
		
		System.out.println("도서 가격 : ");
		int bookPrice = sc.nextInt();
		
		System.out.println("출판사 : ");
		String bookPublisher = sc.next();
		
	}
	
	// 2. 도서 목록 조회
	public void bookcheck() {
		System.out.println("==========2.도서 목록 조회=============");
		
		if(bookList.isEmpty() ) {
			System.out.println("도서 목록이 없습니다.");
		
		}else {
			System.out.println("=====0조 도서목록=====");
			for(Bookinfo temp : bookList) {
				System.out.println(temp.toString()) ;
		
		}
		}
		
	}
	
		
	
	// 3. 도서 목록 수정
	public String bookupdate() {
		
		System.out.println("==========3.도서 목록 수정=============");
		
		System.out.print("인덱스 번호 입력: ");
		int index = sc.nextInt();
		sc.nextLine(); // 줄바꿈
		
		if(bookList.isEmpty() ) {
			return "입력된 도서가 없습니다.";
		
		} else if (index <0 ) {
			return "음수는 입력할 수 없습니다.";
		
		} else if (index >= bookList.size()) {
			
			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			
			
			System.out.println(index + "번째 인덱스에 저장된 도서 목록");
			System.out.println(bookList.get(index));
			
			System.out.println("도서명 : ");
			String bookName = sc.next();
			
			System.out.println("저자 : ");
			String bookAuthor = sc.next();        
			
			System.out.println("도서 가격 : ");
			int bookPrice = sc.nextInt();
			
			System.out.println("출판사 : ");
			String bookPublisher = sc.next();
			
		
		Bookinfo temp = bookList.set(index, new Bookinfo(bookName, bookAuthor,
														bookPrice, bookPublisher) );
		
		return temp.getBookName()+"의 도서 목록이 변경되었습니다.";
		}
		
	}
	
	// 4. 도서 목록 삭제
	public String bookremove() throws InputMismatchException{
		
		System.out.println("==========4.도서 목록 삭제============="); 
		
		System.out.println("인덱스 번호 입력: ");
		int index = sc.nextInt();
		sc.nextLine(); // 줄바꿈
		
		if(bookList.isEmpty() ) {
			return "입력된 도서가 없습니다.";
		
		} else if (index < 0 ) {
			return "음수는 입력할 수 없습니다.";
		
		} else if (index >= bookList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			
			System.out.print("정말 삭제 하겠습니까? (Y/N): ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch=='Y') {
				Bookinfo temp = bookList.remove(index);
				return temp.getBookName() + "의 목록이 제거되었습니다.";
			
			} else {
				return "취소";
			}
		}
	}
		
	

	
	//즐겨찾기 txt파일 출력하기 
	public void bookmark() {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("favorites.txt");
			String str = "===== 0조 입력찾기 목록 ====="; 
		
			
			fw.write(str);
			
		
		} catch(IOException e) {
			e.printStackTrace();
	
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	} 
	
	
	
	
	
}

