package HSBC;

import java.util.ArrayList;
import java.util.Arrays;

public class NEw {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		int arr[] = { 3, 116, 136, 61, 11, 616, 216, 376, 61, 6, -1 };

		int cnt = 0;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] <= 100 && arr[i] >= 1) {
				al.add(arr[i]);
			} else if (arr[i] >= 100 && cnt == 0) {
				al.add(arr[i]);
				cnt++;
			}

		}

//		for (int i = 0; i < arr.length; i++) {
//			if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5 || i == 8 || i == 9) {
//				al.add(arr[i]);
//			}
//                    
//		}

		for (Object a : al)
			System.out.println(a);

	}

}
