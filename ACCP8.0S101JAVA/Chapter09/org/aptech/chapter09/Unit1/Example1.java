package org.aptech.chapter09.Unit1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������4λѧԱ�ĳɼ�:");
		int[] score = new int[4];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print("��" + (i + 1) + "λѧԱ�ĳɼ�:");
			score[i] = input.nextInt();
			sum += score[i];
		}
		System.out.println("����ѧԱ��ƽ������:" + (sum / 4.0));
	}
}
