package shangji1;

public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		int num = 2;
		while (num <= 100) {
			sum = sum + num;
			num = num + 2;
		}
		System.out.println("100���ڵ�ż��֮��Ϊ:" + sum);
	}
}
