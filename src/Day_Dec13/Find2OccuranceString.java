package Day_Dec13;

public class Find2OccuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
			String str = "google oath";
			//str = "Want to join MS";
		//	System.out.println("len :" + str.length());
			int counter = 0;
			boolean flag = false;
			
			for(int i=0; i<str.length(); i++)   // 0 1 2 3   length-1  10
			{
				char ch = str.charAt(i);
				if (ch == 'o')
				{
					flag = true;
					counter = counter + 1;  // 2
					if ( counter == 3)
					{
						System.out.println("char found at index : " + i);
						break;
					}
				}
			//	System.out.println("i : " + i);
			}
			System.out.println("flag : " + flag);
			System.out.println("counter :" +counter);
//			if (flag == false)
			if (counter == 0)
				System.out.println("character z not found in the given string !");
			
			
			
			
			
			
			
			
			
			
			

	}

}
