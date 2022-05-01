package Print_Number_Pattern;

public class WhileCompositionCondition {
	
	public static void main(String[] args) {
		

	int i =1;
	int j = 100;
	while(i<=10 || j<=500)
	{
		System.out.println(i + " " + j);
		i = i + 1;
		j = j + 100;
	}
}
}


/*
1 100
2 200
3 300
4 400
5 500
6 600
7 700
8 800
9 900
10 1000

*/