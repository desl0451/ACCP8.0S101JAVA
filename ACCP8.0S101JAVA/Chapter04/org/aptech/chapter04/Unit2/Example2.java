package org.aptech.chapter04.Unit2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// ʹ��switch�ṹʵ��:
		//ΪС���ƶ�ѧϰ�ƻ�,
		// ����һ,������,������ѧϰ���,
		// ���ڶ�,������,������ѧϰӢ��,
		// ������ ��Ϣ.
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ�:");
		int day = input.nextInt();
		switch (day) {
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;
		case 7:
			System.out.println("��Ϣ");
			break;
		default:
			break;
		}
	}

}
