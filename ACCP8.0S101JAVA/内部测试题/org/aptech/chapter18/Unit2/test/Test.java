package org.aptech.chapter18.Unit2.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ʮ������");
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		Arrays.sort(num);
		System.out.println("ʮ������������Ҫ��:");
		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1) {
				System.out.print(num[i] + ",");
			} else {
				System.out.println(num[i]);
			}

		}
	}

}
