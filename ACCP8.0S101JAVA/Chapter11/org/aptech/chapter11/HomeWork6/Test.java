package org.aptech.chapter11.HomeWork6;

public class Test {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "��С��";
		hero.blood = 300;
		hero.showInfo();

		Weapon weapon = new Weapon();
		weapon.name = "��������";
		weapon.attckPower = 12;
		weapon.showInfo();

		Monster monster = new Monster();
		monster.name = "С��";
		monster.blood = 300;
		monster.type = "Ǳˮ��";
		monster.showInfo();
	}

}
