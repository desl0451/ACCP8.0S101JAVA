package org.aptech.chapter04.Unit2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner shuru = new Scanner(System.in);
		System.out.println("���������ڼ�:");
		int xingqi = shuru.nextInt();
		switch (xingqi) {
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
