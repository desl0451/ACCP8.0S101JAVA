package org.aptech.chapter08.homework5;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pass = "";
		int money = 0;
		int i = 1;
		int showMoney = 0;
		boolean bl = true;
		for (i = 1; i <= 3; i++) {
			System.out.print("����������:");
			pass = input.next();
			if (pass.equals("1")) {
				for (int j = 1; j <= 3; j++) {
					System.out.print("��������:");
					money = input.nextInt();
					if (money >= 0 && money <= 1000) {
						if (money % 100 != 0) {
							System.out.print("������Ľ��Ľ��Ϸ�,");
							continue;
						}
						showMoney += money;
					} else {
						System.out.print("������Ľ��Ľ��Ϸ�,");
					}
				}
			}
			if (pass.equals("1")) {
				break;
			}
			if (i == 3) {
				System.out.println("�������,��ȡ��");
				bl = false;
				break;
			}
		}
		if (bl == true) {
			System.out.println("��ȡ��" + showMoney + "Ԫ��");
			System.out.println("Ч�����,��ȡ��!");
		}
	}
}
