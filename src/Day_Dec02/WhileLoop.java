package Day_Dec02;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		int cnt = 10;
		while (cnt >= 1)
		{
			System.out.println(cnt);
			cnt= cnt-1;
		}
		System.out.println("Out of loop: " + cnt);
		
		
	/*	// 1 3 5 7 9
		int cnt = 1;
		while(cnt<=9)
		{
			System.out.println(cnt);
			cnt = cnt + 2;
		}
	*/
		/*
		int cnt = 2;
		while(cnt<=10)
		{
			System.out.println(cnt);
			cnt += 3;   // cnt = cnt + 1
		}
		// 2 5 8
		 
		 */
	/*
		+= : eg: cnt +=10;  cnt = cnt + 10;
		-= : eg: cnt -=4;  cnt = cnt - 4;
		*= : eg: cnt *=5;  cnt = cnt * 5;
		/= : eg: cnt /=10;  cnt = cnt / 10;
		%= : eg: cnt %=2;  cnt = cnt % 2;
	*/	
		/*
		int no = 4;
		while(no <= 40)
		{
			System.out.println(no);
			no = no + 4;
		}
		*/
		/*
		int no = 9;
		int cnt = 1;
		while(cnt<=10)
		{
			int result = no * cnt;
			System.out.println(no + " * " + cnt + " = " + result);
			cnt +=1;
		} 
		*/
		// reverse table of 9
		/*int no = 9;
		int cnt = 10;
		while(cnt>=1)
		{
			int result = no * cnt;
			System.out.println(no + " * " + cnt + " = " + result);
			cnt -=1; */
		} 
	}


