package org.aptech.chapter06.simple1;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ѭ��¼��ĳѧ��5�ſεĳɼ�������ƽ���֡�
		// ���ĳ����¼��Ϊ����ֹͣ¼�벢��ʾ¼�����
		//cont in ue 
		
		//t run cat e
		
		
		int fenshu = 0;
		int he = 0;
		boolean bl = false;
		System.out.print("����������:");
		String name = input.next();
		for (int i = 1; i <= 5; i++) {
			System.out.print("�������" + i + "�ſεĳɼ�:");
			fenshu = input.nextInt();
			if (fenshu < 0) {
				System.out.println("��Ǹ������¼���������������!");
				bl=true;
				break;
			}
			he += fenshu;
		}
		if (bl == false) {
			System.out.println("ƽ���ɼ���:" + he / 5.0);
		}
		System.out.println("�������");

	}
}
