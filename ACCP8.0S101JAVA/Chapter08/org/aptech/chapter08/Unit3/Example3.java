package org.aptech.chapter08.Unit3;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		String[] arrays = { "a", "c", "u", "b", "e", "p", "f", "z" };
		System.out.print("Ô­×Ö·ûÐòÁÐ:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		Arrays.sort(arrays);
		System.out.print("\nÉýÐòÅÅÐòºó:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.print("\nÄæÐòÊä³öºó:");
		for (int i = arrays.length - 1; i >= 0; i--) {
			System.out.print(arrays[i] + " ");
		}
	}

}
