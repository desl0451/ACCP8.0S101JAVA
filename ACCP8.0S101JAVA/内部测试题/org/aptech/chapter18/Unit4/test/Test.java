package org.aptech.chapter18.Unit4.test;

import java.util.Scanner;

public class Test {
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
		for (int i = 0; i < students.length; i++) {
			System.out.println("�������" + (i + 1) + "λͬѧ������");
			students[i] = new Student();
			students[i].name = input.next();
			System.out.println("���������");
			students[i].height = input.nextDouble();
		}
		Test test = new Test();
		double heightAvg = test.getAvg(students);
		System.out.println("ƽ�������:" + heightAvg);
	}

}
