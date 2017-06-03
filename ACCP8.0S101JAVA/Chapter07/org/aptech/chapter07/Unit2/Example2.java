package org.aptech.chapter07.Unit2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("青鸟迷你游戏平台 > 游戏晋级\n");
		int count = 0; //数量   统计大于80分的个数
		String answer = "";//继续玩吗?
		int score = 0; //游戏得分
		int n = 1;
		do {
			System.out.print("您正在玩第" + n + "局,成绩为:");
			score = input.nextInt();
			if (score > 80) {
				count++;
			}
			n++;
			if (n > 5) {
				System.out.println("游戏结束");
			} else {
				System.out.print("继续玩下一局吗?(yes/no)");
				answer = input.next();
				if (answer.equals("no")) {
					System.out.println("您已经中途退出游戏。");
					break;
				} else {
					System.out.println("进入下一局");
				}
			}
		} while (n <= 5);

		double rate = count / 5.0;// 计算达到80以上的比率
		if (n > 5) {
			if (rate > 0.8) {
				System.out.println("\n恭喜!通过一级");
			} else if (rate > 0.6) {
				System.out.println("\n通过二级,继续努力!");
			} else {
				System.out.println("\n对不起,您未能晋级,继结加油啊!");
			}
		} else {
			System.out.println("\n对不起,您未能晋级,继续加油啊!");
		}
	}
}
