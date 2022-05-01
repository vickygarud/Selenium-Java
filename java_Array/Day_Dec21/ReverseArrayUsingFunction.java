package Day_Dec21;

public class ReverseArrayUsingFunction
{
	public static int[] copyArray(int[] a)
	{
		int[] c = new int[a.length];
		int j = 0;
		for (int i = (a.length-1); i >= 0; i--) 
			c[j++] = a[i];           // c[] =  40 30 20 10
		return c;
	}
// OVerloading of a method 
// same function name with different signature
// signature: 
//     no of parameters passed
//     sequence of parameters
//     data type passed
	public static int[] copyArray(int[] a,  int[] b)
	{
		int j = 0;
		for (int i = (a.length-1); i >= 0; i--) 
			b[j++] = a[i];
		
		return b;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + "  ");
		
	}

	public static void main(String[] args) 
	{
			int[] a = { 10, 20, 30, 40 };
			int[] b = new int[a.length];
			b = copyArray(a);  
			printArray(b);    //b[]=c[]
			System.out.println();
			b = copyArray(a,b);
			printArray(b);
			
			 
			
	}
		
		

 }


