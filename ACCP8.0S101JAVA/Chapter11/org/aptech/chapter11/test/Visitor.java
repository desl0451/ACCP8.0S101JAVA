package org.aptech.chapter11.test;

import java.util.Scanner;

public class Visitor {
	String name;// 姓名
	int age;// 年龄

	public void show() {
		Scanner input = new Scanner(System.in);
		while (!"n".equals(name)) {
			if (age >= 18 && age <= 60) {
				System.out.println(name + "的年龄为:" + age + "门票的价格为:20元\n");
			} else {
				System.out.println(name + "的年龄为:" + age + ",门票免费\n");
			}
			System.out.print("请输入姓名:");
			name = input.next();
			if (!"n".equals(name)) {
				System.out.print("请输入年龄:");
				age = input.nextInt();
			}
		}
		System.out.println("退出程序!");
	}
}
