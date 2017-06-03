package shangji1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		do {
			System.out.println("上机编写程序！");
			System.out.print("合格了吗?(y/n)");
			answer = input.next();
			System.out.println("");

		} while (!"y".equals(answer));

		System.out.println("恭喜你通过了测试！");

	}

}
