package org.aptech.chapter11.Unit5;

public class Customer {
	int score;
	String type;

	public void show() {
		System.out.print("����:" + score);
		System.out.println(",������:" + type);
		if (type.equals("��") && score > 1000) {
			System.out.println("��������500��!");
		} else if (type.equals("�տ�") && score > 5000) {
			System.out.println("��������500��!");
		}
	}
}
