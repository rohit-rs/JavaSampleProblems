package stringseg;

public class CheckForPelindrome {

	public static void main(String[] args) {
		String str = "tooaot";
		System.out.println(isPelindrome(str));
	}

	private static boolean isPelindrome(String str) {
		/*
		 * Input - civic ==> true
		 * Input - rohit ==> false
		 */
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
