import java.util.Scanner;

public class ʯͷ������ {

	public static void main(String[] args) {
		// 0-2
		// +1
		// 1-3
		int j = (int) (Math.random() * 3) + 1;
		System.out.println("��Ϸʯͷ������");
		System.out.println("������:(1.ʯͷ 2.���� 3.��)");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("���������ʯͷ");
			break;
		case 2:
			System.out.println("��������Ǽ���");
			break;
		case 3:
			System.out.println("��������ǲ�");
			break;
		default:
			break;
		}
		if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3) {
			System.out.println("�;�");
		} else if (i == 1 && j == 2 || i == 2 && j == 3 || i == 3 && j == 1) {
			System.out.println("��Ӯ��");
		} else {
			System.out.println("������");
		}

	}

}
