package arrayseg;

public class GetMinMaxFromIntegerArray {

	public static void main(String[] args) {
		int[] arr = { 1, 100, 20, 10, 55, 0, -5 };
		System.out.println(getMax(arr));
		System.out.println(getMin(arr));
	}

	private static int getMax(int[] arr) {
		int max = 0;
		//Get the largest number from array
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	private static int getMin(int[] arr) {
		int min = 0;
		//Get the largest number from array
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
