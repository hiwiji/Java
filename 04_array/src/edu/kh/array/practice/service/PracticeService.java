package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		/*길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		/순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		/짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		[실행 화면]
		1 2 3 4 5 6 7 8 9
		짝수 번째 인덱스 합 : 25
		**/
		
		int []arr = new int[9];   //배열 선언 및 할당
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");  // 대입 및 출력
		  
				 if (i % 2 == 0) { // 짝수 인덱스
					 sum += arr[i];
				 } 		              
		} 
	    System.out.println();         // 위에 숫자 출력된거 엔터처리
	   	System.out.println("짝수 번째 인덱스 합 :" + sum);			
	}
	
	public void practice2() {
		/*길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		[실행 화면]
		9 8 7 6 5 4 3 2 1
		홀수 번째 인덱스 합 : 20
		**/
		
		int arr[] = new int[9];   //배열 선언 및 할당
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");  // 대입 및 출력
		  
				 if (i % 2 == 1) { // 홀수 인덱스
					 sum += arr[i];
				 } 		              
		} 
	    System.out.println();         // 위에 숫자 출력된거 엔터처리
	   	System.out.println("홀수 번째 인덱스 합 :" + sum);			
		
	}
	
	public void practice3() {
		/*메소드 명 : public void practice3(){}
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		[실행 화면]
		양의 정수 : 5
		1 2 3 4 5
		* */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수 : ");  // 사용자에게 입력받은 양
		
		int[]arr = new int[sc.nextInt()];   
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice4() {
		/*메소드 명 : public void practice4(){}
		1) 정수 5개를 입력 받아 배열을 초기화 하고   //배열 할당 arr
		2)검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		3)배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

		[실행 화면 1]         [실행 화면 2]
		입력 0 : 5           입력 0 : 5
		입력 1 : 8			입력 1 : 8
		입력 2 : 9			입력 2 : 9
		입력 3 : 10			입력 3 : 10
		입력 4 : 4			입력 4 : 4
		검색할 값 : 8			검색할 값 : 1
		인덱스 : 1			일치하는 값이 존재하지 않습니다.
		**/
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i =0; i < arr.length; i++) {
			System.out.printf("입력 %d : ",i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		
		boolean flag = true;
		
		for(int i=0; i <arr.length; i++) {
			if(arr[i] == search) {
				System.out.println("인덱스: " +i);
				flag = false;
				break;
			}
		}	
		
		if(flag) System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	public void practice5() {
		/*메소드 명 : public void practice5(){}
		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		[실행 화면]
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8
		i 개수 : 2
		**/
		
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 사용자가 입력한 문자열(input)을 문자하나하나를 char배열에 넣기
		// -> 먼저 사용자가 입력한 문자열 길이만큼의 char 배열을 할당
		char[] arr = new char[str.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);      
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악
		
		int count = 0; // 검색할 문자가 문자열에 몇 개가 들어있는지를 세어줄 변수
		//문자열에서 동일한 문자가 발생할 때마다 1씩 증가
		
		// 반복문 수행전 문자열 출력
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스): ");
	
	    // 인덱스마다 접근하기 위해 반복문 사용
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
				System.out.print(i+ " ");   // 해당 인덱스 이어서 출력
				
				count++;     // 그리고 count 1 증가
			}
		}
		
		// 위에서 print()를 사용했기 때문에 개행이 되어있지 않음
		System.out.println();         // 줄바꿈
		System.out.println(ch + "개수: " + count);
	}

	
	public void practice6() {
		/*메소드 명 : public void practice6(){}
		1) 사용자가 배열의 길이를 직접 입력하여 2)그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		[실행 화면]
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2
		총 합 : 2
		**/
		
		//  1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);  // 배열의 길이 직접입력
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];   // 정수형 배열 선언 및 할당
		
		// 2. 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스 값을 초기화
		for(int i=0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		
		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " +sum);
	}	
	
	public void practice7() {
		/*메소드 명 : public void practice7(){}
		1)주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.

		[실행 화면]
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input  = sc.next();
		
		char[]arr = new char[input.length()];
		
		for (int i = 0; i < arr.length; i++) {
			if(i <=7) { // 7번 인덱스 이하 (생년월일, - , 성별)
			arr[i] = input.charAt(i);              
			} else { // 8번 인덱스 이상부터는 *
			arr[i] = '*';
			}
			System.out.print(arr[i]);
	    }
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
	}
	
	public void practice14() {
		
	}
}
