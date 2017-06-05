package org.aptech.chapter08.homework3;

public class Demo3 {
	public static void main(String[] args) {
		int k = 0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 33; j++) {
				k = 100 - i - j;
				if (k % 3 == 0 && 5 * i + 3 * j + k / 3 == 100) {
					System.out.println("¹«¼¦:" + i + " Ä¸¼¦:" + j + " ³û¼¦:" + k);
				}
			}
		}
	}
}
