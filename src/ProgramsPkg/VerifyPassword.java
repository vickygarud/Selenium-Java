package ProgramsPkg;

public class VerifyPassword {

	public static void main(String[] args) {
		
		String pass="Password@101";
	    boolean flag=true;
	    
	    // for length 8 minimum and 18 maximum
		
		if(!((pass.length()>=8) && (pass.length()<=18)))   //    ! False
		{
			flag=false;
		}
		
		if(pass.contains(" "))
		{
			flag=false;
		}
		
	// for 0 to 9 numbers
		
		int cnt=0;
		for(int i=0; i<=9; i++)
		{
			 String str1 = Integer.toString(i);
			 
			 if(pass.contains(str1))
			 {
				 cnt++;
			 }
		}
		
		if(cnt==0)
		{
			flag=false;
		}
		
		// for special characters (~!@#$%^&*()-+:<>?/|.,)
		
		
		String spChar="~!@#$%^&*()-+:<>?/|.,";
		String str1="";
		cnt=0;
		for(int i=0; i<spChar.length(); i++)
		{
			spChar.charAt(i);
			str1=str1+spChar.charAt(i);
			//System.out.print(st);
			if(pass.contains(str1))
			{
				cnt++;
			}
			str1="";
		}
		
		if(cnt==0)
		{
			flag=false;
		}

		
		// for capital letters  65 = A,66 = B, 67 = C....89 = Y, 90 = Z
		
		String str2="";
		cnt=0;
		 for (char i = 65; i <= 90; i++)  
		 { 
			 str2=str2+i;
             if (pass.contains(str2)) 
             { 
               cnt++;  
             } 
             str2="";
         } 
		 
		 if(cnt==0)
		 {
			 flag=false;
		 }
		
		// for small letters    97 = a, 98 = b, 99 = c.... 121 = y, 122 = z
		 
			String str3=""; 
			cnt=0;
			 for (char i= 97; i <= 122; i++)
			 { 
				 str3=str3+i;
	             if (pass.contains(str3)) 
	             { 
	               cnt++;
	             } 
	             str3="";
	         } 
			 
			 if(cnt==0)
			 {
				 flag=false;
			 }
			 
			 if(flag==true)
				 System.out.println(pass+" -- Password is valid");
			 else
				 System.out.println(pass+" -- Password is invalid insufficient..!");
	}

}



/*     

O/P - Password@101 -- Password is valid


Validate password with below constraints 
- should have min 8 characters
- should have min 1 lower case letter
- should have min 1 upper case letter
- Can have $ or _ 
- should not start with number but upper case

*/