package org.aptech.chapter16.Unit3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������:  ");
		int year = 2017;// input.nextInt();
		System.out.print("��ѡ���Ʒ���ͣ�1. ̨ʽ�� 2. �ʼǱ� 3. ������");
		int type = 1;// input.nextInt();
		int random = (int) (Math.random() * 900) + 100; // ����3λ�����
		String productNo = year + "0" + type + random; // ������Ʒ���
		System.out.println("\n�ù̶��ʲ�����ǣ� " + productNo);
	}

}
