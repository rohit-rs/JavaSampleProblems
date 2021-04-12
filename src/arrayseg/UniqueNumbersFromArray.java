package arrayseg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumbersFromArray {

	public static void main(String[] args) {
		int[] input = { 1, 1, 3, 3, 5 };
		getUniqueNumber1(input);
		System.out.println();
		getUniqueNumber2(input);
	}

	public static void getUniqueNumber1(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		for (int num : list) {
			System.out.print(num + " ");
		}

	}

	public static void getUniqueNumber2(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int num : set) {
			System.out.print(num + " ");
		}
	}

}