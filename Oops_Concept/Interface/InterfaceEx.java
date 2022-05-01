package Interface;

interface first
{
	int a=100;		// by default it is public static final int a;
	void m1();		//by default it is public abstract void m1();
}

interface two
{
	void m1(int a);
}
public class InterfaceEx implements first,two {
	
	public void m1(int c)
	{
		System.out.println("Inside m1: "+c);
	}
	
	@Override
	public void m1()
	{
		System.out.println("Overide method");	
	}
	public static void main(String[] args) {
		
		InterfaceEx ob = new InterfaceEx();
		ob.m1();
		ob.m1(a);
		
		first ob1 = new InterfaceEx ();
		ob1.m1();
		
		
	}
}


