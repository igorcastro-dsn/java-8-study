package java8.functions.predicate;

import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {
		Predicate<Integer> isOdd = value -> value % 2 == 0;
		Predicate<Integer> isEven = value -> value % 2 == 1;
				
		System.out.println(isOdd.test(10));
		System.out.println(isOdd.test(29));
		
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(29));
	}
	
}
