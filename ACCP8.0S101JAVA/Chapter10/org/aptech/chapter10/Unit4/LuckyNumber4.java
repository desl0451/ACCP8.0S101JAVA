package org.aptech.chapter10.Unit4;

import java.util.Scanner;

public class LuckyNumber4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 9999;
		int min = 1000;
		int cardNumber = 0;
		String name = ""; // �û���
		String pass = ""; // ����
		String answer = "";
		int[] cardNum = new int[5];
		boolean bl = false;// ��ʾ״̬���н�
		do {
			System.out.println("************��ӭ���뽱�͸���ϵͳ**************");
			System.out.println("\t1.ע��");
			System.out.println("\t2.��¼");
			System.out.println("\t3.�齱");
			System.out.println("***************************************");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("[���͸���ϵͳ > ע��]");
				System.out.print("�û���:");
				name = input.next();
				System.out.print("����:");
				pass = input.next();
				// ���ɿ���
				cardNumber = (int) (Math.random() * (max - min)) + min;

				System.out.println("ע��ɹ�,��Ǻ����Ļ�Ա����");
				System.out.println("�û���\t����\t��Ա����");
				System.out.println(name + "\t" + pass + "\t" + cardNumber);
				break;
			case 2:
				System.out.println("[���͸���ϵͳ > ��¼]");
				for (int n = 1; n <= 3; n++) {
					System.out.print("�������û���:");
					String newName = input.next();
					System.out.print("����������:");
					String newPass = input.next();
					if (name.equals(newName) && pass.equals(newPass)) {
						System.out.println("��ӭ��:" + newName);
						break;
					} else {
						System.out.println("������" + (3 - n) + "�λ���");
					}
				}
				break;
			case 3:
				System.out.println("[���͸���ϵͳ > �齱]");
			
				break;
			default:
				break;
			}
			System.out.print("������?(y/n):");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\nϵͳ�˳�,ллʹ��");
	}
}
