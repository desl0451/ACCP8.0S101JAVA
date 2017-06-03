package org.aptech.chapter07.Unit5;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no = 0;// 用户编号
		int age = 0;// 用户年龄
		int score = 0;// 用户积分

		System.out.println("青鸟迷你游戏平台 > 添加用户信息\n");
		System.out.print("请输入要录入用户的数量:");
		int num = input.nextInt();
		System.out.println("\n");
		for (int i = 1; i <= num; i++) {
			System.out.print("请输入用户编号(<4位整数>):");
			no = input.nextInt();
			System.out.print("请输入用户年龄:");
			age = input.nextInt();
			if (age < 10) {
				System.out.println("很抱歉,您的年龄不适宜玩游戏");
				System.out.println("录入信息失败!\n");
				continue;
			}
			System.out.print("请输入会员积分:");
			score = input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println("用户编号:" + no + "\t年龄:" + age + "\t积分:" + score + "\n");
		}
		
	}
}
