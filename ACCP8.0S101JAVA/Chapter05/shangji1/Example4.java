package shangji1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		boolean isRight = true;
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MySchopping����ϵͳ\n");
		System.out.println("***************************************");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("\t\t3.�������");
		System.out.println("\t\t4.ע��");
		System.out.println("***************************************");
		do {
			System.out.print("��ѡ��,��������:");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("1.�ͻ���Ϣ����");
				isRight = true;
				break;
			case 2:
				System.out.println("2.�������");
				isRight = true;
				break;
			case 3:
				System.out.println("3.�������");
				isRight = true;
				break;
			case 4:
				System.out.println("4.ע��");
				isRight = true;
				break;
			default:
				System.out.println("�������,��������������:");
				isRight = false;
				break;
			}
		} while (isRight == false);
		System.out.println("�������!");
	}
}
