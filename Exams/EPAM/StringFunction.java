package EPAM;

import java.util.Arrays;

public class StringFunction {

	public static void main(String[] args) {

		String x = "zkb";
		String y = "kbz";
		boolean flag = true;

		char arr[] = x.toCharArray();
		char arr2[] = y.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr2);

			if (x.length() == y.length()) 
			{
				for (int i = 0; i < arr.length; i++) 
				{
					if(arr[i]!=arr2[i])
					{
						flag = false;
					}
				}	
				if(flag==true)
					System.out.println("yes");
				else
					System.out.println("no");

			} else
				System.out.println("no");
	}
}
