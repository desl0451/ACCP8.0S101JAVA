package org.aptech.chapter03.Unit4;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		System.out.print("请输入一个整数:");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if (i % 3 == 0 || i % 5 == 0) {
			System.out.println("该整数是3或5的倍数.");
		} else {
			System.out.println("该数不能被3或5中的任何一个数整除.");
		}
	}
}
