package org.aptech.chapter11.test;

import java.util.Scanner;

public class Visitor {
	String name;// ����
	int age;// ����

	public void show() {
		Scanner input = new Scanner(System.in);
		while (!"n".equals(name)) {
			if (age >= 18 && age <= 60) {
				System.out.println(name + "������Ϊ:" + age + "��Ʊ�ļ۸�Ϊ:20Ԫ\n");
			} else {
				System.out.println(name + "������Ϊ:" + age + ",��Ʊ���\n");
			}
			System.out.print("����������:");
			name = input.next();
			if (!"n".equals(name)) {
				System.out.print("����������:");
				age = input.nextInt();
			}
		}
		System.out.println("�˳�����!");
	}
}
