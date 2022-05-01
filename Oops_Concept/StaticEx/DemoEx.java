package StaticEx;

class Sample
{
	int a = 200;
	
	void m1(DemoEx d)
	{
		System.out.println(d.b);
	}
}

public class DemoEx {
	float b = 10.0f;
	
	static void m2(Sample s)
	{
		System.out.println(s.a);
	}
	public static void main(String[] args) {
		
		Sample ob = new Sample();
		m2(ob);
		
		DemoEx ob1 = new DemoEx();
		ob.m1(ob1);
		
	}

}
