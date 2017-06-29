package org.aptech.chapter13.Unit4;

import java.util.Scanner;

public class Game {
	Person person;// 甲方玩家
	Computer computer;// 乙方玩家
	int count;// 对战次

	/**
	 * 初始化方法
	 */
	public void initial() {
		person = new Person();
		computer = new Computer();
		count = 0;
	}

	/**
	 * 开始游戏方法
	 */
	public void startGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------欢迎进入游戏世界--------------------");
		System.out.println("\n\n\n\t\t*******************");
		System.out.println("\t\t**   猜拳,开始       **");
		System.out.println("\t\t*******************\n\n\n");
		System.out.println("出拳规则:1.剪刀  2.石头 3.布");
		System.out.print("请你输入玩家角色名:");
		person.name = input.next();

		System.out.print("请选择对方角色(1.刘备 2.孙权 3.曹操 4.王老师 5.孙老师)");

		int i = input.nextInt();
		switch (i) {
		case 1:
			computer.name = "刘备";
			break;
		case 2:
			computer.name = "孙权";
			break;
		case 3:
			computer.name = "曹操";
			break;
		case 4:
			computer.name = "王老师";
			break;
		case 5:
			computer.name = "孙老师";
			break;
		default:
			break;
		}
		System.out.print("玩家角色名称是:");
		System.out.println(person.name);
		System.out.print("电脑角色名称是:");
		System.out.println(computer.name);

		/* 开始游戏 */
		System.out.println("\n要开始吗?(Y/N) ");
		String con = input.next();
		int perFist; // 用户出拳
		int compFist; // 电脑出拳
		while (con.equals("y")) {
			/* 出拳 */
			perFist = person.showFist();// 用户出拳
			compFist = computer.showFist();// 电脑出拳
			/* 裁决 */
			if ((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)) {
				System.out.println("结果:和局,真衰!\n");// 平局
			} else if ((perFist == 1 && compFist == 3) || (perFist == 2 && compFist == 1)
					|| (perFist == 3 && compFist == 2)) {
				System.out.println("结果:恭喜,你赢了!");
				person.score++;
			} else {
				System.out.println("结果:^_^!!,你输了!,真笨!");
				computer.score++;
			}
			count++;
			System.out.println("\n要开始吗?(Y/N) ");
			con = input.next();
		}
	}

	public void showResult() {
		/* 显示最后结果 */
		System.out.println("-----------------------------");
		System.out.println(computer.name + " VS " + person.name);
		System.out.println("对战次数:" + count);
		System.out.println(computer.score + " : " + person.score);
		System.out.println("-----------------------------");
	}
}
