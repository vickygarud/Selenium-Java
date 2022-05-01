package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortObject {

	static void m1(int n, List<String> r, List<Integer> f) {

	}

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> arraylist = new ArrayList();
		arraylist.add(33);
		arraylist.add(9494);
		arraylist.add(777);
		arraylist.add(787);
		

for (int i = 0; i < arraylist.size(); i++) {

    for (int j = arraylist.size() - 1; j > i; j--) {
        if (arraylist.get(i) > arraylist.get(j)) {

            int tmp = arraylist.get(i);          
            arraylist.set(i,arraylist.get(j));
            arraylist.set(j,tmp);
            
         //   String world = new StringBuilder(arraylist.get(i)).reverse().toString());

        }

    }
}
		
		System.out.println(arraylist);
		
		
		ArrayList<Integer> al1 = new ArrayList();
		
		Collections.sort(al1);
		//al1.size()

		al1.add(9);
		al1.add(29);
		al1.add(52);
		al1.add(61);
		
	//	m1(4,al, al1);
		
		
		String str[][] ;
		
		
	
	}

}
