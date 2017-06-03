package org.aptech.chapter08.homework4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] count = new int[4];
		System.out.println("请输入10个数:");

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
			if (nums[i] == 1) {
				count[1]++;
			} else if (nums[i] == 2) {
				count[2]++;
			} else if (nums[i] == 3) {
				count[3]++;
			} else {
				count[0]++;
			}
		}
		System.out.println("数字1的个数:" + count[1]);
		System.out.println("数字2的个数:" + count[2]);
		System.out.println("数字3的个数:" + count[3]);
		System.out.println("非法数字的个数:" + count[0]);
	}
}
