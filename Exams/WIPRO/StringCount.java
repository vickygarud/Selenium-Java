package WIPRO;

import java.util.HashMap;
import java.util.Iterator;

public class StringCount {

	public static void main(String[] args) {
		
		String str = "cat batman latt matter cat matter cat cat latt latt";
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String str2[] = str.split(" ");
		
		for(String temp: str2)
		{
			if(hm.get(temp) != null)
			{
				hm.put(temp, hm.get(temp)+1);
			}
			else
			hm.put(temp, 1);
		}
		
		Iterator<String> temp =  hm.keySet().iterator();
		
		while(temp.hasNext())
		{
			String str4 = temp.next();
			
			if(hm.get(str4) > 2)
			{
				System.out.println(str4+"  occured "+hm.get(str4));
			}
		}
		
		System.out.println(hm);
		
		/*
		 * for(String a:str2)
		 *  System.out.println(a);
		 */
		
		for(int i=0; i<str2.length-1; i++)
		{
			if(str2[i].equalsIgnoreCase(str2[++i]))
			{
				System.out.print(str2[i]+" ");
			}
			
		}
		

	}

}

/*

I/P -
"cat batman latt matter cat matter cat cat latt latt";

o/p-
cat latt 

*/