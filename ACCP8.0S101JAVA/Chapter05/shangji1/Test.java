package shangji1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println("�ϻ���д����");
			System.out.print("�ϸ�����?(y/n)");
			answer = input.next();
			System.out.println("");

		} while (!"y".equals(answer));

		System.out.println("��ϲ��ͨ���˲��ԣ�");

	}

}
