package org.aptech.chapter11.HomeWork6;

public class Weapon {
	public String name;//武器的名字
	public int attckPower;//攻击力
	
	public void showInfo(){
		System.out.println("我是武器，我的基本信息如下：");
		System.out.println("武器名："+name+",攻击力："+attckPower);
	}
}
