package org.aptech.chapter09.Unit4;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入行数:");
		int row =  input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row + 1 - i; j++) {
				System.out.print("#");
			}
			//输出等腰三角形
			//1 3 5 7 9 三角形
			System.out.println();
		}
		
		
		
	}
}
