package org.aptech.chapter10.Unit2;

import java.util.Scanner;

public class LuckyNumber2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println("************��ӭ���뽱�͸���ϵͳ**************");
			System.out.println("\t1.ע��");
			System.out.println("\t2.��¼");
			System.out.println("\t3.�齱");
			System.out.println("***************************************");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("[���͸���ϵͳ > ע��]");
				break;
			case 2:
				System.out.println("[���͸���ϵͳ > ��¼]");
				break;
			case 3:
				System.out.println("[���͸���ϵͳ > �齱]");
				break;
			default:
				break;
			}
			System.out.print("������?(y/n):");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\nϵͳ�˳�,ллʹ��");
	}
}
