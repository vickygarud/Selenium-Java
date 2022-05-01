package Day_Dec07;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i<=10)
		{
			if (i == 5)
			{
				i+=1;
				continue;   //Java continue statement stops one iteration in a loop and continues to the next iteration. This statement lets you skip particular 
							//iterations without stopping a loop entirely. Continue statements work in for and while loops. ... Java for and while loops automate and repeat tasks
			}
			System.out.print(i + " ");  
			i+=1;
		}
		System.out.println("\nout of loop: "+ i); 

	}

}


//op 1 2 3 4 6 7 8 9 10 
//out of loop: 11

