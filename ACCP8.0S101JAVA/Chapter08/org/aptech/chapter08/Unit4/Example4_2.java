package org.aptech.chapter08.Unit4;

import java.util.Arrays;
import java.util.Scanner;

public class Example4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �ַ�����
		char[] arrays = new char[9];

		arrays[0] = 'a';
		arrays[1] = 'b';
		arrays[2] = 'c';
		arrays[3] = 'e';
		arrays[4] = 'f';
		arrays[5] = 'p';
		arrays[6] = 'u';
		arrays[7] = 'z';

		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
		int index = arrays.length;
		System.out.println("\n������Ҫ������ַ�");
		char ch = input.next().charAt(0);
		for (int i = 0; i < arrays.length; i++) {
			if (ch < arrays[i]) {
				index = i;
				break;
			}
		}
		for (int i = arrays.length - 1; i >= index; i--) {
			arrays[i] = arrays[i - 1];
		}
		arrays[index] = ch;// ���ַ�װ��
		System.out.println("�����ַ���:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + "\t");
		}
	}
}
