package Day_Jan03;

public class PrintTrangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				int no = j - i + i;
				System.out.print(j + " ");
			}
			System.out.println();

		}

		int a[][] = { { 1, 2, 2 }, { 23, 5, 66 } };
		String b[][] = { { "aa", "bb", "cc" }, { "e", "f", "h" } };

	}

}

/*
 * 
 * 
 * 1 1 2 1 1 3 3 1 1 4 6 4 1 1 10 10 5 1
 * 
 * 
 */
