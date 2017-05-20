package org.aptech.chapter03.simple2;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统->客户信息管理->添加客户信息\n");
		System.out.print("请输入会员号(<4位整数>):");
		int shu = input.nextInt();
		if (shu >= 1000 && shu <= 9999) {
			System.out.print("请输入会员生日(月/日<用两位数表示>):");
			String shengri = input.next();
			System.out.print("请输入积分:");
			int jifen = input.nextInt();
			System.out.println("\n已录入的会员信息是:");
			System.out.println(shu + "\t" + shengri + "\t" + jifen);

		} else {
			System.out.println("信息录入失败!");
		}
	}
}
