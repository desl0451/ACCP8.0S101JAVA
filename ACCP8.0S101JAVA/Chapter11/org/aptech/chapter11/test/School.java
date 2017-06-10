package org.aptech.chapter11.test;

/**
 * 学校类
 */
public class School {
	// 属性
	// 中心名称
	String schoolName;
	// 中心教室数目
	int classNumber;
	// 中心机房数目
	int labNumber;

	// 显示
	public void showCenter() {
		System.out.println("中心名称:" + schoolName);
		System.out.println("教室数目" + classNumber);
		System.out.println("机房数目" + labNumber);
	}

}
