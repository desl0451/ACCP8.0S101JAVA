package org.aptech.chapter07.Unit3;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money = 0;
		int discount;//�ۿ�
		System.out.println("����������Ϸƽ̨ > ��Ϸ��֧��\n");
		System.out.println("��ѡ�������޵���Ϸ����:\n");
		System.out.println("\t\t1.����");
		System.out.println("\t\t2.���о�����\n");
		System.out.print("��ѡ��:");
		int choice = input.nextInt();
		System.out.println("����������Ϸʱ��:");
		int hour = input.nextInt();
		switch (choice) {
		case 1:
			if (hour > 10) {
				discount = 5;
			} else {
				discount = 8;
			}
			money = hour * discount;
			System.out.println("�������������Ϸ��ʱ����:" + hour + "Сʱ,��������" + discount + "���Ż�");
			break;
		case 2:
			if (hour > 10) {
				discount = 5;
			} else {
				discount = 8;
			}
			money = hour * discount * 2;
			System.out.println("�������������Ϸ��ʱ����:" + hour + "Сʱ,��������" + discount + "���Ż�");
			break;
		}
		System.out.println("����Ҫ֧��" + money + "����Ϸ��");
	}
}
