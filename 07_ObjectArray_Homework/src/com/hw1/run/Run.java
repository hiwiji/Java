package com.hw1.run;
/*
import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   // 객체배열을 크기3 으로 할당한 뒤(?)
		   		
		Employee[] emp = new Employee[3];
		   
		   // 3개의 생성자를 이용하여 
		   // 3명의 사원정보를 배열로 생성 후 출력
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', 
		        "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 
		        20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i <emp.length; i++) {
			System.out.println("emp["+i+"] : " + emp[i].information());
		}
		
		System.out.println("===============================================================");
		
		 // 값이 없는 필드에 각각 값을 입력 하여 출력
		
		 emp[0].setEmpName("김말똥");
		 emp[0].setDept("영업부");
		 emp[0].setJob("팀장");
		 emp[0].setAge(30);
		 emp[0].setGender('M');
		 emp[0].setSalary(3000000);
		 emp[0].setBonusPoint(0.2);
		 emp[0].setPhone("01055559999");
		 emp[0].setAddress("전라도 광주");
		 
		 emp[1].setDept("기획부");
		 emp[1].setJob("부장");
		 emp[1].setSalary(4000000);
		 emp[1].setBonusPoint(0.3);
		 
		 for(int i = 0; i < emp.length -1 ; i++) {
			 System.out.println("emp["+i+"] : " + emp[i].information());
		 }
		  
		 
		 System.out.println("===============================================================");
		 // 직원 각각 보너스가 적용된 1년 연봉을 계산하여 출력
		 
		 int aver = 0; // 평균 구하기용 변수를 만들기(?)
		 
		 for(int i = 0; i < emp.length; i++) {
			 int salary = 0; // 개인별 연봉 저장용 변수 만들기??
			 
			 
			 // 연봉 = (급여 + (급여 *보너스포인트)) * 12
			 salary = (int)(emp[i].getSalary() + 
					 (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;

			 System.out.printf("%s의 연봉 : %d원\n", emp[i].getEmpName(), salary); 
					 
			 aver += salary;
		 }
		 
		 
		 System.out.println("===============================================================");
		
		 // 총 직원(=3명)의 연봉의 평균을 구하여 출력
		 System.out.printf("직원들의 연봉의 평균 : %d원", aver / emp.length);
		 
	
	}
		  
		
		   

		 
}*/

