package org.jbit.tigao;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.1-100֮�������(����)��
		// boolean bl = true;
		// int he = 0;
		// for (int i = 2; i <= 100; i++) {
		// for (int j = 2; j < i; j++) {
		// if (i % j == 0) {
		// bl = false;
		// }
		// }
		// if (bl == true) {
		// System.out.println(i);
		// he += i;
		// } else {
		// bl = true;
		// }
		// }
		// System.out.println(he);
		// 2.100����5�ı���+7�ı���+10�ı���֮��
		// int sum = 0;
		// for (int i = 1; i <= 100; i++) {
		// if (i % 5 == 0 || i % 7 == 0 || i % 10 == 0) {
		// sum += i;
		// }
		// }
		// System.out.println("�ܺ���:" + sum);
		// 3.ˮ�ɻ���1000���ڵ�
		// ����ÿ��λ�ϵ����ֵ� n
		// ����֮�͵���������
		// 1^3�η� + 5^3+ 3^3 = 1 5 3

		// int ge = 0;
		// int shi = 0;
		// int bai = 0;
		// for (int i = 100; i < 1000; i++) {
		// ge = i % 10;
		// shi = i / 10 % 10;
		// bai = i / 100;
		// if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
		// System.out.println(i);
		// }
		// }
		// int score = 0; //����
		// int num = 0; //����80�ֵ�����
		// Scanner input = new Scanner(System.in);
		// System.out.println("����༶������:");
		// int total = input.nextInt();//������
		// for (int i = 0; i < total; i++) {
		// System.out.print("�������" + (i + 1) + "λѧ���ĳɼ��� ");
		// score = input.nextInt();
		// if (score < 80) {
		// continue;
		// }
		// num++;
		// }
		// System.out.println("80�����ϵ�ѧ�������ǣ� " + num);
		// double rate = num/ total * 100; // �������
		// System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��" + rate + "%");

//		int i = 1;
//		while (i <= 5) {
//			System.out.println("�Ұ�������ʦ");
//
//			if (i == 3) {
//				// break;
//				i++;
//				continue;
//			}
//
//		}
		//
		// int i = 1;
		// do {
		// System.out.println("�Ұ�������ʦ");
		// i++;
		// } while (i <= 5);

		// for (int i = 1; i <= 5; i++) {
		// System.out.println("�Ұ�������ʦ");
		// }
		double firstAvg = 80;
		double secondAvg;
		int rise = 4;
		secondAvg = firstAvg + rise;
		System.out.println(secondAvg);

	}

}
