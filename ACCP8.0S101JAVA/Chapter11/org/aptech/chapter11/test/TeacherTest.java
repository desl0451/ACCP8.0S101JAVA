package org.aptech.chapter11.test;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name = "大宝";
		teacher.major = "计算机";
		teacher.courses = "使用Java语言理解程序逻辑";
		teacher.schoolAge = 11;

		teacher.show();

	}
}
