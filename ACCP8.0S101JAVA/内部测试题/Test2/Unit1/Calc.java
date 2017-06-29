package Test2.Unit1;

public class Calc {
	int num1;
	int num2;

	public void jisuan(String fuhao) {
		int result = 0;
		if (fuhao.equals("+")) {
			result = num1 + num2;
		} else if (fuhao.equals("*")) {
			result = num1 * num2;
		}
		System.out.println(num1 + fuhao + num2 + "=" + result);
	}
}
