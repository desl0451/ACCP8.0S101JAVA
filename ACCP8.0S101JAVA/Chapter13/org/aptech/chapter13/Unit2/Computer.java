package org.aptech.chapter13.Unit2;

import java.util.Scanner;

/**
 * �������
 */
public class Computer {
	// ����
	String name;
	int score;

	// ���� (��ȭ)
	public int showFist() {
		// ��ʾ�û���ȭ
		System.out.print("��ȭ����:1.���� 2.ʯͷ 3.��:");
		// 1-��ʾ"���ȭ:����";2-��ʾ"���ȭ:ʯͷ";3-��ʾ"���ȭ:��"
		int i = (int) (Math.random() * 3) + 1;
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
