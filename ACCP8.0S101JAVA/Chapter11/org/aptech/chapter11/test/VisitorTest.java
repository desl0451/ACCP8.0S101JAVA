package org.aptech.chapter11.test;

import java.util.Scanner;

public class VisitorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor visitor = new Visitor();
		System.out.print("请输入姓名:");
		visitor.name = input.next();
		System.out.print("请输入年龄:");
		visitor.age = input.nextInt();
		
		visitor.show();
	}

}
