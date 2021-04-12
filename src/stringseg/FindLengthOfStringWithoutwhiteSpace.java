package stringseg;

public class FindLengthOfStringWithoutwhiteSpace {

	public static void main(String[] args) {
		String str = "a   b   c   ";
		System.out.println(getStringLength_m1(str));
		System.out.println(getStringLength_m2(str));
	}

	// Method to get the String length without white spaces using regex
	public static int getStringLength_m1(String str) {
		int length = 0;
		//Check is string is empty or null
		if (str.isEmpty() || str == null) {
			return length;
		} 
		//Else replace all white chars with ""
		else {
			String temp = str.replaceAll("\\s", "");
			return temp.length();
		}

	}

	// Method to get the String length without white spaces
	public static int getStringLength_m2(String str) {
		char[] arr = str.toCharArray();
		int length = 0;
		//Check is string is empty or null
		if (str.isEmpty() || str == null) {
			return length;
		} 
		//Else count the character excluding white spaces
		else {
			for (char c : arr) {
				if (!Character.isWhitespace(c)) {
					length++;
				}
			}
		}
		return length;
	}
}
