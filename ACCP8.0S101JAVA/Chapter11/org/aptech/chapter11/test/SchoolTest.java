package org.aptech.chapter11.test;

public class SchoolTest {

	public static void main(String[] args) {
		School school1=new School();
		//1.���Ը�ֵ
		school1.schoolName="����������";//��������
		school1.classNumber=3; //��������
		school1.labNumber=15;  //��������
		//2.��������
		//������.����();
		school1.showCenter();
		
		School school2=new School();
		school2.schoolName="����";
		school2.labNumber=13;
		school2.classNumber=6;
		school2.showCenter();
		
		
	}

}
