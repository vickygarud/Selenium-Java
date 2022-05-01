package Method_Overloading;

public class FunctionWithinFunction {

	public static void f1()
	{
		System.out.println("inside function f1");
		f2();
		System.out.println("End of f1");
	}
	public static void f2()
	{
		System.out.println("inside function f2");
		f3();
		System.out.println("End of f2");
	}
	public static void f3()
	{
		System.out.println("inside function f3");
		f4();
		f5();
		System.out.println("End of f3");
	}
	public static void f4()
	{
		System.out.println("inside function f4");
	}
	public static void f5()
	{
		System.out.println("inside function f5");
	}


	
	
	public static void main(String[] args) {
		System.out.println("Program started ");
		f1();
		System.out.println("Program is over");
	}
}