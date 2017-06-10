package org.aptech.chapter11.test;

public class SchoolTest {

	public static void main(String[] args) {
		School school1=new School();
		//1.属性赋值
		school1.schoolName="哈尔滨博仁";//中心名称
		school1.classNumber=3; //教室数量
		school1.labNumber=15;  //机房数量
		//2.方法调用
		//对象名.方法();
		school1.showCenter();
		
		School school2=new School();
		school2.schoolName="博仁";
		school2.labNumber=13;
		school2.classNumber=6;
		school2.showCenter();
		
		
	}

}
