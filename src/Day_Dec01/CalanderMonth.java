package Day_Dec01;

public class CalanderMonth {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int month=13;
		
		if(month > 12)
			month = month % 2;
		
		if (month==0)
		{
			month = 12;
		}
		switch (month)
		{
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		case 5:
			System.out.println("Month is May");
			break;
		case 6:
			System.out.println("Month is Jun");
			break;	
		case 7:
			System.out.println("Month is July");
			break;
		case 8:
			System.out.println("Month is August");
			break;
		case 9:
			System.out.println("Month is September");
			break;
		case 10:
			System.out.println("Month is October");
			break;
		case 11:
			System.out.println("Month is November");
			break;
		case 12:
			System.out.println("Month is December");
			break;
			
			default:
				System.out.println("Invalid Input..!!");
		}

	}

}
