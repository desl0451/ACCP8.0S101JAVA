package org.aptech.chapter07.homework3;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;// ��
		int n = 0; // ʲôʱ����
		System.out.println("1-100֮�䲻�ܱ�7����������Ϊ:");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 != 0) {
				n++;
				System.out.print(i + "\t");
				if (n % 4 == 0) {
					System.out.println();
				}
				sum = sum + i;
			}

		}
		System.out.println("\n����֮��Ϊ:" + sum);

	}
}
