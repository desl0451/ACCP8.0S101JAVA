package org.aptech.chapter14.Unit1;

import java.util.*;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz biz = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		boolean con = true;
		while (con) {
			System.out.print("请输入客户的姓名:");
			String newName = input.next();
			// 调用addName方法
			biz.addName(newName);
			System.out.print("继续输入吗?(Y/N):");
			String choice = input.next();
			if (choice.equals("n")) {
				con = false;
			}
		}
		biz.showNames();
		System.out.println("请输入要修改的客户姓名：");
		String oldName = input.next();
		System.out.println("请输入新的客户姓名:");
		String newName = input.next();
		boolean bl = biz.editName(oldName, newName);
		if (bl == true) {
			System.out.println("找到了并修改成功!");
		} else {
			System.out.println("没有找到无法修改!");
		}
		biz.showNames();
	}
}
