package org.aptech.chapter07.homework2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数:");
		int num = input.nextInt();
		int n = 1;
		System.out.print(num + "!=");
		for (int i = 1; i <= num; i++) {
			n = n * i;
			if (i != num) {
				System.out.print(i + "×");
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.println(n);
		
		
	}
}
