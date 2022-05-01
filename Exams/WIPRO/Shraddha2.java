package WIPRO;

import java.util.Scanner;

public class Shraddha2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int sum = 0;
		char max = str.charAt(0);
		char min = str.charAt(0);

		for (char i = 0; i < str.length(); i++) {
			if (max < str.charAt(i))
				max = str.charAt(i);

			if (min > str.charAt(i))
				min = str.charAt(i);
		}

		sum = max + min;
		System.out.println(sum);

		sc.close();
	}

}
