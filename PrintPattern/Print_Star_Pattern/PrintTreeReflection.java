package Print_Star_Pattern;

public class PrintTreeReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int space=9;
		
		for(int i=1; i<=20; i+=2)
		{
			
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				
				System.out.print("*");
				System.out.println();
				space--;
				
		}
		
		
		
		space=8;
		
		for(int i=1; i<=4; i++)
		{
			
			if(i==4)
			{
				System.out.println("---------------------");
				break;	
			}
			
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
				for(int j=1; j<=4; j++)
				System.out.print("*");
				
				System.out.println();
				
				
		}
		
		for(int i=1; i<=3; i++)
		{
			if(i==1)
			{
				System.out.println("--------------------- \n");
			}
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
				for(int j=1; j<=4; j++)
				System.out.print("*");
				System.out.println();
				
				
		}
		
		
		space=0;
		
		for(int i=20; i>=1; i-=2)
		{
			
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
				for(int j=1; j<i; j++)
				
				System.out.print("*");
				System.out.println();
				space++;
				
		}
	}

}

/*
	str1 = "";
		String str2 = "";
		String str3="";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			str1 = str1 + str.charAt(i);
			//System.out.println(str1);
		}
		
		for(int i=0; i<str1.length(); i++)
		   { 
				if (i % 2 == 0 && i > 2)
				{
					str2 = str1.substring(0,i);
					//System.out.println(str2);
				}
					
					 int strSum=0; 
					  for (int j=0; j<str2.length(); j++)
					   {
						   //System.out.println(str1.charAt(j)); 
						   strSum=(strSum+str2.charAt(j)-'0');
					   }
					  
					  int divSum=0;
					  for(int j=0; j<str2.length()/2; j++) 
					  {
						  divSum=(divSum+str2.charAt(j)-'0');
					  } 
					  
					  int total=divSum*2;
					  
					  // System.out.println(total);
					  
					  
					  if(total>0 && total==strSum)
					   {
							for (int k = 0; k < str2.length(); k++)
							 str3=str3+str2.charAt(k);
							
						//	System.out.println(str3);
							
							System.out.println(" String is: "+str2+" has equal sum of half is: "+total);
					   }
					  

				}
 */


/* 
		 *																		         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
        ****
        ****
        ****
---------------------
--------------------- 

        ****
        ****
        ****
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
         

*/							