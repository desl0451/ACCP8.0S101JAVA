package org.aptech.chapter03.Unit4;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		System.out.print("������һ������:");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if (i % 3 == 0 || i % 5 == 0) {
			System.out.println("��������3��5�ı���.");
		} else {
			System.out.println("�������ܱ�3��5�е��κ�һ��������.");
		}
	}
}
