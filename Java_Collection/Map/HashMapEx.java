package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx {

	static void countChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char i : ch) {
			if (!String.valueOf(i).isBlank()) { // to remove space count
				if (map.containsKey(i)) {
					map.put(i, map.get(i) + 1);
				} else
					map.put(i, 1);
			}
		}
		map.entrySet().forEach(s -> System.out.print(s + " "));
		System.out.println(str);

	}

	static void m1(String str) {
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		List a = Arrays.asList(str);
		
		System.out.println(a);

//		a.forEach(s -> {
//			if (map.containsKey(s)) {
//		
//				map.put(s, map.get(s) + 1);
//			} else
//				map.put(s, 1);
//
//		});	
		
		System.out.println("** "+str + ":" + map);
	}

	static void countLetters(String str) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!String.valueOf(str.charAt(i)).isBlank()) {
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				} else
					map.put(str.charAt(i), 1);
			}

		}
		System.out.println(str + ":" + map);
	}

	public static void main(String[] args) {

		countChar("Hello");
		countChar("Test");
		countChar("ttAAxxw ");
		countLetters("heeeoo");
		countLetters("xhhhbsss");
		countChar("heeeoo");
		
		
		m1("Hello");

	}

}

/*
 * 
 * static void countWords(String str) {
 * 
 * List<String> myList = new ArrayList<String>(Arrays.asList(str.split("")));
 * 
 * Map<Character, Integer> map = new HashMap<>();
 * 
 * //myList.stream().forEach(s-> map.containsKey(s) ? map.put(s, map.get(s)+1) :
 * map.put(s, 1));
 * 
 * System.out.println(myList);
 * 
 * }
 * 
 */