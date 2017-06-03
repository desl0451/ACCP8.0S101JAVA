package org.aptech.chapter08.Unit1;

import java.util.Scanner;

public class Example1 {

	public static void main(String args[]) {
		String[] goods = new String[] { "Nick背包", "Adidas运动衫", "李宁运动鞋", "Kappa外套", "361°腰包" };
		System.out.println("本次活动特价商品有:");
		// 使用for循环遍历数组
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
	}
}
