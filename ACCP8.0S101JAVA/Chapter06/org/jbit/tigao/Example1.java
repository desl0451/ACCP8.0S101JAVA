package org.jbit.tigao;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.1-100之间的质数(素数)和
		// boolean bl = true;
		// int he = 0;
		// for (int i = 2; i <= 100; i++) {
		// for (int j = 2; j < i; j++) {
		// if (i % j == 0) {
		// bl = false;
		// }
		// }
		// if (bl == true) {
		// System.out.println(i);
		// he += i;
		// } else {
		// bl = true;
		// }
		// }
		// System.out.println(he);
		// 2.100以内5的倍数+7的倍数+10的倍数之和
		// int sum = 0;
		// for (int i = 1; i <= 100; i++) {
		// if (i % 5 == 0 || i % 7 == 0 || i % 10 == 0) {
		// sum += i;
		// }
		// }
		// System.out.println("总和是:" + sum);
		// 3.水仙花数1000以内的
		// 它的每个位上的数字的 n
		// 次幂之和等于它本身
		// 1^3次方 + 5^3+ 3^3 = 1 5 3

		// int ge = 0;
		// int shi = 0;
		// int bai = 0;
		// for (int i = 100; i < 1000; i++) {
		// ge = i % 10;
		// shi = i / 10 % 10;
		// bai = i / 100;
		// if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
		// System.out.println(i);
		// }
		// }
		// int score = 0; //分数
		// int num = 0; //大于80分的人数
		// Scanner input = new Scanner(System.in);
		// System.out.println("输入班级总人数:");
		// int total = input.nextInt();//总人数
		// for (int i = 0; i < total; i++) {
		// System.out.print("请输入第" + (i + 1) + "位学生的成绩： ");
		// score = input.nextInt();
		// if (score < 80) {
		// continue;
		// }
		// num++;
		// }
		// System.out.println("80分以上的学生人数是： " + num);
		// double rate = num/ total * 100; // 计算比例
		// System.out.println("80分以上的学生所占的比例为：" + rate + "%");

//		int i = 1;
//		while (i <= 5) {
//			System.out.println("我爱你王老师");
//
//			if (i == 3) {
//				// break;
//				i++;
//				continue;
//			}
//
//		}
		//
		// int i = 1;
		// do {
		// System.out.println("我爱你王老师");
		// i++;
		// } while (i <= 5);

		// for (int i = 1; i <= 5; i++) {
		// System.out.println("我爱你王老师");
		// }
		double firstAvg = 80;
		double secondAvg;
		int rise = 4;
		secondAvg = firstAvg + rise;
		System.out.println(secondAvg);

	}

}
