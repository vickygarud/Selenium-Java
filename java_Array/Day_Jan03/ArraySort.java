package Day_Jan03;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int arr[] = {4,5,33,5,6,33,75,22,66,33,8,9,9,533,222,444};
		
		for( int i=0; i<arr.length; i++)
		{
			
			for( int j= i+1; j<arr.length; j++)
			{
				
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]   = arr [j];
					arr[j]   = temp;
				}
				
				
			}
			
		}
		
		for( int a : arr)
			System.out.print(a+" ");
		
		
		int arr2[] = {4,5,33,5,6,33,75,22,66,33,8,9,9,533,222,444};
		
		int last = arr2[arr2.length-1];
		int cnt = arr2[arr2.length-1];
		
		
		while(last > arr2[cnt])
		{
			
			
		}
		
		
	}

}
