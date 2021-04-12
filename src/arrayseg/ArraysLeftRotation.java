package arrayseg;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int shiftLeft = 2;
		arrayLeftRotate(arr, shiftLeft);
	}

	private static void arrayLeftRotate(int[] arr, int shiftLeft) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[arr.length - i - shiftLeft];
		}

	}

}


/*
 * 0 --> 4 ( 5 - 0 - 1/5) 1 --> 0 (5 - 1 - 1/5) 2 --> 1 3 --> 2 4 --> 3
 */