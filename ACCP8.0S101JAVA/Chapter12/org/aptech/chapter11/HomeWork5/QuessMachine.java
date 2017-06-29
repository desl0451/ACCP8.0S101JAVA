package org.aptech.chapter11.HomeWork5;

public class QuessMachine {
	String[] goods = new String[5];
	double[] price = new double[5];
	int random = 0;
	int inputNum = 0;

	public void initial() {
		goods[0] = "公主电动车";
		price[0] = 200;

		goods[1] = "电饭煲";
		price[1] = 174;

		goods[2] = "净水器";
		price[2] = 162;

		goods[3] = "耳机";
		price[3] = 25;
		goods[4] = "吸尘器";
		price[4] = 660;

		random = (int) (Math.random() * 5);
	}

	public String guess() {
		if (inputNum < price[random]) {
			return "再大些!";
		} else if (inputNum > price[random]) {
			return "再小些!";
		} else {
			return "猜对了!";
		}
	}
}
