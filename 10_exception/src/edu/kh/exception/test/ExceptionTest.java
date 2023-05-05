package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	// (메인메소드 자동생성? ) : main 쓰고 ctrl + 스페이스바 누르면 팝업창에 뜸
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int a = 99.9; // 컴파일 에러 ; 대부분 이클립스가 오류 잡아줘서 왼쪽에 원인도 뜸
		// 개발자가 코드 잘못 쓴 경우
		// 코드로 수정 가능!
		
		int a = (int) 99.9; // 1) 변수자료형을 double로 바꾸거나
							// 2) (int)99.9 강제 형변환
		                    // 3) 99.9를 99 or 100 정수형으로 바꾸는 방법
		
		/*while(true) {
			
			// 0입력 시 종료되도록 함.
			System.out.print("정수 입력(0입력 시 종료) : ");
			int input = sc.nextInt();
			
			// 탈출구문
			if(input == 0 ) {
				break;
			} 
		}*/
		
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		// 			  주로 if문으로 처리 가능
		
		int[] arr = new int[3]; // 길이3 : 인덱스 0,1,2까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
			
		if(3 >= arr.length) {
			System.out.println("배열 범위를 초과했습니다.");
		} else {
			arr[3] = 40;
		}
		
		//**배열에 관련된 에러 2가지 (영어와 뜻 통째로 외우기 ★★★★★)
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		// ==> 배열에서 부적절한 인덱스에 접근하려고 할 때 발생 될 수 있는 예외 
		
		// NegativeArraySizeException : 배열이 음수의 크기 일 때 발생 예외
		// 배열의 크기로 음수를 제시했을 때 발생될 수 있는 예외
		
		
		
	}

}
