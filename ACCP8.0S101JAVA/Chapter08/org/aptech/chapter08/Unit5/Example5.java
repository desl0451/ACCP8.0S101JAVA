package org.aptech.chapter08.Unit5;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������4�ҵ�ļ۸�");
		int[] store = new int[4];
		for (int i = 0; i < store.length; i++) {
			System.out.print("��" + (i + 1) + "�ҵ�ļ۸�:");
			store[i] = input.nextInt();
		}
		int min = store[0];
		for (int i = 1; i < store.length; i++) {
			if (min > store[i]) {
				min = store[i];
			}
		}
		System.out.println("��ͼ۸���:" + min);
	}
}
