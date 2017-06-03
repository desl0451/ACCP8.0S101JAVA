package shangji1;

import java.util.Scanner;

public class PriceLookup2 {

	public static void main(String[] args) {
		String name = "";// 商品名称
		double price = 0.0;// 商品价格
		int goodsNo = 0;// 商品编号
		int amount = 0;// 购买数量
		double discount = 0.8;// 折扣比例
		double total = 0.0;// 商品总价
		double payment = 0.0;// 实付金额

		System.out.println("MyShopping管理系统->购物结算\n");
		System.out.println("**************************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("**************************************");
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while ("y".equals(answer)) {
			System.out.print("请输入商品编号:");
			goodsNo = input.nextInt();
			System.out.print("请输入购买数量:");
			amount = input.nextInt();
			switch (goodsNo) {
			case 1:
				name = "T恤";
				price = 245.0;
				break;
			case 2:
				name = "网球鞋";
				price = 570.0;
				break;
			case 3:
				name = "网球拍";
				price = 320.0;
				break;
			}
			total = total + price * amount;
			System.out.println(name + "\t" + "￥" + price + "\t数量" + amount + "\t合计￥" + (price * amount));
			System.out.print("是否继续(y/n):");
			answer = input.next();
		}
		System.out.println("\n折扣:" + discount);
		total = total * 0.8;
		System.out.println("应付金额:" + total);
		System.out.print("实付金额:");
		payment = input.nextDouble();
		System.out.println("找钱:" + (payment - total));
		System.out.println("程序结束!");

	}

}
