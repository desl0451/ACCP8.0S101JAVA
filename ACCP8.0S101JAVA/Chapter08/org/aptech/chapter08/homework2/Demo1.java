package org.aptech.chapter08.homework2;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] say = new String[5];
		System.out.println("������5�仰");
		for (int i = 0; i < say.length; i++) {
			System.out.print("��" + (i + 1) + "�仰:");
			say[i] = input.next();
		}
		System.out.println("\n�������5�仰Ϊ:");
		for (int i = say.length - 1; i >= 0; i--) {
			System.out.println(say[i]);
		}
	}
}
