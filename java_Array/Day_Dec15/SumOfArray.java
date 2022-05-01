package Day_Dec15;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		int  arr[] = new int[] {5,3,6,8,4};
		/*
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];  //1 + 2
		} */
		/*
		int sum =  0;
		for(int x : arr)
		{
			sum = sum + x;
		} */
		
		// multiplication
		/*int sum=1;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum * arr[i];  
		} */
		int sum = 1;
		for(int x:arr)
		{
			sum = sum * x;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("sum of all elements :" + sum);
	}

}
