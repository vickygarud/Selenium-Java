package WIPRO;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMiddleSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Enter Length: ");
		//int a = sc.nextInt();
		
		int arr[] = {3,2,1,5,4,6,7,8,0,9};
		/*
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();			
		}
		*/
		
		
		Arrays.sort(arr);
		
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");			
		}
		int b=arr.length/2;
				sum=arr[b]+arr[--b];
		System.out.println("\nSum: "+sum);
		
		
	}

}




// 1 2 4 9 10




