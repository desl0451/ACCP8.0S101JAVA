package org.aptech.chapter15.Unit1;

import java.util.Scanner;

public class TestRegister {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Register r = new Register();
		boolean con = true;
		do {
			System.out.println("***欢迎进入注册系统***");
			System.out.print("请输入用户名:");
			String name = input.next();
			System.out.print("请输入密码:");
			String pwd1 = input.next();
			System.out.print("请再次输入密码:");
			String pwd2 = input.next();
			con = r.verify(name, pwd1, pwd2);
			if (con == false) {
				System.out.println("注册成功!请牢记用户名和密码。");
			}
		} while (con);

		System.out.println("程序结束!");
	}
}
