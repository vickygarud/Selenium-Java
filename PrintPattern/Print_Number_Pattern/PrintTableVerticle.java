package Print_Number_Pattern;

public class PrintTableVerticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=2; int row=1;
		
		while(row<=10)
		{
			i=2;
			while(i<=10)
			{
				System.out.print(String.format("%4d",(i*row)));
				i++;
			}
			System.out.println();
			row++;
		}
		

	}

}

//String.format("%4d", no)

/*
   2   3   4   5   6   7   8   9  10
   4   6   8  10  12  14  16  18  20
   6   9  12  15  18  21  24  27  30
   8  12  16  20  24  28  32  36  40
  10  15  20  25  30  35  40  45  50
  12  18  24  30  36  42  48  54  60
  14  21  28  35  42  49  56  63  70
  16  24  32  40  48  56  64  72  80
  18  27  36  45  54  63  72  81  90
  20  30  40  50  60  70  80  90 100


*/
