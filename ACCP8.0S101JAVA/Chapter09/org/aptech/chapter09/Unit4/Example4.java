package org.aptech.chapter09.Unit4;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		int row =  input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row + 1 - i; j++) {
				System.out.print("#");
			}
			//�������������
			//1 3 5 7 9 ������
			System.out.println();
		}
		
		
		
	}
}
