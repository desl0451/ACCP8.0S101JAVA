import java.util.Scanner;

public class Example6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int money = 5000;
		double result = 0;
		System.out.println("�����������е��·�:(1~12)");
		int month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��ò�?ͷ�Ȳ�����1,���ò�����2");
		int cangWei = input.nextInt();
		// ����
		if (month >= 4 && month <= 10) {
			if (cangWei == 1) {
				System.out.println("����");
				result = money * 0.9;
			} else {
				System.out.println("����");
				result = money * 0.8;
			}
		} else {// ����
			if (cangWei == 1) {// ͷ��
				System.out.println("����");
				result = money * 0.5;
			} else { // ����
				System.out.println("����");
				result = money * 0.4;
			}
		}
		System.out.println("���Ļ�Ʊ�۸�Ϊ:" + result);
	}

}