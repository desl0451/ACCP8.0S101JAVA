package org.aptech.chapter08.homework3;

public class Test3 {

	public static void main(String[] args) {
		int[] points = { 18, 25, 7, 36, 13, 2, 89, 63 };
		int min = points[0];
		for (int i = 1; i < points.length; i++) {
			if (min > points[i]) {
				min = points[i];
			}
		}
		System.out.println("最小值是:" + min);
	}

}
