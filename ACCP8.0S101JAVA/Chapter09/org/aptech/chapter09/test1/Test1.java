package org.aptech.chapter09.test1;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
//		*****
//		*****
//		*****
//		*****
//		*****
		Scanner input=new Scanner(System.in);
		System.out.print("����������:");
		int row=9;//input.nextInt();
		//���ѭ��5��  ��������
//		for (int i = 1; i <=row; i++) {
//			//�ڲ�ѭ��5�� ������ʾ������
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//                ��            ��
//		*         1     1
//		**        2     2
//		***       3     3
//		****      4     4
//		*****   .....
//		for (int i = 1; i <=row; i++) {
//			//�ڲ�ѭ��5�� ������ʾ������
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
//                  ��        ��        
//		*            1����   1   ����*2-1
//		***          2����   3  2*2-1
//		*****        3����   5  3*2-1
//		*******      4����   7  4*2-1
//		*********    5����   9  5*2-1
		System.out.println();
		for (int i = 1; i <=5; i++) {
			//�ڲ�ѭ��5�� ������ʾ������
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		*****
//		****
//		***
//		**
//		*




		

	}

}
