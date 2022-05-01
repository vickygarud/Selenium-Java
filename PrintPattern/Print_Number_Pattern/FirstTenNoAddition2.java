package Print_Number_Pattern;

public class FirstTenNoAddition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int sum=0;
		
		while(i<=10)
		{
			if(i==1)
				System.out.print("Addition: ");
			
			
			System.out.print(i);
			if (i<10)
			{
				System.out.print(" + ");
			}
			
				sum= sum+i;  // 0+1=1 , 1+2 =3 , 3+3=6, 6+4=10, 5+10=15
				i++;
		}
		System.out.println(" = "+sum);
	}

}
// O/P - Addition: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
