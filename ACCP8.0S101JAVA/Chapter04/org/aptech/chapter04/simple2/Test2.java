package org.aptech.chapter04.simple2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.print("���������ѽ��:");
		boolean bl = false;
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		String wupin = "";
		if (money >= 50) {
			System.out.println("1.��50Ԫ,��2Ԫ�������¿�������1ƿ");
			System.out.println("2.��100Ԫ,��3Ԫ����500ml����һƿ");
			System.out.println("3.��100Ԫ,��10Ԫ�������������");
			System.out.println("4.��200Ԫ,��10Ԫ�ɻ���1���ղ������˹�");
			System.out.println("5.��200Ԫ,��20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
			System.out.println("0.������");
			System.out.print("��ѡ��:");
			int c = input.nextInt();
			switch (c) {
			case 1:
				money += 2;
				wupin = "���¿�������1ƿ";
				bl = true;
				break;
			case 2:
				if (money >= 100) {
					money += 3;
					wupin = "500ml����һƿ";
					bl = true;
				} else {
					System.out.println("��������ڻ������");
				}
				break;
			case 3:
				if (money >= 100) {
					money += 10;
					wupin = "��10Ԫ����5�������";
					bl = true;
				} else {
					System.out.println("��������ڻ������");
				}
				break;
			case 4:
				if (money >= 200) {
					money += 10;
					wupin = "�ɻ���1���ղ������˹�";
					bl = true;
				} else {
					System.out.println("��������ڻ������");
				}
				break;
			case 5:
				if (money >= 200) {
					money += 20;
					wupin = "�ɻ���ŷ����ˬ��ˮһƿ";
					bl = true;
				} else {
					System.out.println("��������ڻ������");
				}
				break;
			default:
				System.out.println("������");
				break;
			}
			if (bl == true) {
				System.out.println("���������ܽ��:" + money);
				System.out.println("�ɹ�����:" + wupin);
			}
		} else {
			System.out.println("�޷�����");
		}
	}

}
