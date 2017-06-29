package org.aptech.chapter16.Unit2;

import java.util.Scanner;

public class StudentDao {

	/**
	 * 模拟插入学生数据到数据库
	 * 
	 * @param stu
	 */
	public void insertStudent(Student stu) {
		System.out.println("\n将该学生信息成功写入到数据库");
		System.out.println(stu.name + "  " + stu.age + "   " + stu.sex + "  " + stu.school);
	}

	public static void main(String[] args) {
		Student stu = new Student();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		stu.name = input.next();
		System.out.print("请输入学生年龄：");
		stu.age = input.nextInt();
		System.out.print("请输入学生性别：");
		stu.sex = input.next();
		System.out.print("请输入学生学校：");
		stu.school = input.next();

		StudentDao stuDao = new StudentDao();
		stuDao.insertStudent(stu);
	}

}
