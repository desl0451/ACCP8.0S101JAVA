package org.aptech.chapter15.Unit1;

public class Register {
	public boolean verify(String name, String pwd1, String pwd2) {
		boolean flag = false;
		if (name.length() < 3 || pwd1.length() < 6) {
			System.out.println("用户名长度不能小于3,密码长度不能小于6!");
			flag = true;
		}
		if (!pwd1.equals(pwd2)) {
			System.out.println("两次输入的密码不相同!");
			flag = true;
		}
		return flag;
	}
}
