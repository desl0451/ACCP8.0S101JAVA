package org.aptech.chapter12.Unit1;

import java.util.Scanner;

public class ScoreCalcTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScoreCalc calc = new ScoreCalc();
		System.out.print("������Java�ɼ�:");
		calc.java = input.nextInt();
		System.out.println("������C#�ɼ�:");
		calc.c = input.nextInt();
		System.out.println("������DB�ɼ�:");
		calc.db = input.nextInt();
		System.out.println("�ܳɼ���:" + calc.calcTotalScore());
		System.out.println("ƽ���ɼ���:" + calc.calcAvg());
	}

}
