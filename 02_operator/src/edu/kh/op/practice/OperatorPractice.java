package edu.kh.op.practice;

import java.util.Scanner;

import edu.kh.op.ex.OpExample;

public class OperatorPractice {


	
	
	
	
		public void practice1(){
	/*
	 *  ��� ����� ������ ���� ������������ �Ѵ�.
	 *  �ο� ���� ���������� Ű����� �Է� �ް�
	 *  1�δ� �����ϰ� �������� ����������
	 *  �����ְ� ���� ������ ������ ����ϼ���.
	 *  
	 *  [����ȭ��]
	 *  �ο� �� : 29
	 *  �������� : 100
	 *  1�δ� �������� : 3
	 *  ���� �������� : 13
	 **/
	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int input = sc.nextInt();
		
		
		System.out.print("���� ���� : ");
	    int candy = sc.nextInt();
		
	    System.out.println("1�δ� ���� ���� : " + candy / input);
	    System.out.println("���� ���� ����" + candy % input );
}
		
		public void practice2() {
			/*
			 * Ű����� �Է� ���� ������ ������ ����ϰ�
			 * ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
			 * ex.
			 * �̸� : ȫ�浿
			 * �г�(������) : 3
			 * �г�(������) : 4
			 System.out.print("�г�(������) : ");
			 System.out.print("��(������) : ");
			 
			 */
			
			 Scanner sc = new Scanner(System.in);
			 System.out.print("�̸� : ");
			 String name = sc.next();
			
			 System.out.print("�г�(������) : ");
			 int grade = sc.nextInt();
			 
			 System.out.print("��(������) : ");
			 int classRoom = sc.nextInt();

			 System.out.print("��ȣ(������) : ");
			 int number = sc.nextInt();
			 
			 System.out.print("����(���л�/���л�) : ");
			 String gender = sc.next();
			 
			 System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
			 double score = sc.nextDouble();
			 
			 System.out.printf("%d�г� %d�� %d�� %s %s �� ������ %.2f�� �Դϴ�.",
					           grade, classRoom, number, name, gender, score);
			 				
		}

		 
	    public void practice3() {
	    	/*
	    	 * ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
	    	 * �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���
	    	 * 
	    	 * [����ȭ��]
	    	 * ���� : 60
	    	 * ���� : 80
	    	 * ���� : 40
	    	 * �հ� : 180
	    	 * ��� : 60.0
	    	 * 
	    	 */
	    	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("���� : ");
	    int kor = sc.nextInt();
	    
	    System.out.print("���� : ");
	    int eng = sc.nextInt();
	    
	    System.out.print("���� : ");
	    int math = sc.nextInt();
	    
	    int sum = kor + eng + math; // �հ�
	    double avg = sum / 3.0;    // ���
	       	
	    	System.out.println("�հ� : " + sum);
	    	System.out.printf("��� : %.1f", avg);     	
	    	
	    	
	    /// �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
	    /// �� ���� ������ ���� 40 �̻��ӳ༭ ����� 60�� �̻� �� �� �հ�,
	    /// �ƴ϶�� ���հ��� ����ϼ���.
	    	
	    boolean result = (kor >= 40) && (eng >=40) && (math >= 40 ) && (avg >= 60 );
	    
	    System.out.println();
	    System.out.println( result ? "�հ�" : "���հ�");
	           //���ǽ�? ��1 : ��2
	    
	    
	    
	    	
	    }
}
	
