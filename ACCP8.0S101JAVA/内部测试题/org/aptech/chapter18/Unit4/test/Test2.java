package org.aptech.chapter18.Unit4.test;

import java.util.Scanner;

public class Test2 {
	public double getAvg(Student[] students) {
		double avg = 0.0;
		double sum = 0.0;
		for (int i = 0; i < students.length; i++) {
			sum += students[i].height;
		}
		avg = sum / students.length;
		return avg;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] students = new Student[3];
		String[] result = new String[2];
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入第" + (i + 1) + "位同学的姓名,身高:");
			students[i] = new Student();
			String str = input.nextLine();
			result = str.split(" ");
			students[i].name = result[0];
			students[i].height = Double.parseDouble(result[1]);
		}
		Test test = new Test();
		double heightAvg = test.getAvg(students);
		System.out.println("平均身高是:" + heightAvg);
	}
}
