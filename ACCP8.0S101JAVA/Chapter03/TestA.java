import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎进入游戏世界");
		System.out.println("1.购买武器");
		System.out.println("2.卖出武器");
		System.out.println("3.退出");
		int i = input.nextInt();
		if (i == 1) {
			System.out.println("购买武器");
			System.out.println("1.干将  1000豆");
			System.out.println("2.莫邪    960豆");
			System.out.println("3.流星    400豆");
			System.out.println("4.轩辕  1800豆");
			int j = input.nextInt();
			if (j == 1) {
				System.out.println("花费:1000豆");
			} else if (j == 2) {
				System.out.println("花费:960豆");
			} else if (j == 3) {
				System.out.println("花费:400豆");
			} else if (j == 4) {
				System.out.println("花费:1800豆");
			}
		} else if (i == 2) {
			System.out.println("卖出武器");
		} else {
			System.out.println("退出");
		}
	}

}
