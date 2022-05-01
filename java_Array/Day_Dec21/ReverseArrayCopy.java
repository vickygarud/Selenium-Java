package Day_Dec21;

public class ReverseArrayCopy
{
	public static void main(String[] args)
	{
		int[] a = { 10, 20, 30, 40 };
		int[] b = new int[a.length];

		int j = 0;
		for (int i = (a.length-1); i >= 0; i--)
		{
			
			b[j] = a[i];
			System.out.print(b[j]+" ");
			j++;
		
		}
		
		 // for(int i=0;i<b.length;i++)
		//	System.out.print(b[i] + "  ");
	}
}
