
public class SwitchType {
	public static void main(String[] args) {
		// jdk1.7可以使用的类型
		int i = 3;
		switch (i) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			break;
		}
		char j = 'a';
		switch (j) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		default:
			break;
		}
		String k = "abc";
		switch (k) {
		case "abc":
			System.out.println("嘿嘿");
			break;
		case "cde":
			System.out.println("哈哈");
			break;
		default:
			break;
		}
	}
}
