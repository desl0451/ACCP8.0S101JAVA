package org.aptech.chapter07.homework3;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;// 和
		int n = 0; // 什么时候换行
		System.out.println("1-100之间不能被7整除的数据为:");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 != 0) {
				n++;
				System.out.print(i + "\t");
				if (n % 4 == 0) {
					System.out.println();
				}
				sum = sum + i;
			}

		}
		System.out.println("\n数据之和为:" + sum);

	}
}
