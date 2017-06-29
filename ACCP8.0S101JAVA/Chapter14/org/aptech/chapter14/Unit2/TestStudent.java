package org.aptech.chapter14.Unit2;

import cn.jbit.entity.Student;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// 1.忽略大小写
		// 2.转换成小写
		// 3.转换成大写
		String a = input.next();
		String b = "aBcdE";
		// if (a.equalsIgnoreCase(b)) {
		// System.out.println("相等");
		// } else {
		// System.out.println("不相等");
		// }
		// System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());

		// if (a.equalsIgnoreCase(b)) {
		// System.out.println("相等");
		// } else {
		// System.out.println("不相等");
		// }

	}

}
