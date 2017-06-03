package org.aptech.chapter07.Unit4;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int click = 0; //单击
		int num = 0; //数量
		System.out.println("青鸟迷你游戏平台 > 游戏点击率\n");
		for (int i = 1; i <= 4; i++) {
			System.out.print("请输入第" + i + "个游戏的点击率:");
			click = input.nextInt();
			if (click <= 100) {
				continue;
			}
			num++;
		}
		System.out.println("点击率大于100的游戏数是:" + num);
		System.out.println("点击率大于100的游戏所占的比例为:" + (num / 4.0 * 100) + "%");
	}
}
