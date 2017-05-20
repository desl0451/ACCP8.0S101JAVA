package org.aptech.chapter03.Unit3;

import java.util.Scanner;
/**
 * 课后第3题　实现三个数从小到大排列
 * @author Administrator
 *
 */
public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int temp;
		if (a > b) {
			temp = a;
			a = c;
			c = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
