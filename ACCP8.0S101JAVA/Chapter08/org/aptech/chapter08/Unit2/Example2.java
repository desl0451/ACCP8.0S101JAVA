package org.aptech.chapter08.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] price = new double[5];
		double sum = 0.0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		for (int i = 0; i < price.length; i++) {
			System.out.print("�������" + (i + 1) + "�ʹ�����:");
			price[i] = input.nextDouble();
			sum += price[i];
		}
		System.out.println("\n���\t\t\t���(Ԫ)");
		for (int i = 0; i < price.length; i++) {
			System.out.println(i + 1 + "\t\t\t" + price[i]);
		}
		System.out.println("�ܽ��:" + "\t\t\t" + sum);
	}
}
