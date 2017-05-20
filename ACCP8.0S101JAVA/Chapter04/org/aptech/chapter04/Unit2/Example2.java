package org.aptech.chapter04.Unit2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// 使用switch结构实现:
		//为小明制订学习计划,
		// 星期一,星期三,星期五学习编程,
		// 星期二,星期四,星期六学习英语,
		// 星期日 休息.
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几:");
		int day = input.nextInt();
		switch (day) {
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语");
			break;
		case 7:
			System.out.println("休息");
			break;
		default:
			break;
		}
	}

}
