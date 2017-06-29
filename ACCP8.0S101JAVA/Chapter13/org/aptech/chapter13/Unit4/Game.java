package org.aptech.chapter13.Unit4;

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

		/* ��ʼ��Ϸ */
		System.out.println("\nҪ��ʼ��?(Y/N) ");
		String con = input.next();
		int perFist; // �û���ȭ
		int compFist; // ���Գ�ȭ
		while (con.equals("y")) {
			/* ��ȭ */
			perFist = person.showFist();// �û���ȭ
			compFist = computer.showFist();// ���Գ�ȭ
			/* �þ� */
			if ((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)) {
				System.out.println("���:�;�,��˥!\n");// ƽ��
			} else if ((perFist == 1 && compFist == 3) || (perFist == 2 && compFist == 1)
					|| (perFist == 3 && compFist == 2)) {
				System.out.println("���:��ϲ,��Ӯ��!");
				person.score++;
			} else {
				System.out.println("���:^_^!!,������!,�汿!");
				computer.score++;
			}
			count++;
			System.out.println("\nҪ��ʼ��?(Y/N) ");
			con = input.next();
		}
	}

	public void showResult() {
		/* ��ʾ����� */
		System.out.println("-----------------------------");
		System.out.println(computer.name + " VS " + person.name);
		System.out.println("��ս����:" + count);
		System.out.println(computer.score + " : " + person.score);
		System.out.println("-----------------------------");
	}
}
