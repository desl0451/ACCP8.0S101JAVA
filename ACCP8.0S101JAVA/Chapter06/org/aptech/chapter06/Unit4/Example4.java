package org.aptech.chapter06.Unit4;

public class Example4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+"FlipFlop");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println(i+"Flip");
				continue;
			}
			if (i % 5 == 0) {
				System.out.println(i+"Flop");
				continue;
			}
		}
	}
}
