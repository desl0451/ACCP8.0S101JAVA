package org.aptech.chapter11.Unit4;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin1";
		admin.password = "111111";
		// ����ɵ��û���������
		System.out.print("�������û���:");
		String name = input.next();
		System.out.print("����������:");
		String pwd = input.next();
		// �ж��û�������û����������Ƿ���ȷ
		if (admin.name.equals(name) && admin.password.equals(pwd)) {
			System.out.print("\n������������:");
			admin.password = input.next();
			System.out.println("�޸�����ɹ�,����������Ϊ:" + admin.password);
		} else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ");
		}
	}
}
