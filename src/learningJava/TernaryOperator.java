package learningJava;

public class TernaryOperator {

	public static void main(String[] args) {
		// variable = (condition) ? TrueExpression : FalseExpression
		int num1 = 20;
		int num2 = 40;
		if (num1 > num2) {
			System.out.println("num1>num2");
		} else {
			System.out.println("num2>num1");
		}
		String result = (num1 > num2) ? "num1>num2" : "num2>num1";
		System.out.println(result);
		boolean result1 = (num1 > num2) ? true : false;
		System.out.println(result1);
	}

}
