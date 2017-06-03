package org.aptech.chapter06.simple1;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 循环录入某学生5门课的成绩并计算平均分。
		// 如果某分数录入为负，停止录入并提示录入错误
		//cont in ue 
		
		//t run cat e
		
		
		int fenshu = 0;
		int he = 0;
		boolean bl = false;
		System.out.print("请输入姓名:");
		String name = input.next();
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入第" + i + "门课的成绩:");
			fenshu = input.nextInt();
			if (fenshu < 0) {
				System.out.println("抱歉，分数录入错误，请重新输入!");
				bl=true;
				break;
			}
			he += fenshu;
		}
		if (bl == false) {
			System.out.println("平均成绩是:" + he / 5.0);
		}
		System.out.println("程序结束");

	}
}
