package org.aptech.chapter14.Unit1;

public class StudentsBiz {
	String[] names = new String[30];

	
	/**
	 * �������
	 * 
	 * @param name
	 *            ����
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
	 * ��ʾѧ������
	 */
	public void showNames() {
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null)
				System.out.println(names[i]);
		}
	}
}
