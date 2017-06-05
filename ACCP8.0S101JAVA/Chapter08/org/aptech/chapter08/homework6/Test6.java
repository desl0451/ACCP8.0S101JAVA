package org.aptech.chapter08.homework6;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("插入前的数组为:");
		String[] strArrays = new String[] { "IsLand", "Ocean", "Pretty", "Sun", "" };
		for (int i = 0; i < strArrays.length; i++) {
			System.out.print(strArrays[i] + " ");
		}
		System.out.print("\n请输入歌曲名称:");
		String music = input.next();
		int index = 0;
		for (int i = 0; i < strArrays.length; i++) {
			if (strArrays[i].compareToIgnoreCase(music) > 0) {
				index = i;
				break;
			} else {
				index = 0;
			}
		}
		for (int j = strArrays.length - 1; j > index; j--) {
			strArrays[j] = strArrays[j - 1];
		}
		strArrays[index] = music;
		System.out.print("插入后的数组为:");
		for (int i = 0; i < strArrays.length; i++) {
			System.out.print(strArrays[i] + " ");
		}
	}
}
