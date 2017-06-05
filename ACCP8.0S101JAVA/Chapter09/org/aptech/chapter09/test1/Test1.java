package org.aptech.chapter09.test1;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
//		*****
//		*****
//		*****
//		*****
//		*****
		Scanner input=new Scanner(System.in);
		System.out.print("请输入行数:");
		int row=9;//input.nextInt();
		//外层循环5次  控制行数
//		for (int i = 1; i <=row; i++) {
//			//内层循环5次 控制显示的列数
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//                行            列
//		*         1     1
//		**        2     2
//		***       3     3
//		****      4     4
//		*****   .....
//		for (int i = 1; i <=row; i++) {
//			//内层循环5次 控制显示的列数
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
//                  行        列        
//		*            1计算   1   行数*2-1
//		***          2计算   3  2*2-1
//		*****        3计算   5  3*2-1
//		*******      4计算   7  4*2-1
//		*********    5计算   9  5*2-1
		System.out.println();
		for (int i = 1; i <=5; i++) {
			//内层循环5次 控制显示的列数
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		*****
//		****
//		***
//		**
//		*




		

	}

}
