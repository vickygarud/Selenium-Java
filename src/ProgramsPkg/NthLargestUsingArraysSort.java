package ProgramsPkg;

import java.util.Arrays;

// finding nth largest number using user defined sort function
public class NthLargestUsingArraysSort {

	public static void main(String[] args) {
		int[] arr = {12,48,23,78,45,44,79};
		//int temp;
		
		// find nth largest
		// largest: Enter 0
		// second largest: enter 1
		// third largest: enter 2 and so on
		
		int nthLargest=9;  // 1
		
		if(nthLargest<=0)  //1<=0
			nthLargest=1;  // 1
		if (nthLargest > arr.length)  // 1>=7
			nthLargest = arr.length;  // 7
				
		Arrays.sort(arr);

		for(int a: arr)
			System.out.print(a + " ");
		int ind = arr.length - nthLargest;  // 7 -1
		System.out.println("\n"+ nthLargest + " largest no: " + arr[ind]);
	}
}
