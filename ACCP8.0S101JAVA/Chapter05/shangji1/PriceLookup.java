package shangji1;

import java.util.Scanner;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

public class PriceLookup {
	public static void main(String[] args) {
		String name = "";// ��Ʒ����
		double price = 0.0;// ��Ʒ�۸�
		int goodsNo = 0;// ��Ʒ���
		System.out.println("MyShopping����ϵͳ->�������\n");
		System.out.println("**************************************");
		System.out.println("��ѡ�������Ʒ���:");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("**************************************");
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while ("y".equals(answer)) {
			System.out.print("��������Ʒ���:");
			goodsNo = input.nextInt();
			switch (goodsNo) {
			case 1:
				name = "T��";
				price = 245.0;
				break;
			case 2:
				name = "����Ь";
				price = 570.0;
				break;
			case 3:
				name = "������";
				price = 320.0;
				break;
			}
			System.out.println(name + "\t" + "��" + price + "\n");
			System.out.print("�Ƿ����(y/n)");
			answer = input.next();
		}
		System.out.println("�������!");
	}
}
