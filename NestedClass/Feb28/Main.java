package Feb28;

class OuterClass {
	int x = 10;

	static class InnerClass { // it can be private, protected or static
		int y = 5;

	}
}

public class Main {
	public static void main(String[] args) {
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		System.out.println(myInner.y);
	}
}

/*
 * 
 * Unlike a "regular" class, an inner class can be private or protected. and
 * static If you don't want outside objects to access the inner class, declare
 * the class as private:
 * 
 * 
 */