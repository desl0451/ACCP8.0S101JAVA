package org.aptech.chapter14.Unit1;

public class CustomerBiz {
	String[] names = new String[100];

	/**
	 * 添加顾客姓名
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
	 * 显示顾客姓名
	 */
	public void showNames() {
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null)
				System.out.println(names[i]);
		}
	}

	public boolean editName(String oldName, String newName) {
		boolean bl = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				if (names[i].equals(oldName)) {
					names[i] = newName;
					bl = true;
					break;
				}
			}
		}
		return bl;
	}

}
