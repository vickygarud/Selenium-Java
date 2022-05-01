package EPAM;

import java.util.stream.Stream;

public class QO_Box {

	public static void main(String[] args) {
		
		String str = "Hellow this is my first program ";
		
	//	Stream.of(str).spliterator().trySplit().forEachRemaining(s -> System.out.println(s));
		Stream<String> stream = Stream.of(str.split(" ")); 
		stream.forEach(System.out::println);
		stream.forEach(s-> System.out.println(s.charAt(0)));
	}
}
