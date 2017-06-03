package org.aptech.chapter07.Unit3;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money = 0;
		int discount;//折扣
		System.out.println("青鸟迷你游戏平台 > 游戏币支付\n");
		System.out.println("请选择无情无的游戏类型:\n");
		System.out.println("\t\t1.牌类");
		System.out.println("\t\t2.休闲竞技类\n");
		System.out.print("请选择:");
		int choice = input.nextInt();
		System.out.println("请您输入游戏时长:");
		int hour = input.nextInt();
		switch (choice) {
		case 1:
			if (hour > 10) {
				discount = 5;
			} else {
				discount = 8;
			}
			money = hour * discount;
			System.out.println("您玩的是牌类游戏，时长是:" + hour + "小时,可以享受" + discount + "折优惠");
			break;
		case 2:
			if (hour > 10) {
				discount = 5;
			} else {
				discount = 8;
			}
			money = hour * discount * 2;
			System.out.println("您玩的是牌类游戏，时长是:" + hour + "小时,可以享受" + discount + "折优惠");
			break;
		}
		System.out.println("您需要支付" + money + "个游戏币");
	}
}
