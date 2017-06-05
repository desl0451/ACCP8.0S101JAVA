package org.aptech.chapter09.tigao;

public class TuTu {

	public static void main(String[] args) {
		// 555555555
		// 544444445
		// 543333345
		// 543222345
		// 543212345
		// 543222345
		// 543333345
		// 544444445
		// 555555555
		int shu = 5;
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				for (int n = 1; n <= i; n++) {
					System.out.print(6 - n);
				}
				for (int j = 1; j <= 9 - i * 2; j++) {
					System.out.print(shu);
				}
				if (i == 5) {
					for (int j = 1; j < i; j++) {
						System.out.print(6 - i + j);
					}
				} else {
					for (int j = 1; j <= i; j++) {
						System.out.print(5 - i + j);
					}
				}
				shu--;
			} else {
				//6 7 8 9
				//4 3 2 1
				for (int n = 1; n <=i-2*(6-i); n++) {
					System.out.print(6 - n);
				}
//				for (int j = 1; j <= (i - 5) * 2 - 1; j++) {
//					System.out.print(shu + 1);
//				}
				shu++;
			}
			System.out.println();
		}

	}

}
