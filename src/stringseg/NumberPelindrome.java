package stringseg;

public class NumberPelindrome {

	public static void main(String[] args) {
		int num = 19591;
		System.out.println(isPelindrome(num));
	}

	private static boolean isPelindrome(int num) {
		/*
		 * Input 1551 ==> true 
		 * Input 7021 ==> false
		 */
		int copyOfOriginalNum = num;
		int reversedNum = 0;
		int remainder = 0;
		// Reverse the original number, compare the original number to reversed number
		while (num > 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reversedNum);
		return reversedNum == copyOfOriginalNum;
	}

}
