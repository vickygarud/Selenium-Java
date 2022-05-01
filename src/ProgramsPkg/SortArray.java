package ProgramsPkg;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		
		int arr[] = {12,43,66,88,923,14,67,88};
		
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		Arrays.sort(arr);
		System.out.println("\n");
		System.out.println("Sorted Array: ");
		for(int a:arr)
			System.out.print(a+" ");
		
		
	}

}
