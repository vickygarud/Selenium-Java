package Logical_Codes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fNo=0;
		int sNo=1;
		int add=0;
		for(int i=0; i<=10; i++)
		{
			System.out.print(fNo+" ");
			
			add=fNo+sNo;  // 0+1=1
			fNo=sNo;      // fNo=1
			sNo=add;      // sNo=1
		}

	}

}


/*   


// O/P -  0 1 1 2 3 5 8 13 21 34 55 


0  fNo  |  
1  sNo  | fNo=sNo
1  add= fNo+sNo  |  fNo
2		|  sNo
3
5
8
13
21
*/