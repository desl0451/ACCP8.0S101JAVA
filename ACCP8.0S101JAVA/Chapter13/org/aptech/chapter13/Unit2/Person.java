package org.aptech.chapter13.Unit2;

import java.util.Scanner;

/**
 * �û���
 */
public class Person {
	// ����
	String name;
	int score;

	// ���� (��ȭ)
	public int showFist() {
		// ��ʾ�û���ȭ
		System.out.print("��ȭ����:1.���� 2.ʯͷ 3.��(������Ӧ����):");
		// �Ӽ��̽���һ������1~3
		Scanner input = new Scanner(System.in);
		// 1-��ʾ"���ȭ:����";2-��ʾ"���ȭ:ʯͷ";3-��ʾ"���ȭ:��"
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("���ȭ:����");
			break;
		case 2:
			System.out.println("���ȭ:ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ:��");
			break;
		default:
			break;
		}
		// ���س�ȭ���(1~3)
		return i;
	}
}
