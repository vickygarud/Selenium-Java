package WIPRO;

import java.util.Arrays;

public class CountNegative {

	public static void main(String[] args) {
		

		int arr[] = { -8, 9, -3, 8, -6, -7, 8, -10, 12, 14 };
		
		//int arr[] = { 9,-3,8,-6,-7,8,10};

		//Arrays.sort(arr);

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 1) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
