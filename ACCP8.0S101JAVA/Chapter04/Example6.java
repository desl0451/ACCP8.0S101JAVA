import java.util.Scanner;

public class Example6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int money = 5000;
		double result = 0;
		System.out.println("请输入您出行的月份:(1~12)");
		int month = input.nextInt();
		System.out.println("请问您选择头等舱还是经济舱?头等舱输入1,经济舱输入2");
		int cangWei = input.nextInt();
		// 旺季
		if (month >= 4 && month <= 10) {
			if (cangWei == 1) {
				System.out.println("九折");
				result = money * 0.9;
			} else {
				System.out.println("八折");
				result = money * 0.8;
			}
		} else {// 淡季
			if (cangWei == 1) {// 头等
				System.out.println("五折");
				result = money * 0.5;
			} else { // 经济
				System.out.println("四折");
				result = money * 0.4;
			}
		}
		System.out.println("您的机票价格为:" + result);
	}

}