package org.aptech.chapter08.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 有一个数列：8，4，2，1，23，344，12
		// 循环输出数列的值
		// 求数列中所有数值的和
		// 猜数游戏：从键盘中任意输入一个数据，
		// 判断数列中是否包含此数
		Scanner input = new Scanner(System.in);
		boolean bl = false;// 假表示没找到 真 找到了
		System.out.print("请输入一个数:");
		int shu = input.nextInt();
		int[] nums = { 8, 4, 2, 1, 23, 344, 12 };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == shu) {
				bl = true;
			}
			sum += nums[i];
			System.out.println(nums[i]);
		}

		System.out.println("总和是:" + sum);
		if (bl) {
			System.out.println("找到了.哇哈哈哈");
		} else {
			System.out.println("没找到..嘿嘿");
		}
	}

}
