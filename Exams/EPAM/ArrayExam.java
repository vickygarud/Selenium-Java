package EPAM;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Length: ");
		int arr[] = new int[sc.nextInt()];

		System.out.println("Enter Array Values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr)

			if (a % 2 == 0) {
				System.out.print(a + " ");
			}

	}

}


//  1 2 3 4 5 6 7 8 9 10
//  0 1 2 3 4 5 6 7 8 9