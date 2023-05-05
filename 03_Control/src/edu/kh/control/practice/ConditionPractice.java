package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");			
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		
		
		
		
	}
	
	public void practice3() {}
	
	public void practice4() {}
	
	public void practice5() {}
	
	

	
}
