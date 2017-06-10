package org.aptech.chapter11.Unit4;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin1";
		admin.password = "111111";
		// 输入旧的用户名和密码
		System.out.print("请输入用户名:");
		String name = input.next();
		System.out.print("请输入密码:");
		String pwd = input.next();
		// 判断用户输入的用户名和密码是否正确
		if (admin.name.equals(name) && admin.password.equals(pwd)) {
			System.out.print("\n请输入新密码:");
			admin.password = input.next();
			System.out.println("修改密码成功,您的新密码为:" + admin.password);
		} else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息");
		}
	}
}
