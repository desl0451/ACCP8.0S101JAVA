package org.aptech.chapter12.Unit4;

import java.util.Scanner;

public class Menu {
	/**
	 * 实现显示登录菜单
	 */
	public void showLoginMenu() {
		System.out.println("\n*************************************************");
		System.out.println("\n\t     欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登录系统\n");
		System.out.println("\t\t2.退出\n");
		System.out.println("*************************************************");
		System.out.print("请选择,输入数字:");
	}

	/**
	 * 实现显示主菜单
	 */
	public void showMainMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     我行我素购物管理系统主菜单\n");
			System.out.println("\t\t1.客户信息管理\n");
			System.out.println("\t\t2.真情回馈\n");
			System.out.println("************************************************");
			System.out.print("请选择,输入数字或按0返回上一级菜单:");
			/* 输入数字,选择菜单 */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				showCustMenu();
			} else if (no == 2) {
				showSendGMenu();
			} else if (no == 0) {
				showLoginMenu();
			} else {
				System.out.println("输入错误,请重新输入数字:");
				con = true;
			}

		} while (con);
	}

	/**
	 * 实现显示客户信息管理菜单
	 */
	public void showCustMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     我行我素购物管理系统 　>　客户信息管理 \n");
			System.out.println("\t\t1.查询客户信息\n");
			System.out.println("\t\t2.修改客户信息\n");
			System.out.println("\t\t3.添加客户信息\n");
			System.out.println("\t\t4.显示所有客户信息\n");
			System.out.println("************************************************");
			System.out.print("请选择,输入数字或按0返回上一级菜单:");

			/* 输入数字,选择菜单 */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				System.out.println("查询客户信息");
			} else if (no == 2) {
				System.out.println("修改客户信息");
			} else if (no == 3) {
				System.out.println("添加客户信息");
			} else if (no == 4) {
				System.out.println("显示所有客户信息");
			} else if (no == 0) {
				showMainMenu();// 返回主菜单
			} else {
				System.out.println("输入错误,请重新输入数字:");
				con = true;
			}
		} while (con);

	}

	/**
	 * 实现显示真情回馈菜单
	 */
	public void showSendGMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     我行我素购物管理系统 　>　真情回馈 \n");
			System.out.println("\t\t1.幸运大放送\n");
			System.out.println("\t\t2.幸运抽奖\n");
			System.out.println("\t\t3.生日问候\n");
			System.out.println("************************************************");
			System.out.print("请选择,输入数字或按0返回上一级菜单:");

			/* 输入数字,选择菜单 */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				System.out.println("执行幸运大放送");
			} else if (no == 2) {
				System.out.println("执行幸运抽奖");
			} else if (no == 3) {
				System.out.println("执行生日问候");
			} else if (no == 0) {
				showMainMenu();// 返回主菜单
			} else {
				System.out.println("输入错误,请重新输入数字:");
				con = true;
			}
		} while (con);
	}
}
