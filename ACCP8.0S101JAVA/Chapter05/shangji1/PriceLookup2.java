package shangji1;

import java.util.Scanner;

public class PriceLookup2 {

	public static void main(String[] args) {
		String name = "";// ��Ʒ����
		double price = 0.0;// ��Ʒ�۸�
		int goodsNo = 0;// ��Ʒ���
		int amount = 0;// ��������
		double discount = 0.8;// �ۿ۱���
		double total = 0.0;// ��Ʒ�ܼ�
		double payment = 0.0;// ʵ�����

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
			System.out.print("�����빺������:");
			amount = input.nextInt();
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
			total = total + price * amount;
			System.out.println(name + "\t" + "��" + price + "\t����" + amount + "\t�ϼƣ�" + (price * amount));
			System.out.print("�Ƿ����(y/n):");
			answer = input.next();
		}
		System.out.println("\n�ۿ�:" + discount);
		total = total * 0.8;
		System.out.println("Ӧ�����:" + total);
		System.out.print("ʵ�����:");
		payment = input.nextDouble();
		System.out.println("��Ǯ:" + (payment - total));
		System.out.println("�������!");

	}

}
