package org.aptech.chapter11.HomeWork5;

public class QuessMachine {
	String[] goods = new String[5];
	double[] price = new double[5];
	int random = 0;
	int inputNum = 0;

	public void initial() {
		goods[0] = "�����綯��";
		price[0] = 200;

		goods[1] = "�緹��";
		price[1] = 174;

		goods[2] = "��ˮ��";
		price[2] = 162;

		goods[3] = "����";
		price[3] = 25;
		goods[4] = "������";
		price[4] = 660;

		random = (int) (Math.random() * 5);
	}

	public String guess() {
		if (inputNum < price[random]) {
			return "�ٴ�Щ!";
		} else if (inputNum > price[random]) {
			return "��СЩ!";
		} else {
			return "�¶���!";
		}
	}
}
