package ZENSAR;

public class Test {

	public static void main(String[] args) {

		int arr[] = {4,4,5,5,6,7,7,7,4,5,2,2};

		for(int i=0; i<arr.length; i++)
		{
			int cnt=0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
				}

			}
			if(cnt==1)
			{
				System.out.print(arr[i]);
			}
			
		}
		
	}

}


// 4,4,5,5,6,7,7,7,4,5,2,2
// 6