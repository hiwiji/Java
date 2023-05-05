package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
      // Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
      // Scanner 생성
	  // -> 프로그램 안에 스캐너라는 기계를 만든 것
      Scanner sc = new Scanner(System.in);
	  // import를 안해와서
	  // Scanner를 만들어서 쓰고 싶은데 설계도가 없음
	  // import 해오라는 에러 발생! ==> import 해오면 오류 해결
	  //System.out.print("값을 입력하시오: ");
	  //int input1 = sc.nextInt();// 입력 받은 정수를 input1에 대입 
	  // nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
	  //System.out.println(input1);
	  
	  
	  // System.out.println("실수만 입력해:");
	  // double input2 = sc.nextDouble();
	  // System.out.println(input2);
	  
      
      // 안녕? 반가워! 밥먹을래?  순차적으로 입력해보기
      System.out.print("입력1: ");     // 처음 입력 단어 하나 
      String input3 = sc.next();    
      // next() : 다음 입력된 한 단어를 읽어옴
      System.out.println(input3);
      
      System.out.println("입력2: ");
      String input4 = input3 + sc.next();   // 두 단어 동시에 입력됨
      // next() : 다음 입력된 한 단어를 읽어옴
      System.out.println(input4);
      
      //System.out.print("입력1: ");
      //String input3 = sc.nextLine();  //입력 값에 모든 단어 띄어쓰기 포함해서 입력 하면
      // nextLine() : 입력된 모든 단어가 그대로 출력됨 
      //System.out.println(input3);       // 그 값이 결과값으로 나옴
      
      
	}

}
