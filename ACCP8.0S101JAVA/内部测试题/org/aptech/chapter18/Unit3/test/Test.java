package org.aptech.chapter18.Unit3.test;

public class Test {
	public static void main(String[] args) {
		System.out.println("��һ�������е�Ԫ��:10,20,30");
		int[] num1 = new int[] { 10, 20, 30 };
		System.out.println("�ڶ��������е�Ԫ��:40,50,60");
		int[] num2 = new int[] { 40, 50, 60 };
		int[] sum = new int[6];
		for (int i = 0; i < sum.length; i++) {
			if (i < 3) { // 0 1 2
				sum[i] = num1[i];
			} else {
				sum[i] = num2[i - 3];
			}
		}
		System.out.print("��������ϲ���:");
		for (int i = 0; i < sum.length; i++) {
			if (i != sum.length - 1)
				System.out.print(sum[i] + ",");
			else
				System.out.print(sum[i]);
		}
		System.out.print("\n�����:");
		for (int i = sum.length - 1; i >= 0; i--) {
			System.out.print(sum[i] + ",");
		}
	}
}
