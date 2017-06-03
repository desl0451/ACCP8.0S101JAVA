package shangji1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		boolean isRight = true;
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MySchopping管理系统\n");
		System.out.println("***************************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.购物结算");
		System.out.println("\t\t3.真情回馈");
		System.out.println("\t\t4.注销");
		System.out.println("***************************************");
		do {
			System.out.print("请选择,输入数字:");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("1.客户信息管理");
				isRight = true;
				break;
			case 2:
				System.out.println("2.购物结算");
				isRight = true;
				break;
			case 3:
				System.out.println("3.真情回馈");
				isRight = true;
				break;
			case 4:
				System.out.println("4.注销");
				isRight = true;
				break;
			default:
				System.out.println("输入错误,请重新输入数字:");
				isRight = false;
				break;
			}
		} while (isRight == false);
		System.out.println("程序结束!");
	}
}
