package org.aptech.chapter07.Unit5;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no = 0;// �û����
		int age = 0;// �û�����
		int score = 0;// �û�����

		System.out.println("����������Ϸƽ̨ > ����û���Ϣ\n");
		System.out.print("������Ҫ¼���û�������:");
		int num = input.nextInt();
		System.out.println("\n");
		for (int i = 1; i <= num; i++) {
			System.out.print("�������û����(<4λ����>):");
			no = input.nextInt();
			System.out.print("�������û�����:");
			age = input.nextInt();
			if (age < 10) {
				System.out.println("�ܱ�Ǹ,�������䲻��������Ϸ");
				System.out.println("¼����Ϣʧ��!\n");
				continue;
			}
			System.out.print("�������Ա����:");
			score = input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println("�û����:" + no + "\t����:" + age + "\t����:" + score + "\n");
		}
		
	}
}
