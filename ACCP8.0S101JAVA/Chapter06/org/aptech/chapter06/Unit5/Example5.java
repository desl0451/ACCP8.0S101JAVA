package org.aptech.chapter06.Unit5;

public class Example5 {
	public static void main(String[] args) {
		int women = 0;
		int kids = 0;
		//假设男人有0人
		//小孩和女人有多少人 
		//小孩10人  女人20人  10*1+20*2+0=50
		//假设男人有10人
		//小孩和女人有多少人

		
		for (int men = 0; men <= 10; men++) {
			women = 20 - 2 * men;
			kids = 30 - men - women;
			if (3 * men + 2 * women + kids == 50) {
				System.out.println("男人:" + men + "\t女人:" + women + "\t小孩:" + kids);
			}
		}

	}
}
