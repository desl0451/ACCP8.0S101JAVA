package org.aptech.chapter13.Unit2;

import java.util.Scanner;

/**
 * 计算机类
 */
public class Computer {
	// 属性
	String name;
	int score;

	// 方法 (出拳)
	public int showFist() {
		// 提示用户出拳
		System.out.print("出拳规则:1.剪刀 2.石头 3.布:");
		// 1-显示"你出拳:剪刀";2-显示"你出拳:石头";3-显示"你出拳:布"
		int i = (int) (Math.random() * 3) + 1;
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
