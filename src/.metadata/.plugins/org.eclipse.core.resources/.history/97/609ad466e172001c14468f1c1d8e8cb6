package TCS;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner8;

public class TcsExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		
		int arr[] = new int[no+1];  // 0 1 2 3 4
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=i+1;	// 1,2,3,
		}
		
		int cnt=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					continue;
				if((arr[i]+arr[j])==no)
				{
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}
}


/*

1+1=2
2=2

3 step

1+1+1=3  
1+2=3
2+1=3
3=3
total=4

4

4+3+2+1=10

1+1+1+1=4
2+2=4
1+2+1=4
3+1=4
1+3=4
2+1+1=4
1+1+2=4
4=4

total=9

*/