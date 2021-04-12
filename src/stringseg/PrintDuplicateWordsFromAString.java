package stringseg;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWordsFromAString {

	public static void main(String[] args) {
		String str = "This is a test string This is a sample string";

		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 0);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				}
			}
		}
		System.out.println(map);
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}
		}

	}

}
