package org.aptech.chapter06.Unit5;

public class Example5 {
	public static void main(String[] args) {
		int women = 0;
		int kids = 0;
		//����������0��
		//С����Ů���ж����� 
		//С��10��  Ů��20��  10*1+20*2+0=50
		//����������10��
		//С����Ů���ж�����

		
		for (int men = 0; men <= 10; men++) {
			women = 20 - 2 * men;
			kids = 30 - men - women;
			if (3 * men + 2 * women + kids == 50) {
				System.out.println("����:" + men + "\tŮ��:" + women + "\tС��:" + kids);
			}
		}

	}
}
