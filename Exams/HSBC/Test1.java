package HSBC;

public class Test1 {
	
	static int[] m1(int a)
	{
		int j =0;
		int arr[] = new int[10];
		
		for(int i=1; i<=a; i++)
		{
			if(a % i == 0)
			{
				arr[j++] = i;
			}
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] a=m1(10);
		
		for(int res: a)
		{
			System.out.println(res);
		}
	}
}
