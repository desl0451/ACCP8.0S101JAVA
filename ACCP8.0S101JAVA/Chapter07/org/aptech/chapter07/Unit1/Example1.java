package org.aptech.chapter07.Unit1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������Ϸ����ƽ̨\n");
		System.out.println("��ѡ����ϲ������Ϸ:\n");
		System.out.println("******************************************");
		System.out.println("\t\t1.������");
		System.out.println("\t\t2.��ţ");
		System.out.println("\t\t3.������");
		System.out.println("\t\t4.������");
		System.out.println("******************************************\n");
		System.out.print("��ѡ��,��������:");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("���ѽ��붷��������");
			break;
		case 2:
			System.out.println("���ѽ��붷ţ����");
			break;
		case 3:
			System.out.println("���ѽ�������������");
			break;
		case 4:
			System.out.println("���ѽ�������������");
			break;
		}
	}
}
