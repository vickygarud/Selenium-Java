package ZENSAR;

import java.util.Scanner;

public class Mahesh {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] + 7) % 10;

		}

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				temp = arr[2];
				arr[2] = arr[i];
				arr[i] = temp;
			} else if (i == 1) {
				temp = arr[i];
				arr[i] = arr[3];
				arr[3] = temp;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		sc.close();

	}
}

/*
I/P -1000
O/p -7787

*/
