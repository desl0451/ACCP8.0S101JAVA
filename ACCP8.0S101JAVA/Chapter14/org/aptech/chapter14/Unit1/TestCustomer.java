package org.aptech.chapter14.Unit1;

import java.util.*;

public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz biz = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		boolean con = true;
		while (con) {
			System.out.print("������ͻ�������:");
			String newName = input.next();
			// ����addName����
			biz.addName(newName);
			System.out.print("����������?(Y/N):");
			String choice = input.next();
			if (choice.equals("n")) {
				con = false;
			}
		}
		biz.showNames();
		System.out.println("������Ҫ�޸ĵĿͻ�������");
		String oldName = input.next();
		System.out.println("�������µĿͻ�����:");
		String newName = input.next();
		boolean bl = biz.editName(oldName, newName);
		if (bl == true) {
			System.out.println("�ҵ��˲��޸ĳɹ�!");
		} else {
			System.out.println("û���ҵ��޷��޸�!");
		}
		biz.showNames();
	}
}
