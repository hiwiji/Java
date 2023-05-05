package edu.kh.io.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {
	
	//IO
	
	// Input  ( 입력 ) : 외부 -> 내부로 데이터를 들여오는 것
	// Output ( 출력 ) : 내부 -> 외부로 데이터를 내보내는 것
	
	// Stream : 입/출력 통로 역할 (데이터가 흘러가는 통로)
	// 			기본적으로 Stream은 단방향.
	
	
	// 바이트(byte) 기반 스트림
	// 1) 파일 출력 (내부 == 프로그램, 외부 == 파일)
	public void output1() {
		
		FileOutputStream fos = null;
		
		// FileOutputStream fos = new FileOutputStream("test1.txt");
		// Unhandled exception type FileNotFoundException
		// => FileOutputStream 객체 생성 시
		// FileNotFoundException 예외가 발생할 가능성이 있음 -> 예외처리 필요
		
		try {
			fos = new FileOutputStream("test1.txt");
			// 현재 프로그램에서 
			// test1.txt파일로 출력하는 통로 객체 생성
			
			// 이 파일은 목적지가 필요함
			// -> 12_IO 지금 해당된 프로젝트 폴더가
			// 기본 목적지로 설정되어 있음
			
			// 파일에 "Hello" 내보내기
			String str = "Hello";
			
			for(int i = 0; i <str.length(); i++) {
				
				// System.out.println( str.charAt(i) );
				
				// "Hello"를 한 문자씩 끊어서 파일로 출력하기
				fos.write(str.charAt(i) );
				// Unhandled exception type IOException
				// write() 는 IOException을 발생 시킬 가능성이 있다!
				
				
			}
			
		} catch(IOException e) {
			// FileNotFoundException은 IOException의 자식임.
			// 그래서 다형성 적용으로 IOException 하나로 둘 다 잡을 수 있따!
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외 추적하는 것
				
		} finally {
			// 예외가 발생 하든말든 무조건 수행
			
			// 쓸데없는 통로 지우기!
			// --> 자원 반환
			
			// 사용한 스트림 자원반환(통로 없앰) --> 필수 작성!!!
			// 프로그램 메모리 관리 차원에서 항상 다쓰면 끊어줌
			// -> 작성 안하면 문제점으로 꼽을 수 있음.
			
			try {
				fos.close();  
				// IOException예외 발생 하여, try-catch 구문으로 한번 더 작성
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}
	
	
	// 2) 파일 입력 : 외부(파일) -> 내부(프로그램)으로 읽어오기
	public void input1() {
		FileInputStream fis = null;     //객체생성 밖에서 하면 Exception 떠서
		                                //처음에 null 값 써줌
		
		try {
			fis = new FileInputStream("test1.txt");

			// FileInputStream은 1byte씩만 읽어올 수 있음.
			
			while(true) {
				
				int data = fis.read(); // 다음 1byte를 읽어오는데 정수형임
							// 다음 내용이 없으면 -1 반환
				
				if(data == -1 ) { // 다음 내용 없음 => 종료
					break;
				}
				 // 반복 종료가 안됐으면 char로 강제 형변환하여 문자로 출력
				System.out.print((char)data );
				
				
			}
				
				
		} catch(IOException e) {
			e.printStackTrace();  // 예외 추적
		
		} finally {
			
			try {
				fis.close();              // finally에서 fis.close()쓰면 빨간줄 뜨는데
				                          // 밑에 surround~~ 클릭하면 try-catch문으로 자동완성됨
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

	
	
	// --------------------------------------------------------------------
	
	// 문자 기반 스트림
	
	// 3) 파일 출력 ( 문자 기반 스트림 )
	public void output2() {
		
		FileWriter fw = null;  // 프로그램 -> 파일로 쓰는 문자 기반 스트림
		
		try {
		
			fw = new FileWriter("test1.txt"); // 외부 파일과 연결하는 스트림 객체 생성
			// FileWriter 매개변수 생성 할 때 안에 true 전달하면 파일에 결과값 출력 할 때 마다 계속 이어써짐
			// ex) fw = new FileWriter("test1.txt", true);
												
			String str = "안녕하세요. Hello. 1234 !#";
			
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

	
	
	// 4) 파일 입력 
	public void input2() {
		FileReader fr = null;                // 1번
		
		try {								// 2번 : try-catch-finally 만들기 
			
			 // 파일로부터 읽어오는 통로 객체 생성
			fr = new FileReader("test1.txt");
			
			while(true) {
				
				int data = fr.read(); // 다음문자 읽어옴. 없으면 -1
				
				if(data == -1) {
					break;
				}
				
				System.out.print( (char) data);
			}
			
			
			
		} catch (IOException e) {			// 3번 : catch 안에 예외 및 예외추적 써주고
			e.printStackTrace(); // 예외추적
			
		} finally {
			try {
				fr.close();					// 4번 : close()문 써주기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
