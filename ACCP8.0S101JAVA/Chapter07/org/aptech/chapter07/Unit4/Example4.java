package org.aptech.chapter07.Unit4;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int click = 0; //����
		int num = 0; //����
		System.out.println("����������Ϸƽ̨ > ��Ϸ�����\n");
		for (int i = 1; i <= 4; i++) {
			System.out.print("�������" + i + "����Ϸ�ĵ����:");
			click = input.nextInt();
			if (click <= 100) {
				continue;
			}
			num++;
		}
		System.out.println("����ʴ���100����Ϸ����:" + num);
		System.out.println("����ʴ���100����Ϸ��ռ�ı���Ϊ:" + (num / 4.0 * 100) + "%");
	}
}
