package Method_Overloading;

public class ParameterVariable {

		 // Variable parameter has to be the last parameter in parameter list
		// multiple Variable paramters are not allowed
			
			
			/**
			 * findmax  method returns max of 2 parameters - int, int array
			 * @param t
			 * @param a
			 * @return int
			 */
			
			public static int findMax(int t, int... a)
			{
				int m = t;
				for(int x=0;x<a.length;x++)
				{
					if (a[x] > m)   //  650>100
						m = a[x];
				}
				return m;
			}
			
			
			public static int findMax(String str, char ch,int... a)
			{
				System.out.println(str + "  ch = " + ch);
				int m = a[0];
				for(int x=1;x<a.length;x++)
				{
					if (a[x] > m)
						m = a[x];
				}
				return m;
			}
			
		public static void main(String[] args) {
			
//			System.out.println(findMax(10,20,1,4,5,2));
//			System.out.println(findMax(100,20,1,4,5,2));
     		System.out.println(findMax("cyber",'A', 100,20,1,4,5,2,45,23,7,650,2,1000));
			
			System.out.println(findMax(100,20,1,4,5,2,45,23,7,650,2));
			
			
			
			
		}

}
