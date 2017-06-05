package org.aptech.chapter09.Unit1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位学员的成绩:");
		int[] score = new int[4];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print("第" + (i + 1) + "位学员的成绩:");
			score[i] = input.nextInt();
			sum += score[i];
		}
		System.out.println("参赛学员的平均分是:" + (sum / 4.0));
	}
}
