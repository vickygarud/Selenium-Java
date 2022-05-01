package Feb28;

class OuterOne {
	
	static OuterOne ob = new OuterOne();

	class InnerOne {
		
		static InnerOne io = ob.new InnerOne();
		
		
		class InnerTwo {
			
			static InnerTwo it = io.new InnerTwo();
			
			class InnerThree {
				public static void main(String[] args) {

					InnerThree ob = it.new InnerThree();

				}
			}
		}
	}
}

class NesteddClaases {

	public static void main(String[] args) {

		OuterOne ob = new OuterOne();

	}
}