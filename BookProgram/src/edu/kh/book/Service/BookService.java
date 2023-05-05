package edu.kh.book.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.kh.book.model.vo.Book;


public class BookService {
	
	private List<Book> bookList = new ArrayList<Book>();
	private List<Book> favoriteList = new ArrayList<Book>();
	private Scanner sc = new Scanner(System.in);
	
	public BookService() {
		bookList.add(new Book("잘될 수밖에 없는 너에게", "최서영", 14400, "북로망스"));
	}
	
	public void displayMenu() {
		int menuNum = 0;
	do {
		System.out.println("======도서 목록 프로그램======");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 조회");
		System.out.println("3. 도서 수정");
		System.out.println("4. 삭제 수정");
		System.out.println("5. 도서 즐겨찾기");
		System.out.println("6. 도서 즐겨찾기 삭제");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("입력 >> ");
		
		
		try {
			menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 : System.out.println(bookRegist());break;
			case 2 : bookInquiry();break;
			case 3 : System.out.println(bookModify());break;
			case 4 : System.out.println(bookDelete());break;
			case 5 : bookMarker(); break;
			case 6 : eraseBookMarker(); break;
			case 0 : System.out.print("시스템 종료");break;
			default : System.out.print("잘못 입력함"); break;
			}
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("입력 형식이 유효하지 않음");
			sc.nextLine();
			
			menuNum = -1;
		}
		
		
	}while(menuNum != 0);
	
	}
	
	public String bookRegist() throws InputMismatchException {
		System.out.println("====도서 추가====");
		
		System.out.print("추가할 도서 이름 : ");
		String name = sc.next();
		
		System.out.print("도서의 저자 : ");
		String auther = sc.next();
		
		
		System.out.print("도서의 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서의 출판사 : ");
		String publisher = sc.next();
		
		if(bookList.add(new Book(name, auther, price, publisher)) ) {
			return "성공";
		}else {
			return "실패";
		}
				
	}
	
	public void bookInquiry() {
		System.out.println("====도서 조회====");
		// 책이 없으면 return
		if(bookList.isEmpty()) {
			System.out.println("책을 등록하세요");
			return;
		}
		// 인덱스번호 생성해서 번호붙여서 출력
		int index = 0;
		for(Book bk : bookList) {
			//인덱스 번호 늘리기
			System.out.print(index++);
			System.out.println("번 도서" + bk.toString());
		}
	}
	
	public String bookModify() throws InputMismatchException{
		System.out.print("책 번호 입력 : ");
		int num = sc.nextInt();
		//비어있으면 돌려보내기
		if(bookList.isEmpty()) {
			return "책을 생성하세요";
			//번호 잘못입력하면 돌려보내기
		} else if(bookList.size() <= num) {
			return "도서의 번호를 확인하세요";
		}else {
			System.out.println(num + "번째 도서");
			System.out.println(bookList.get(num));
			
			System.out.print("변경할 도서 이름 : ");
			String name = sc.next();
			
			System.out.print("변경할 저자 이름 : ");
			String auther = sc.next();
			
			System.out.print("변경할 책 가격 : ");
			int price = sc.nextInt();
			
			System.out.print("변경할 책 출판사");
			String publisher = sc.next();
			
			bookList.set(num, new Book(name, auther, price, publisher));
			return num + "번의 책 정보가 변경되었음";
		}
	}
	
	public String bookDelete() throws InputMismatchException {
	
		System.out.print("삭제하려는 도서의 번호");
		int num = sc.nextInt();
		
		
		//도서가 비어있으면 안됨 범위를 벗어나면 안됨
		if(bookList.isEmpty()) {
			return "생성된 도서가 없습니다";
		}else if(bookList.size() <= num) {
			return "도서의 번호를 확인하세요";
		}else {
			System.out.print("도서의 정보를 삭제하시겠습니까?(Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				bookList.remove(num);
				return "도서의 정보가 제거되었음";
			}else {
				return "취소";
			}
		}
		
		
		
		
		
	}
	
	public void bookMarker(){
		System.out.println("=====도서 즐겨찾기====");
		
		System.out.println("즐겨찾기할 도서 등록 번호 : ");
		int index = sc.nextInt();
		
		favoriteList.add(bookList.get(index));
			
		FileWriter fw = null;
		int num = 0;
		try {
		fw = new FileWriter("text1.txt,", true);
		fw.write("======즐겨찾기 도서 목록======\n");
		
		
		for(Book str : bookList) {
			fw.write(num + "번째 ");
			fw.write(str.getBookName() + " ");
			fw.write(str.getAuther()+ " ");
			fw.write(" \n");
			
			num++;
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public String eraseBookMarker() {
		FileWriter fw = null;
		int num = 0;
		
		System.out.print("삭제 할 도서의 인덱스 입력: ");
		int index = sc.nextInt();
		
		if(favoriteList.isEmpty()) {
			return "입력된 도서 정보가 없습니다.";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index >= favoriteList.size()) {

			return "범위를 넘어선 값을 입력할 수 없습니다.";
			
		} else {
			System.out.print("정말 삭제 하겠습니까? (Y/N)");
			char ch = sc.next().toUpperCase().charAt(0);		
			if(ch == 'Y') {
				Book temp = favoriteList.remove(index);
				
				try {
					
					fw = new FileWriter("favorites.txt");
					
					fw.write("===== 즐겨찾기 도서목록 =====\n");
					
					for(Book book : favoriteList) {												
						fw.write(num + "번 ");
						fw.write(book.getBookName()+ " ");
						fw.write(book.getAuther() + "\n");
						
						num ++;
					}
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
				
				return temp.getBookName() + "가 즐겨찾기에서 제거되었습니다.";
				
			} else {
				return "취소";
			}
			
			
			
		}
		
		
	}

}
