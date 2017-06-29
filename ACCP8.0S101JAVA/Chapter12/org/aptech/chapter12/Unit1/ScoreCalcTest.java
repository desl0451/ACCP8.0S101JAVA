package org.aptech.chapter12.Unit1;

import java.util.Scanner;

public class ScoreCalcTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScoreCalc calc = new ScoreCalc();
		System.out.print("请输入Java成绩:");
		calc.java = input.nextInt();
		System.out.println("请输入C#成绩:");
		calc.c = input.nextInt();
		System.out.println("请输入DB成绩:");
		calc.db = input.nextInt();
		System.out.println("总成绩是:" + calc.calcTotalScore());
		System.out.println("平均成绩是:" + calc.calcAvg());
	}

}
