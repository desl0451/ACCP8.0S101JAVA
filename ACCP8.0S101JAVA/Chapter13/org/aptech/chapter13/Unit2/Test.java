package org.aptech.chapter13.Unit2;

import org.aptech.chapter13.Unit2.Computer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.println("�û���ȭ:");
		int i = person.showFist();
		System.out.println(i);

		System.out.println("�������ȭ:");
		Computer computer = new Computer();
		int j = computer.showFist();
		System.out.println(j);
	}

}
