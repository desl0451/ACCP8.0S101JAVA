package Test2.Unit2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
		//1 2 3 4 5 6 7 8 9
		//9 8 7 6 5 4 3 2 1
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = input.nextInt();
//		}
		for (int i = 0; i <= 3; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
