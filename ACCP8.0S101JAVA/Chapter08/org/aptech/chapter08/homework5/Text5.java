package org.aptech.chapter08.homework5;

public class Text5 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, -1, 5, -2 };
		int[] newArray = new int[array.length];
		for (int i = 0; i < newArray.length; i++) {
			if (array[i] < 0) {
				continue;
			}
			newArray[newArray.length - 1 - i] = array[i];
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
