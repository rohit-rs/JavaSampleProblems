package mathseg;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10;
		getFibonacciSeries(num);

	}

	private static void getFibonacciSeries(int num) {
		int first = 0;
		int second = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(first + " ");
			int sum = first + second;
			first = second;
			second = sum;
		}
	}

}
