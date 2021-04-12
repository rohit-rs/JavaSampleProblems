package stringseg;

public class SeperateNumbersAndAlphabetsInAString {

	public static void main(String[] args) {
		String str = "abc765de uryt8888";
		System.out.println(seperateNumber(str));
		System.out.println(seperateAlphabets(str));
	}
	
	//Replace all the non-digits(\D) with "" to get the numbers
	public static String seperateNumber(String str) {
		String num = str.replaceAll("\\D", "");
		return num;
	}
	
	//Replace all the digits(\d) with "" to get the numbers
	public static String seperateAlphabets(String str) {
		String num = str.replaceAll("\\d", "");
		return num;
	}

}
