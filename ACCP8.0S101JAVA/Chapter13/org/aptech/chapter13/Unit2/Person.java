package org.aptech.chapter13.Unit2;

import java.util.Scanner;

/**
 * 用户类
 */
public class Person {
	// 属性
	String name;
	int score;

	// 方法 (出拳)
	public int showFist() {
		// 提示用户出拳
		System.out.print("出拳规则:1.剪刀 2.石头 3.布(输入相应数字):");
		// 从键盘接收一个数字1~3
		Scanner input = new Scanner(System.in);
		// 1-显示"你出拳:剪刀";2-显示"你出拳:石头";3-显示"你出拳:布"
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("你出拳:剪刀");
			break;
		case 2:
			System.out.println("你出拳:石头");
			break;
		case 3:
			System.out.println("你出拳:布");
			break;
		default:
			break;
		}
		// 返回出拳结果(1~3)
		return i;
	}
}
