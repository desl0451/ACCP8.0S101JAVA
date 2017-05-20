package org.aptech.chapter04.simple2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.print("请输入消费金额:");
		boolean bl = false;
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		String wupin = "";
		if (money >= 50) {
			System.out.println("1.满50元,加2元换购百事可乐饮料1瓶");
			System.out.println("2.满100元,加3元换购500ml可乐一瓶");
			System.out.println("3.满100元,加10元换购５公斤面粉");
			System.out.println("4.满200元,加10元可换购1个苏泊尔炒菜锅");
			System.out.println("5.满200元,加20元可换购欧莱雅爽肤水一瓶");
			System.out.println("0.不换购");
			System.out.print("请选择:");
			int c = input.nextInt();
			switch (c) {
			case 1:
				money += 2;
				wupin = "百事可乐饮料1瓶";
				bl = true;
				break;
			case 2:
				if (money >= 100) {
					money += 3;
					wupin = "500ml可乐一瓶";
					bl = true;
				} else {
					System.out.println("购买金额低于换购金额");
				}
				break;
			case 3:
				if (money >= 100) {
					money += 10;
					wupin = "加10元换购5公斤面粉";
					bl = true;
				} else {
					System.out.println("购买金额低于换购金额");
				}
				break;
			case 4:
				if (money >= 200) {
					money += 10;
					wupin = "可换购1个苏泊尔炒菜锅";
					bl = true;
				} else {
					System.out.println("购买金额低于换购金额");
				}
				break;
			case 5:
				if (money >= 200) {
					money += 20;
					wupin = "可换购欧莱雅爽肤水一瓶";
					bl = true;
				} else {
					System.out.println("购买金额低于换购金额");
				}
				break;
			default:
				System.out.println("不换购");
				break;
			}
			if (bl == true) {
				System.out.println("本次消费总金额:" + money);
				System.out.println("成功换购:" + wupin);
			}
		} else {
			System.out.println("无法换购");
		}
	}

}
