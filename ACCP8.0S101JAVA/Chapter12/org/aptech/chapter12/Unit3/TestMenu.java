package org.aptech.chapter12.Unit3;

import java.util.Scanner;

public class TestMenu {
	public static void main(String[] args) {
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
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("лл����ʹ��");
				con = false;
				break;
			case 0:
				System.out.println("�����˳�");
				con=false;
				break;
			}
		} while (con);
	}
}
