package ZENSAR;

import java.util.Scanner;

public class FactJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;
		int total = 0;
		for (int i = a; i >= 1; i--) {
			sum = sum * i;
		}

		String str = Integer.toString(sum);

		for (int i = 0; i < str.length(); i++) {
			total = total + Character.getNumericValue(str.charAt(i));
		}

		System.out.println("Factorial is " + sum + " and sum of digit is " + total);

		sc.close();

	}

}
