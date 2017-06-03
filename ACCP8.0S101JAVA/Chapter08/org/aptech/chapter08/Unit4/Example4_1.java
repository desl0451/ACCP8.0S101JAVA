package org.aptech.chapter08.Unit4;

import java.util.Arrays;
import java.util.Scanner;

public class Example4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arrays = { "a", "c", "u", "b", "e", "p", "f", "z" };

		String[] arr = new String[9];
		System.out.print("原字符序列:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
			arr[i] = arrays[i];
		}
		System.out.print("\n待插入的字符是:");
		String ch = input.next();
		arr[8] = ch;
		Arrays.sort(arr);
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(ch)) {
				index = i;// 保存下标
			}
		}
		System.out.println("插入字符的下标是:" + index);
		System.out.print("插入后的这了符序列是:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
