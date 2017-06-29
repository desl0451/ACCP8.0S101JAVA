package org.aptech.chapter12.Unit3;

import java.util.Scanner;

public class TestMenu {
	public static void main(String[] args) {
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
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("谢谢您的使用");
				con = false;
				break;
			case 0:
				System.out.println("程序退出");
				con=false;
				break;
			}
		} while (con);
	}
}
