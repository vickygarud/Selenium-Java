package Method_Overloading;

	public class FunctionOverloading {

		public static String add2Nos(int a, int b, String str)
		{
			System.out.println("inside String function int+int+string: "+ str);
		
//			return a+b+str;
//			return a+str+b;
			// 13 Cyber
			//return (a+b) + " "+str; 
		
			//return str + " "+ (a+b);
			 return  (a+str)+b;
			
		}
		public static int add2Nos(int a, int b, int c)
		{
			System.out.println("inside int function int+int+int");

			return a+b+c;
		}
		
		public static int add2Nos(int a, int b)
		{
			System.out.println("inside int function int+int");
			return a+b;
		}
		
		public static float add2Nos(float a, float b)
		{
			System.out.println("inside float function float+float");
			return a+b;
		} 

		public static float add2Nos(float a, int b)
		{
			System.out.println("inside float function flaot+int");
			return a+b;
		} 
		
		public static float add2Nos(int a, float b)
		{
			System.out.println("inside float function int+float");
			return a+b;
		} 
	/*	
	// not overloading - return type change	
		public static double add2Nos(int a, float b)
		{
			System.out.println("inside float function int+float");
			return a+b;
		} 
	*/
		
		public static String add2Nos(int a, float c, String s)
		{
			return s+a+c;
		}
		
		
	public static void main(String[] args) {
		System.out.println("Addition : " + add2Nos(10,30,44));
		System.out.println("Addition : " + add2Nos(10,3));
		
		System.out.println("Addition : " + add2Nos(10,3,"Cyber"));
		System.out.println("Addition float: " + add2Nos(100f,300f));
		
		System.out.println("Addition float: " + add2Nos(100f,300));
		System.out.println("Addition float: " + add2Nos(100,300f));	
		
		// data type
		// no of parameters
		// sequence (parameter data type) of parameter
		
		
	//	String a = add2Nos(12, 12f, "Success");
		System.out.println("a = " +add2Nos(12, 12f, "Success"));
		
		
		
		
		
		
		
	}
	}


