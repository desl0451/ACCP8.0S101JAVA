package Test2.Unit1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calc calc = new Calc();
		System.out.println("请输入第一个数:");
		calc.num1 = input.nextInt();
		System.out.println("请输入第二个数:");
		calc.num2 = input.nextInt();
		System.out.println("请输入符号:");
		String fuhao=input.next();
		calc.jisuan(fuhao);
	}
}
