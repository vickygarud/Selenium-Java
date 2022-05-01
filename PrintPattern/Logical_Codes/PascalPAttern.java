package Logical_Codes;

public class PascalPAttern {

	static void printPattern() {
		int cnt;
		for (int i = 0; i <= 5; i++) {
			cnt = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(cnt + " ");
				cnt = cnt * (i - j) / (j + 1);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		printPattern();
	}

}

/*
 * 
 *  1
 *  1 1 
 *  1 2 1 
 *  1 3 3 1 
 *  1 4 6 4 1
 *  1 10 10 5 1
 * 
 */