package org.aptech.chapter15.Unit1;

import java.util.Scanner;

public class TestRegister {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Register r = new Register();
		boolean con = true;
		do {
			System.out.println("***��ӭ����ע��ϵͳ***");
			System.out.print("�������û���:");
			String name = input.next();
			System.out.print("����������:");
			String pwd1 = input.next();
			System.out.print("���ٴ���������:");
			String pwd2 = input.next();
			con = r.verify(name, pwd1, pwd2);
			if (con == false) {
				System.out.println("ע��ɹ�!���μ��û��������롣");
			}
		} while (con);

		System.out.println("�������!");
	}
}
