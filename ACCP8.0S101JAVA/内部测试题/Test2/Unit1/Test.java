package Test2.Unit1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calc calc = new Calc();
		System.out.println("�������һ����:");
		calc.num1 = input.nextInt();
		System.out.println("������ڶ�����:");
		calc.num2 = input.nextInt();
		System.out.println("���������:");
		String fuhao=input.next();
		calc.jisuan(fuhao);
	}
}
