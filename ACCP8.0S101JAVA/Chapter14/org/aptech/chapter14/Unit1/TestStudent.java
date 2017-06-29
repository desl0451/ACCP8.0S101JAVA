package org.aptech.chapter14.Unit1;

public class TestStudent {

	// 形参我需写多个
	public void show(Calc c) {
		int result = c.shu1 + c.shu2 + c.shu3;
		System.out.println(result);
	}

	public static void main(String[] args) {
		TestStudent stu = new TestStudent();
		Calc calc = new Calc();
		calc.shu1 = 5;
		calc.shu2 = 10;
		calc.shu3 = 5;
		stu.show(calc);
	}
}
