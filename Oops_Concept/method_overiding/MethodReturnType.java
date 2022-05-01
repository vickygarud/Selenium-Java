package method_overiding;

class BaseClass
{
	 BaseClass m1()
	{
		System.out.println("Parent class");
		return new BaseClass();
	}
}

public class MethodReturnType extends BaseClass{
	
	 MethodReturnType m1()
	{
		System.out.println("child class");
		
		return new MethodReturnType();
		
	}
	
	
	public static void main(String[] args) {
		
		MethodReturnType ob = new MethodReturnType();
		
		System.out.println(ob.m1());
		
		

	}

}
