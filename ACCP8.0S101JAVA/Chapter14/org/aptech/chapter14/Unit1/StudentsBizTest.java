package org.aptech.chapter14.Unit1;

import java.util.Scanner;

public class StudentsBizTest {

	public static void main(String[] args) {
		StudentsBiz biz = new StudentsBiz();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.print("请输入学生姓名：");
			String newName = input.next();
			biz.addName(newName);
		}
		biz.showNames();
	}

}
