package org.aptech.chapter11.test;

public class Student {
	String name; // 姓名
	int age; // 年龄
	String classNo;// 班级
	String hobby;// 爱好

	/**
	 * 显示学员信息
	 */
	public void show() {
		System.out.println("姓名:" + name);
		System.out.println("年龄:" + age);
		System.out.println("班级:" + classNo);
		System.out.println("爱好:" + hobby);
	}

}
