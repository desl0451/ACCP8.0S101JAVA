package org.aptech.chapter07.Unit1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎进入青鸟游戏迷你平台\n");
		System.out.println("请选择您喜爱的游戏:\n");
		System.out.println("******************************************");
		System.out.println("\t\t1.斗地主");
		System.out.println("\t\t2.斗牛");
		System.out.println("\t\t3.泡泡龙");
		System.out.println("\t\t4.连连看");
		System.out.println("******************************************\n");
		System.out.print("请选择,输入数字:");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("您已进入斗地主房间");
			break;
		case 2:
			System.out.println("您已进入斗牛房间");
			break;
		case 3:
			System.out.println("您已进入泡泡龙房间");
			break;
		case 4:
			System.out.println("您已进入连连看房间");
			break;
		}
	}
}
