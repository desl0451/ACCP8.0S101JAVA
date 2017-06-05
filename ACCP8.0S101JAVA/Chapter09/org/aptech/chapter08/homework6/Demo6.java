package org.aptech.chapter08.homework6;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入菱形行数:");
		int row = input.nextInt();
		while (row % 2 == 0) {
			System.out.println("请输入奇数行");
			row = input.nextInt();
		}
		for (int i = 1; i <= row; i++) {
			if (i <= (row + 1) / 2) {
				for (int j = 1; j <= (row + 1) / 2 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= i - (row + 1) / 2; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (row + 1 - i) * 2 - 1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
