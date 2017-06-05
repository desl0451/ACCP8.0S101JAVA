package org.aptech.chapter08.homework4;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("请输入第" + i + "个班级,第" + j + "名学员的成绩:");
				score = input.nextInt();
				if (score > 85) {
					sum += score;
					count++;
				}
			}
		}
		System.out.println("有" + count + "名学员大于85分");
		System.out.println("平均分是:" + sum / count);
	}
}
