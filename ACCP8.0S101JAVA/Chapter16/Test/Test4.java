package Test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������(��/��/��):");
		String date = input.next();
		String[] d = date.split("/");

		System.out.println(d[2] + "��" + d[0] + "��" + d[1] + "��");
	}

}
