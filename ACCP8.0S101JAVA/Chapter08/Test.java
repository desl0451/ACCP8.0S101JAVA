import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 324,234,23, 42, 346, 3456, 256, 5685 };
		Arrays.sort(nums);
		System.out.println("����");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("����");
		// �±� 0 1 2 3 4 5 0-5 ����
		// �±� 5 4 3 2 1 0 5-0 ����
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}
