package mathseg;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int num = 2;
		System.out.println(factorial(num));
	}

	private static int factorial(int num) {
		int fact = 1;
		if (num <= 1) {
			return fact;
		} else {
			for (int i = num; i >= 2; i--) {
				fact = fact * i;
			}
		}
		return fact;
	}

}
