package org.aptech.chapter06.Unit5;

public class Example5 {
	public static void main(String[] args) {
		// int women = 0;
		// int kids = 0;
		// //����������0��
		// //С����Ů���ж�����
		// //С��10�� Ů��20�� 10*1+20*2=50
		// //����������10��
		// //С����Ů���ж�����
		//
		//
		// for (int men = 0; men <= 10; men++) {
		// women = 20 - 2 * men;
		// kids = 30 - men - women;
		// if (3 * men + 2 * women + kids == 50) {
		// System.out.println("����:" + men + "\tŮ��:" + women + "\tС��:" + kids);
		// }
		// }
		int men = 0, women = 0, child = 0;
		// ���ˡ�Ů�˺�С������
		// men + women + child = 30

		// 3*men + 2*women + child = 50
		//3*men+2*women+men+10=50
		//4*men+2*women=40
		//2*men+women=20
		// �ɵó�: child = men + 10
		// 2*men + women = 20
		
		
		for (men = 1; men <= 10; men++) {
			if (20 - 2 * men > 0) {
				women = 20 - 2 * men;
				child = 10 + men;
			}
			System.out.println("men=" + men + "\twomen=" + women + "\tchild=" + child);
		}
	}

}
