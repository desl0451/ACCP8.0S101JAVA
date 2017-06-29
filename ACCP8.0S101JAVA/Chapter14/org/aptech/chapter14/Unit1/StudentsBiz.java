package org.aptech.chapter14.Unit1;

public class StudentsBiz {
	String[] names = new String[30];

	
	/**
	 * 添加姓名
	 * 
	 * @param name
	 *            姓名
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}

		}
	}

	/**
	 * 显示学生姓名
	 */
	public void showNames() {
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null)
				System.out.println(names[i]);
		}
	}
}
