package org.aptech.chapter03.simple2;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ->�ͻ���Ϣ����->��ӿͻ���Ϣ\n");
		System.out.print("�������Ա��(<4λ����>):");
		int shu = input.nextInt();
		if (shu >= 1000 && shu <= 9999) {
			System.out.print("�������Ա����(��/��<����λ����ʾ>):");
			String shengri = input.next();
			System.out.print("���������:");
			int jifen = input.nextInt();
			System.out.println("\n��¼��Ļ�Ա��Ϣ��:");
			System.out.println(shu + "\t" + shengri + "\t" + jifen);

		} else {
			System.out.println("��Ϣ¼��ʧ��!");
		}
	}
}
