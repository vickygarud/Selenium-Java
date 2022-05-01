package Logical_Codes;

import java.util.Scanner;

public class GenerateArmstrong {
	
	static void armstrongNuber(int min,int max)
	{
		
		for(int i=min; min<=max; min++)
		{
			int temp = min;
			
			int len = Integer.toString(min).length();
			int sum = 0;
			
			while(temp != 0)
			{
				int r = temp % 10;
				sum = sum + (int)Math.pow(r, len);
				temp/=10;	
			}
			
			if(sum == min)
			{
				System.out.println(min+" Is Armstrong Number ");
			}
			/*
			 * else System.out.println(min+" Is Not Armstrong Number ");
			 */
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter min length: ");
		int min = sc.nextInt();
				
		System.out.println("Enter max length: ");
		int max = sc.nextInt();
		
		/*
		 * System.out.println("How many numbers to generate: "); int gen = sc.nextInt();
		 */
		
		armstrongNuber(min,max);
		
		sc.close();
		
		
		
	}

}
