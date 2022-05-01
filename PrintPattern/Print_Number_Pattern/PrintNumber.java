package Print_Number_Pattern;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =1;
		while(no <=40)
		{
			System.out.print(String.format("%4d", no)); // - left justified
			if (no % 5 == 0)
				System.out.println();
			no+=1;
		}

	}

}

/*

1   2   3   4   5
6   7   8   9  10
11  12  13  14  15
16  17  18  19  20
21  22  23  24  25
26  27  28  29  30
31  32  33  34  35
36  37  38  39  40

*/