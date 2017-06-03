package org.aptech.chapter06.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入周" + i + "的学习时间:");
			sum += input.nextInt();
		}
		System.out.println("周一至周五每日平均学习时间是:" + sum / 5.0 + "小时");

	}
}
