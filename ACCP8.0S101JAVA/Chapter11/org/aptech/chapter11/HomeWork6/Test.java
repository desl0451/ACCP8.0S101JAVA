package org.aptech.chapter11.HomeWork6;

public class Test {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "李小侠";
		hero.blood = 300;
		hero.showInfo();

		Weapon weapon = new Weapon();
		weapon.name = "死神镰刀";
		weapon.attckPower = 12;
		weapon.showInfo();

		Monster monster = new Monster();
		monster.name = "小龟";
		monster.blood = 300;
		monster.type = "潜水类";
		monster.showInfo();
	}

}
