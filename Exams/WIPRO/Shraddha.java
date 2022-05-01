package WIPRO;

import java.util.Scanner;

public class Shraddha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int div = sc.nextInt();
		int sum = 0;

		int arr[] = new int[len];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + (arr[i] % div);
		}
		System.out.println(sum);

		sc.close();
	}

}
