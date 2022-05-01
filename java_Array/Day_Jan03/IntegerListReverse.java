package Day_Jan03;

import java.util.Arrays;


public class IntegerListReverse 
{

	static void reverse(int arr[])
	{
		System.out.println("\nUsing Arrays.sort class: ");
		
		for (int i=0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
	}
	
	static void bubbleSort(int arr[])
	{
		int[] coppyArr = new int [arr.length];
		
			for(int j=0;  j<arr.length; j++)
				coppyArr[j]=arr[j];	

		for(int i=0; i<coppyArr.length; i++)
		{
			
			for(int j=0; j<coppyArr.length-1; j++)
			{
				if(coppyArr[j] > coppyArr[j+1])
				{
					int temp=coppyArr[j];
					coppyArr[j] = coppyArr[j+1];
					coppyArr[j+1] = temp;
					
				}

			}
			
		}
		
		System.out.println("Using Bubble Sort: ");
		
		for (int i=0; i<coppyArr.length; i++)
			System.out.print(coppyArr[i]+" ");
		
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = { 7,4,2,9,1 };
		
		bubbleSort(a);
		
		Arrays.sort(a);
		reverse(a);
		
		

	}

}



/* 
17.	Write a program containing list of integers to reverse 
a.	7,4,2,9,1
b.	Expected Output: 1 2 4 7 9 

*/;