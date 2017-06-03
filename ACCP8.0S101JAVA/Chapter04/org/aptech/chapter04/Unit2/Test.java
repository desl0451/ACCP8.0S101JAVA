package org.aptech.chapter04.Unit2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner shuru = new Scanner(System.in);
		System.out.println("请输入星期几:");
		int xingqi = shuru.nextInt();
		switch (xingqi) {
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
