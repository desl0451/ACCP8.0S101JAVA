package org.aptech.chapter16.Unit2;

import java.util.Scanner;

public class StudentDao {

	/**
	 * ģ�����ѧ�����ݵ����ݿ�
	 * 
	 * @param stu
	 */
	public void insertStudent(Student stu) {
		System.out.println("\n����ѧ����Ϣ�ɹ�д�뵽���ݿ�");
		System.out.println(stu.name + "  " + stu.age + "   " + stu.sex + "  " + stu.school);
	}

	public static void main(String[] args) {
		Student stu = new Student();
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		stu.name = input.next();
		System.out.print("������ѧ�����䣺");
		stu.age = input.nextInt();
		System.out.print("������ѧ���Ա�");
		stu.sex = input.next();
		System.out.print("������ѧ��ѧУ��");
		stu.school = input.next();

		StudentDao stuDao = new StudentDao();
		stuDao.insertStudent(stu);
	}

}
