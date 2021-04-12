package stringseg;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "abcvv";
		System.out.println(removeDuplicates_m1(str));
		System.out.println(removeDuplicates_m2(str));
	}

	//Using String methods
	private static String removeDuplicates_m1(String str) {
		String strWithNoDuplicates = "";
		for (char ch : str.toCharArray()) {
			if (!strWithNoDuplicates.contains(Character.toString(ch))) {
				strWithNoDuplicates = strWithNoDuplicates + ch;
			}
		}
		return strWithNoDuplicates;
	}

	// Using HashSet
	private static String removeDuplicates_m2(String str) {
		char[] arr = str.toCharArray();
		Set<Character> charSet = new HashSet<>();
		for (char ch : arr) {
			charSet.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : charSet) {
			sb.append(ch);
		}
		return sb.toString();
	}

}
