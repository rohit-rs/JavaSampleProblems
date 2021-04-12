package stringseg;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		/*
		 * input => My name is Rohit. I am from Pune. I have three stars at HR 
		 * output => HR at stars three.....
		 */

		String str = "My name is Rohit. I am from Pune. I have three stars at HR";
		String[] arr = str.split("\\.");

		for (int i = arr.length - 1; i >= 0; i--) {
			String[] temp = arr[i].trim().split(" ");

			for (int j = temp.length - 1; j >= 1; j--) {
				System.out.print(temp[j].trim() + " ");
			}
			System.out.print(temp[0].trim()+ ". ");
		}

	}

}
