package org.aptech.chapter12.Unit4;

import java.util.Scanner;

public class Menu {
	/**
	 * ʵ����ʾ��¼�˵�
	 */
	public void showLoginMenu() {
		System.out.println("\n*************************************************");
		System.out.println("\n\t     ��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��¼ϵͳ\n");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ��,��������:");
	}

	/**
	 * ʵ����ʾ���˵�
	 */
	public void showMainMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     �������ع������ϵͳ���˵�\n");
			System.out.println("\t\t1.�ͻ���Ϣ����\n");
			System.out.println("\t\t2.�������\n");
			System.out.println("************************************************");
			System.out.print("��ѡ��,�������ֻ�0������һ���˵�:");
			/* ��������,ѡ��˵� */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				showCustMenu();
			} else if (no == 2) {
				showSendGMenu();
			} else if (no == 0) {
				showLoginMenu();
			} else {
				System.out.println("�������,��������������:");
				con = true;
			}

		} while (con);
	}

	/**
	 * ʵ����ʾ�ͻ���Ϣ����˵�
	 */
	public void showCustMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     �������ع������ϵͳ ��>���ͻ���Ϣ���� \n");
			System.out.println("\t\t1.��ѯ�ͻ���Ϣ\n");
			System.out.println("\t\t2.�޸Ŀͻ���Ϣ\n");
			System.out.println("\t\t3.��ӿͻ���Ϣ\n");
			System.out.println("\t\t4.��ʾ���пͻ���Ϣ\n");
			System.out.println("************************************************");
			System.out.print("��ѡ��,�������ֻ�0������һ���˵�:");

			/* ��������,ѡ��˵� */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				System.out.println("��ѯ�ͻ���Ϣ");
			} else if (no == 2) {
				System.out.println("�޸Ŀͻ���Ϣ");
			} else if (no == 3) {
				System.out.println("��ӿͻ���Ϣ");
			} else if (no == 4) {
				System.out.println("��ʾ���пͻ���Ϣ");
			} else if (no == 0) {
				showMainMenu();// �������˵�
			} else {
				System.out.println("�������,��������������:");
				con = true;
			}
		} while (con);

	}

	/**
	 * ʵ����ʾ��������˵�
	 */
	public void showSendGMenu() {
		boolean con;
		do {
			con = false;
			System.out.println("\n*************************************************");
			System.out.println("\t     �������ع������ϵͳ ��>��������� \n");
			System.out.println("\t\t1.���˴����\n");
			System.out.println("\t\t2.���˳齱\n");
			System.out.println("\t\t3.�����ʺ�\n");
			System.out.println("************************************************");
			System.out.print("��ѡ��,�������ֻ�0������һ���˵�:");

			/* ��������,ѡ��˵� */
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			if (no == 1) {
				System.out.println("ִ�����˴����");
			} else if (no == 2) {
				System.out.println("ִ�����˳齱");
			} else if (no == 3) {
				System.out.println("ִ�������ʺ�");
			} else if (no == 0) {
				showMainMenu();// �������˵�
			} else {
				System.out.println("�������,��������������:");
				con = true;
			}
		} while (con);
	}
}
