package arrayseg;

import java.util.Arrays;

public class GetSecondMinMaxFromIntergerArray {

	public static void main(String[] args) {
		int[] arr = { 1, 10, 90, -10, 0, 19 };
		System.out.println(get2ndMax(arr));
		System.out.println(get2ndMin(arr));
	}

	private static int get2ndMax(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}

	private static int get2ndMin(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
