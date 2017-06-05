package org.aptech.chapter09.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		System.out.print("请输入直角三角形的行数:");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
