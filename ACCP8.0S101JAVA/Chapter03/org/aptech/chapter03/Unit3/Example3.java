package org.aptech.chapter03.Unit3;

import java.util.Scanner;
/**
 * �κ��3�⡡ʵ����������С��������
 * @author Administrator
 *
 */
public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������������");
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
