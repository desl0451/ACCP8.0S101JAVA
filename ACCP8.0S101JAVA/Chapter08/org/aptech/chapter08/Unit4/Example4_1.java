package org.aptech.chapter08.Unit4;

import java.util.Arrays;
import java.util.Scanner;

public class Example4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arrays = { "a", "c", "u", "b", "e", "p", "f", "z" };

		String[] arr = new String[9];
		System.out.print("ԭ�ַ�����:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
			arr[i] = arrays[i];
		}
		System.out.print("\n��������ַ���:");
		String ch = input.next();
		arr[8] = ch;
		Arrays.sort(arr);
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(ch)) {
				index = i;// �����±�
			}
		}
		System.out.println("�����ַ����±���:" + index);
		System.out.print("���������˷�������:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
