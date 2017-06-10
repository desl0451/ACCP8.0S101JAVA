package org.aptech.chapter11.HomeWork6;

public class Monster {

	public String name;//怪物的名字
	public int blood;//生命值
	public String type;//怪物类型
	
	public void showInfo(){
		System.out.println("我是怪物，我的基本信息如下：");
		System.out.println("姓名:"+name+",生命值:"+blood+",类型："+type);
	}
}
