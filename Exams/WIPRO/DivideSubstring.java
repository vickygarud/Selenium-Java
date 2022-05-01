package WIPRO;

import java.util.Scanner;

public class DivideSubstring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.next();

		System.out.println("Enter Number: ");
		int div = sc.nextInt();

		// String str = "abcdefg";
		// String str ="pqrstuvw";

		for (int i = 0; i < str.length(); i++) {
			if (i % div == 0 && i != 0)
				System.out.print(" ");

			System.out.print(str.charAt(i));

		}

		sc.close();

	}

}
