package org.aptech.chapter07.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ϸƽ̨ > ��Ϸ����\n");
		int count = 0; //����   ͳ�ƴ���80�ֵĸ���
		String answer = "";//��������?
		int score = 0; //��Ϸ�÷�
		int n = 1;
		do {
			System.out.print("���������" + n + "��,�ɼ�Ϊ:");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
			if (n > 5) {
				System.out.println("��Ϸ����");
			} else {
				System.out.print("��������һ����?(yes/no)");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.println("���Ѿ���;�˳���Ϸ��");
					break;
				} else {
					System.out.println("������һ��");
				}
			}
		} while (n <= 5);

		double rate = count / 5.0;// ����ﵽ80���ϵı���
		if (n > 5) {
			if (rate > 0.8) {
				System.out.println("\n��ϲ!ͨ��һ��");
			} else if (rate > 0.6) {
				System.out.println("\nͨ������,����Ŭ��!");
			} else {
				System.out.println("\n�Բ���,��δ�ܽ���,�̽���Ͱ�!");
			}
		} else {
			System.out.println("\n�Բ���,��δ�ܽ���,�������Ͱ�!");
		}
	}
}
