package stringseg;

import java.util.HashMap;
import java.util.Map;

public class GetOccuranceOfCharacters {

	public static void main(String[] args) {
		/*
		 * Input - aaabbc Output - 3a2b1c
		 */
		String s = "aaabbc";
		// Create an array to store all ASCII values of characters
		int[] a = new int[256];
		// Increase the counter for each character occurance
		for (int i = 0; i < s.length(); i++) {
			a[(int) s.charAt(i)]++;
		}
		// Print the occurance of each characters where count is greater than 0
		for (int j = 0; j < a.length; j++) {
			if (a[j] > 0) {
				System.out.println("Occurance of: " + (char) j + " ==> " + a[j]);
			}
		}

		// Using HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map.toString());
	}
}
