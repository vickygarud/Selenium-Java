package WIPRO;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = "33423968";//sc.next(); // ;

		for (int i = 0; i < str.length(); i++) {
			if (Character.getNumericValue(str.charAt(i)) % 2 == 0)
				System.out.print(str.charAt(i));

		}

		
		/*
		 * int arr[] = new int[8];
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (arr[i] % 2 == 0) {
		 * System.out.print(arr[i]);
		 * 
		 * } }
		 */
		sc.close();

	}

}
