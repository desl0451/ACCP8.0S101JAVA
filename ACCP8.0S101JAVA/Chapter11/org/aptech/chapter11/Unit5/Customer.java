package org.aptech.chapter11.Unit5;

public class Customer {
	int score;
	String type;

	public void show() {
		System.out.print("积分:" + score);
		System.out.println(",卡类型:" + type);
		if (type.equals("金卡") && score > 1000) {
			System.out.println("回馈积分500分!");
		} else if (type.equals("普卡") && score > 5000) {
			System.out.println("回馈积分500分!");
		}
	}
}
