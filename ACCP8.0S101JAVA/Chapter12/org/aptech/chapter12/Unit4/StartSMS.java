package org.aptech.chapter12.Unit4;

import java.util.Scanner;

import org.aptech.chapter12.Unit3.Menu;

public class StartSMS {
	public static void main(String[] args) {
		Manager manager = new Manager();

		boolean con = true;
		/* ��ʾ��¼�˵� */
		Menu menu = new Menu();
		menu.showLoginMenu();
		do {

			/* ʵ�ֲ˵� */
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("�������û���:");
				manager.username = input.next();
				System.out.print("����������:");
				manager.password = input.next();
				if (manager.username.equals("JadeBird") && manager.password.equals("0000")) {
					System.out.println("@@��¼�ɹ�:" + manager.username + "@@");
				} else {
					System.out.println("@@��û��Ȩ�޽���ϵͳ,�����µ�¼.@@");
					menu.showLoginMenu();
					continue;
				}
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("лл����ʹ��");
				con = false;
				break;
			default:
				System.out.println("�������,����������\n");
				menu.showLoginMenu();
				break;
			}
		} while (con);
	}
}
