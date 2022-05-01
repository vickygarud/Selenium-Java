package TCS;

import java.util.Scanner;

public class Nayn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No: ");

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		int green = arr[2] / arr[0];
//		int yellow = arr[3] / arr[1];
//		int n = arr[4];

		int op = 4 * (int) ((arr[2] / arr[0] * arr[4]) + (arr[3] / arr[1] * arr[4]) * 1.5);

		System.out.println(op);
		
		sc.close();
	}

}

/*

Enter No: 
100
400
1000
1200
100
5800

*/