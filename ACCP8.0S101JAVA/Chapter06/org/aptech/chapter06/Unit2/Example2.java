package org.aptech.chapter06.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("��������" + i + "��ѧϰʱ��:");
			sum += input.nextInt();
		}
		System.out.println("��һ������ÿ��ƽ��ѧϰʱ����:" + sum / 5.0 + "Сʱ");

	}
}
