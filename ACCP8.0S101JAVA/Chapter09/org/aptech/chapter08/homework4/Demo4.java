package org.aptech.chapter08.homework4;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("�������" + i + "���༶,��" + j + "��ѧԱ�ĳɼ�:");
				score = input.nextInt();
				if (score > 85) {
					sum += score;
					count++;
				}
			}
		}
		System.out.println("��" + count + "��ѧԱ����85��");
		System.out.println("ƽ������:" + sum / count);
	}
}
