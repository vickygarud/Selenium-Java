package Assignment;

public class SubString {
	public static void main(String[] args) {
		
		String FileName = "Document.xls";		
	//	String FileName = "Document.xlsx";
		
		String str = FileName.substring(FileName.indexOf('.'));
		
		System.out.println(str.equals(".xls") ? "Class name: HSSF": 
							str.equals(".xlsx") ? "Class name: XSSF" : "invalid Extencion");
		
		/*
		  if(str.equals(".xls"))
			  System.out.println("HSSF");
		  
		  else if(str.equals(".xlsx"))
		  System.out.println("XSSF");
		  */
		
		System.out.println("*****************");
		  
		
		String str3 = "hello";
		
		String str4 = new String("hello");
		
		String str5="hello";
		
		String str10= str3.concat(str4);
		
		System.out.println(str10);
		
		System.out.println(str3);
		
			System.out.println(str3==str4);	// false
			
			System.out.println(str5==str3);	//	true
			
			System.out.println(str5.equals(str3));
			
			
		  
		 
				
			
		
		
		

		
		
		
	}
}
