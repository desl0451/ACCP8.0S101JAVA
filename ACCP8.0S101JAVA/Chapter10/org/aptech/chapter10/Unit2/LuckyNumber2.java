package org.aptech.chapter10.Unit2;

import java.util.Scanner;

public class LuckyNumber2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println("************欢迎进入奖客富翁系统**************");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("***************************************");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("[奖客富翁系统 > 注册]");
				break;
			case 2:
				System.out.println("[奖客富翁系统 > 登录]");
				break;
			case 3:
				System.out.println("[奖客富翁系统 > 抽奖]");
				break;
			default:
				break;
			}
			System.out.print("继续吗?(y/n):");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\n系统退出,谢谢使用");
	}
}
