package Day_Dec10;

public class FindArmstrongNumber {

	public static void main(String[] args) {
	
		int cnt = 0, n=2,noToGenerate=10;
		
		
		while(cnt <= noToGenerate)
		{
			int no = n++;
			int lenOfANo = String.valueOf(no).length();	
			//System.out.println(lenOfANo);
			int r = 0, sum = 0;
			int orgNo = no;
			while( no > 0)
			{
				r = no % 10;    
				
				int power = (int) Math.pow(r, lenOfANo);
				sum = sum + power;
				no = no / 10;
			}
			
			if (orgNo == sum)
			{
				System.out.println(orgNo + " is a Armstrong number");
				cnt++;
			}
		}
	}

}




//Generate n Armstrong Number -

/*  

O/P -

153 is a Armstrong number
370 is a Armstrong number
371 is a Armstrong number
407 is a Armstrong number
1634 is a Armstrong number
8208 is a Armstrong number
9474 is a Armstrong number
54748 is a Armstrong number
92727 is a Armstrong number
93084 is a Armstrong number
548834 is a Armstrong number

*/