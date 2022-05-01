package Method_Overloading;

import java.util.Scanner;

public class MarksGradeUsingFunctions
{
	
	static public void getMarks(int i, int j, int k)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Math Marks: ");
		i = sc.nextInt();
		
		System.out.println("Enter English Marks: ");
		j = sc.nextInt();
		
		System.out.println("Enter Chemistry Marks: ");
		k = sc.nextInt();
		
		avgMarks(i,j,k);
		sc.close();
		
		
	}
	
	static public void avgMarks(int i, int j, int k)
	{
		
		float sum=i+j+k;
		//System.out.println(sum);
		
		float avg=(sum/300)*100;
		
		//System.out.println(avg);
		
		getResult(avg);
		
	}
	
	static public void getResult(float avg)
	{
		System.out.println(avg);
		
		if(avg>=75 && avg<=100)
				System.out.println("Passed in DITINCTION : " + avg); 
			else if (avg >= 60 && avg <= 74)
				System.out.println("Passed in FIRST CLASS : " + avg); 
			else if (avg >= 50 && avg <= 59)
				System.out.println("Passed in SECOND CLASS : " + avg);
			else
				System.out.println( "FAILED !!!! : " + avg+"\n");
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) 
	{
		getMarks(0,0,0);
	}


}
