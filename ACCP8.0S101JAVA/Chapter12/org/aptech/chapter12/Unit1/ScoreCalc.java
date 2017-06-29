package org.aptech.chapter12.Unit1;

public class ScoreCalc {
	int java;
	int c;
	int db;

	public int calcTotalScore() {
		int total = java + c + db;
		return total;
	}

	public void showTotalScore() {
		System.out.println("总成绩是:" + calcTotalScore());
	}

	public double calcAvg() {
		double avg = (java + c + db) / 3.0;
		return avg;
	}

	public void showAvg() {
		System.out.println("平无成绩是:" + calcAvg());
	}
}
