package org.aptech.chapter18.Unit2.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入十个整数");
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		Arrays.sort(num);
		System.out.println("十个整数的排序要是:");
		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1) {
				System.out.print(num[i] + ",");
			} else {
				System.out.println(num[i]);
			}

		}
	}

}
