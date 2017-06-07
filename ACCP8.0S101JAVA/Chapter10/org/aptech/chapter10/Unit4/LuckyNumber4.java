package org.aptech.chapter10.Unit4;

import java.util.Scanner;

public class LuckyNumber4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 9999;
		int min = 1000;
		int cardNumber = 0;
		String name = ""; // 用户名
		String pass = ""; // 密码
		String answer = "";
		int[] cardNum = new int[5];
		boolean bl = false;// 表示状态是中奖
		do {
			System.out.println("************欢迎进入奖客富翁系统**************");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("***************************************");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("[奖客富翁系统 > 注册]");
				System.out.print("用户名:");
				name = input.next();
				System.out.print("密码:");
				pass = input.next();
				// 生成卡号
				cardNumber = (int) (Math.random() * (max - min)) + min;

				System.out.println("注册成功,请记好您的会员卡号");
				System.out.println("用户名\t密码\t会员卡号");
				System.out.println(name + "\t" + pass + "\t" + cardNumber);
				break;
			case 2:
				System.out.println("[奖客富翁系统 > 登录]");
				for (int n = 1; n <= 3; n++) {
					System.out.print("请输入用户名:");
					String newName = input.next();
					System.out.print("请输入密码:");
					String newPass = input.next();
					if (name.equals(newName) && pass.equals(newPass)) {
						System.out.println("欢迎您:" + newName);
						break;
					} else {
						System.out.println("您还有" + (3 - n) + "次机会");
					}
				}
				break;
			case 3:
				System.out.println("[奖客富翁系统 > 抽奖]");
			
				break;
			default:
				break;
			}
			System.out.print("继续吗?(y/n):");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\n系统退出,谢谢使用");
	}
}
