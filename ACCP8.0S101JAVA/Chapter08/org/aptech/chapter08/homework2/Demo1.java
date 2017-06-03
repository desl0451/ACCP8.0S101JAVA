package org.aptech.chapter08.homework2;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] say = new String[5];
		System.out.println("请输入5句话");
		for (int i = 0; i < say.length; i++) {
			System.out.print("第" + (i + 1) + "句话:");
			say[i] = input.next();
		}
		System.out.println("\n逆序输出5句话为:");
		for (int i = say.length - 1; i >= 0; i--) {
			System.out.println(say[i]);
		}
	}
}
