package java8.functions.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionApp {

	public static void main(String[] args) {
		Function<String, Integer> toNumber = Integer::parseInt;
		Function<Integer, String> toString = String::valueOf;
		
		Integer integer = toNumber.apply("93");
		System.out.println(toNumber.apply("93"));
		
		String string = toString.apply(integer);
		System.out.println(string);
			
		Function<Integer, Integer> square = Calculator::square;
		Integer squareResult = square.apply(2);
		System.out.println(squareResult);
		
		Function<List<String>, List<Long>> toLongs = ListUtils::toLongs;
		List<String> strings = Arrays.asList("1", "2", "4", "9", "3");
		System.out.println(toLongs.apply(strings));
	}
	
}
