package org.aptech.chapter08.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// ��һ�����У�8��4��2��1��23��344��12
		// ѭ��������е�ֵ
		// ��������������ֵ�ĺ�
		// ������Ϸ���Ӽ�������������һ�����ݣ�
		// �ж��������Ƿ��������
		Scanner input = new Scanner(System.in);
		boolean bl = false;// �ٱ�ʾû�ҵ� �� �ҵ���
		System.out.print("������һ����:");
		int shu = input.nextInt();
		int[] nums = { 8, 4, 2, 1, 23, 344, 12 };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == shu) {
				bl = true;
			}
			sum += nums[i];
			System.out.println(nums[i]);
		}

		System.out.println("�ܺ���:" + sum);
		if (bl) {
			System.out.println("�ҵ���.�۹�����");
		} else {
			System.out.println("û�ҵ�..�ٺ�");
		}
	}

}
