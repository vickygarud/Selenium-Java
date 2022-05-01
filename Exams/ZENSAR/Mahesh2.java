package ZENSAR;

import java.util.Scanner;

public class Mahesh2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuffer s = new StringBuffer("1000");

		System.out.println(s.length());
		String x ="5";
		char c = x.charAt(0);
		System.out.println(c);
		System.out.println( Character.getNumericValue(c)+5);
		
		StringBuffer sb = new StringBuffer("1000");
		

		int temp;
		for (int i = 0; i < s.length(); i++) {
			sb.insert(i, Character.getNumericValue(s.charAt(i)) + 7 % 10 );
			
			//System.out.println(sb);
		}
		
		System.out.println("hhh "+sb);

		sc.close();

	}
}

/*
 * I/P -1000 O/p -7787
 * 
 */
