package Java_HashCode;

import java.util.Arrays;

public class planet { 
	
	public static void main(String[] args) {
		
		
		
		planet obj = new planet();
		
		System.out.println(obj); /// obj.toString
		System.out.println(System.identityHashCode(obj));
		
		String st = "Hello";
		System.out.println(st);
		
		
		 String str1 = "FB";
		 String str2 = "Ea";
		 System.out.println(str1.hashCode()+"--- "+str2.hashCode());
		 
		 String str3 = "HZ"; 
		 String str4 = "Gy";
		 
		 System.out.println(str3.hashCode()+"--- "+str4.hashCode());
		 
		 
		
		
		/*
		  Sun ob = new Sun(10,"Moon");
		  System.out.println("Object hashCode: "+ob.hashCode());
		  System.out.println("name hashCode: "+System.identityHashCode(ob.name));
		  System.out.println("Object hashCode: "+System.identityHashCode(ob));
		  
		  Sun ob1 = new Sun(20,"Earth"); System.out.println(ob1.hashCode());
		  
		  System.out.println(System.identityHashCode(ob.no));
		  System.out.println(System.identityHashCode(ob1.name));
		  
		  String str1 = "FB"; String str2 = "Ea"; System.out.println(str1);
		  
		  int [] a = {00}; int arr[] = new int[2];
		  
		  // boolean arc[]={true,false,false}; Arrays.sort(arr);
		  System.out.println(a.hashCode());
		  
		  
		  System.out.println(str1.hashCode()+"   "+str2.hashCode());
		  
		 
		  
		  System.out.println(str3.hashCode()+"   "+str4.hashCode());
		  System.out.println(System.identityHashCode(str3)+"   "+str4.hashCode()+" "
		  +System.identityHashCode(str4));*/
		 
		   	
	}

}
