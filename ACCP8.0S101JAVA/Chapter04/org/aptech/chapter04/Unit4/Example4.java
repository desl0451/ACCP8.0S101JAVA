package org.aptech.chapter04.Unit4;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		int price = 4000; // ��Ʊ��ԭ��
		int month; // ���е��·�
		int type; // ͷ�Ȳ�Ϊ1,���ò�Ϊ2
		Scanner input = new Scanner(System.in);
		System.out.println("�����������е��·ݣ�1��12");
		month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		type = input.nextInt();

		switch (month % 10) {
		case 1:
		case 2:
		case 3:
			if (type == 1) { // ͷ�Ȳ�
				System.out.println("���Ļ�Ʊ�۸�Ϊ��" + price * 0.6);
			} else if (type == 2) { // ���ò�
				System.out.println("���Ļ�Ʊ�۸�Ϊ��" + price * 0.3);
			}
			break;
		case 0:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			if (type == 1) // ͷ�Ȳ�
			{
				System.out.println("���Ļ�Ʊ�۸�Ϊ��" + price * 0.9);
			} else if (type == 2) // ���ò�
			{
				System.out.println("���Ļ�Ʊ�۸�Ϊ��" + price * 0.75);
			}
			break;
		default:
			System.out.println("����ȷ����ɼ���");
			break;
		}
	}
}
