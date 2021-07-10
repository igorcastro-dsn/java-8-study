package java8.functions.function;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {

	public static List<Long> toLongs(List<String> values) {
		return values.stream()
					 .map(Long::valueOf)
					 .collect(Collectors.toList());
	}
}
