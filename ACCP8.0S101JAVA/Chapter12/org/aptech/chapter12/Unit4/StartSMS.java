package org.aptech.chapter12.Unit4;

import java.util.Scanner;

import org.aptech.chapter12.Unit3.Menu;

public class StartSMS {
	public static void main(String[] args) {
		Manager manager = new Manager();

		boolean con = true;
		/* 显示登录菜单 */
		Menu menu = new Menu();
		menu.showLoginMenu();
		do {

			/* 实现菜单 */
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("请输入用户名:");
				manager.username = input.next();
				System.out.print("请输入密码:");
				manager.password = input.next();
				if (manager.username.equals("JadeBird") && manager.password.equals("0000")) {
					System.out.println("@@登录成功:" + manager.username + "@@");
				} else {
					System.out.println("@@您没有权限进入系统,请重新登录.@@");
					menu.showLoginMenu();
					continue;
				}
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("谢谢您的使用");
				con = false;
				break;
			default:
				System.out.println("输入错误,请重新输入\n");
				menu.showLoginMenu();
				break;
			}
		} while (con);
	}
}
