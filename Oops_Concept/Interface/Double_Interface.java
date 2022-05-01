package Interface;

interface outer		// outer interface
{
	
	interface inner    // inner interface
	{
		void m1();
	}
}

class OuterInnter implements outer.inner		// to access inner interface we need to use access (.) operator
{

	@Override
	public void m1() {
		
	}
	
	
}
public class Double_Interface {
	public static void main(String[] args) {
		
	}

}
