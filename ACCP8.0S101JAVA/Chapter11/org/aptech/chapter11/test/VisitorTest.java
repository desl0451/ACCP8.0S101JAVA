package org.aptech.chapter11.test;

import java.util.Scanner;

public class VisitorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor visitor = new Visitor();
		System.out.print("����������:");
		visitor.name = input.next();
		System.out.print("����������:");
		visitor.age = input.nextInt();
		
		visitor.show();
	}

}
