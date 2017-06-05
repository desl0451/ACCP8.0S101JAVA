
public class DEMOS {
	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		int m = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 1) {
					n++;
				} else if (j == 2) {
					k++;
				} else {
					m++;
				}
			}
		}
		System.out.println(n);
		System.out.println(k);
		System.out.println(m);

	}
}
