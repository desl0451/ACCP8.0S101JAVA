import java.util.Scanner;

public class 石头剪刀布 {

	public static void main(String[] args) {
		// 0-2
		// +1
		// 1-3
		int j = (int) (Math.random() * 3) + 1;
		System.out.println("游戏石头剪刀布");
		System.out.println("请输入:(1.石头 2.剪刀 3.布)");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("您输入的是石头");
			break;
		case 2:
			System.out.println("您输入的是剪刀");
			break;
		case 3:
			System.out.println("您输入的是布");
			break;
		default:
			break;
		}
		if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3) {
			System.out.println("和局");
		} else if (i == 1 && j == 2 || i == 2 && j == 3 || i == 3 && j == 1) {
			System.out.println("我赢了");
		} else {
			System.out.println("我输了");
		}

	}

}
