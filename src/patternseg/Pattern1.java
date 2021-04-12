package patternseg;

public class Pattern1 {

	public static void main(String[] args) {
		/* Pattern
		 * 1
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 */
		int rows = 5;
		int temp = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
		
		//Limit the result based on limit
		System.out.println("\n");
		temp = 1;
		int limit = 12;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp++;
				if (temp > limit) {
					break; 
				}
			}
			System.out.println();
		}
	}
}
