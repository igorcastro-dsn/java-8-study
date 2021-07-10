package java8.functions.supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierApp {

	public static void main(String[] args) {
		Supplier<Integer> defaultt = () -> 42;
		Optional<Integer> emptyValue = Optional.empty();
		Integer result = emptyValue.orElseGet(defaultt);
		System.out.println(result);
	}
	
}
