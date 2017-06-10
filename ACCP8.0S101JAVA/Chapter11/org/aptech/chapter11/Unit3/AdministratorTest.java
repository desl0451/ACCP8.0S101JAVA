package org.aptech.chapter11.Unit3;

import org.aptech.chapter11.Unit3.Administrator;

public class AdministratorTest {
	public static void main(String[] args) {
		Administrator admin1 = new Administrator();
		Administrator admin2 = new Administrator();
		// 给管理员对象1赋值并调用显示方法
		admin1.name = "admin1";
		admin1.password = "111111";

		admin1.show();

		// 给管理员对象2赋值并调用显示方法
		admin2.name = "admin2";
		admin2.password = "222222";
		admin2.show();
	}
}
