package org.aptech.chapter15.Unit1;

public class Register {
	public boolean verify(String name, String pwd1, String pwd2) {
		boolean flag = false;
		if (name.length() < 3 || pwd1.length() < 6) {
			System.out.println("�û������Ȳ���С��3,���볤�Ȳ���С��6!");
			flag = true;
		}
		if (!pwd1.equals(pwd2)) {
			System.out.println("������������벻��ͬ!");
			flag = true;
		}
		return flag;
	}
}
