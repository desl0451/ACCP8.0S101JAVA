package Test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个日期(月/日/年):");
		String date = input.next();
		String[] d = date.split("/");

		System.out.println(d[2] + "年" + d[0] + "月" + d[1] + "日");
	}

}
