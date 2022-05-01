package Print_Star_Pattern;

public class PrintPattern {

	public static void main(String[] args) {
		
		int cnt=1;
		int j;
		
		while(cnt<=5)
		{

			for(j=1; j<=5; j++)	
				System.out.print("#");
			
			System.out.println();
			
			if(j==6)
			{
				System.out.println(" #");
			}
				
			cnt++;
		}
		
	}
}



/* 
#####
 #
#####
 #
#####
 #
#####
 #
#####
 #


*/