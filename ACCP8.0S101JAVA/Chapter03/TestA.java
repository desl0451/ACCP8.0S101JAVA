import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ������Ϸ����");
		System.out.println("1.��������");
		System.out.println("2.��������");
		System.out.println("3.�˳�");
		int i = input.nextInt();
		if (i == 1) {
			System.out.println("��������");
			System.out.println("1.�ɽ�  1000��");
			System.out.println("2.Īа    960��");
			System.out.println("3.����    400��");
			System.out.println("4.��ԯ  1800��");
			int j = input.nextInt();
			if (j == 1) {
				System.out.println("����:1000��");
			} else if (j == 2) {
				System.out.println("����:960��");
			} else if (j == 3) {
				System.out.println("����:400��");
			} else if (j == 4) {
				System.out.println("����:1800��");
			}
		} else if (i == 2) {
			System.out.println("��������");
		} else {
			System.out.println("�˳�");
		}
	}

}
