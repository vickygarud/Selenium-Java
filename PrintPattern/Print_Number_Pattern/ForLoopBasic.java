package Print_Number_Pattern;

public class ForLoopBasic {

	public static void main(String[] args) {
		
		/*int i;
		for(i = 1; i<=5;i+=1)
		{
			System.out.print(i + " ");
		}
		*/
		
		/*
		//1 3 5 7 9
		for(int i=1;i<=10;i+=2) /// i is local to for loop only
			System.out.print(i + " ");
		
		// System.out.println(i);
		*/
	/*	
		// print 5 4 3 2 1
		for(int i =5; i>=1; i-=1)
			System.out.print(i+ " ");
	*/
		/*
		//print 10 8 6 4 2 0
		for(int i=10;i>=0;i-=2)
			System.out.print(i + " ");
		*/
		
		
	/*	
		for(int i=0;i<=10;i+=1)
		{
			if ( i==5 || i==8)
				continue;
			System.out.print(i + " ");
		}
	*/
		
		/*
		// break
		
		int j = 7;
		for(int i=0; i<=10;i+=1)
		{
			if (i == j)
				break;
			System.out.print(i + " ");
//			if (i = j)  // 	// Type mismatch: cannot convert from int to boolean
			
		}
	*/
		/*
		//print even no
		for(int i = 0;i<=10;i+=1)
		{
			if (   (i % 2)  ==  0)
				System.out.println(i);
		}
		*/
		/*
		 * //print odd no
				for(int i = 0;i<=10;i+=1)
				{
					if (   (i % 2)  ==  1)
						System.out.println(i);
				}
		*/
		/*
		//print odd no
				for(int i = 0;i<=10;i+=1)
				{
					if (   (i % 2) != 0)  // == 1
						System.out.println("No is even " + i);
				}
		*/
		/*
		//print odd no
		for(int i=1;i<=10;i+=2)
			System.out.println(i);
		System.out.println("********");
*/
		/*
		// 50 51 52 53 54 55 56 57 58 59 60
		for(int i=50;i<=60;i+=1)
			System.out.print(i + " ");
		*/
		/*
		// 60 59 58 57 56 55 54 53 52 51 50
		for(int i=60; i>49;i-=1)
			System.out.print(i + " ");
		*/
	/*	
		 * 1 10
		 * 1 20
		 * 2 10
		 * 2 20
		 * 3 10
		 * 3 20
		for(int i=1;i<=3;i+=1)
		{
			for(int j=10;j<=20;j+=10)
				System.out.println(i + "  ==> " + j);
		}
	*/
	/*
	 * 1 => 10
	 * 1 => 20
		for(int i=1;i<=3;i+=1)  // outer for loop
		{
			for(int j=10;j<=20;j+=10)  // inner for loop
				System.out.println(i + "  ==> " + j);  // for loop body 
				break;
		}
	*/	
	/*	
// nested for loop
		for(int i=1;i<=3;i+=1)  // outer for loop
		{
			for(int j=10;j<=20;j+=10)  // inner for loop
			{
				System.out.println(i + "  ==> " + j);  // for loop body 
				break;
			}
		}
	*/
		for(int i=1; i<=3;i+=1)
		{
			int j=10;
			while(j<=12)
			{
				System.out.println(i + " ==> " + j);
				j+=1;
			}
		}
		

	}

}
