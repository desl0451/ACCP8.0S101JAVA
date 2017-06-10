package org.aptech.chapter11.test;

public class Teacher {
	String name;//姓名
	String major;//专业方向
	String courses;//教授课程
	int schoolAge;//教龄
	
	public void show(){
		System.out.println("姓名:"+name);
		System.out.println("专业方向:"+major);
		System.out.println("教授课程:"+courses);
		System.out.println("教龄:"+schoolAge);
	}
}
