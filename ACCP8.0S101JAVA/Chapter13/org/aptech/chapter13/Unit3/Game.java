package org.aptech.chapter13.Unit3;

import java.util.Scanner;

public class Game {
	Person person;// �׷����
	Computer computer;// �ҷ����
	int count;// ��ս��

	/**
	 * ��ʼ������
	 */
	public void initial() {
		person = new Person();
		computer = new Computer();
		count = 0;
	}

	/**
	 * ��ʼ��Ϸ����
	 */
	public void startGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------��ӭ������Ϸ����--------------------");
		System.out.println("\n\n\n\t\t*******************");
		System.out.println("\t\t**   ��ȭ,��ʼ       **");
		System.out.println("\t\t*******************\n\n\n");
		System.out.println("��ȭ����:1.����  2.ʯͷ 3.��");
		System.out.print("����������ҽ�ɫ��:");
		person.name = input.next();

		System.out.print("��ѡ��Է���ɫ(1.���� 2.��Ȩ 3.�ܲ� 4.����ʦ 5.����ʦ)");

		int i = input.nextInt();
		switch (i) {
		case 1:
			computer.name = "����";
			break;
		case 2:
			computer.name = "��Ȩ";
			break;
		case 3:
			computer.name = "�ܲ�";
			break;
		case 4:
			computer.name = "����ʦ";
			break;
		case 5:
			computer.name = "����ʦ";
			break;
		default:
			break;
		}
		System.out.print("��ҽ�ɫ������:");
		System.out.println(person.name);
		System.out.print("���Խ�ɫ������:");
		System.out.println(computer.name);
	}
}
