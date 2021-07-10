package java8.functions.consumer;

import java.util.function.Consumer;

public class ConsumerApp {

	public static void main(String[] args) {
		Consumer<String> addPrefix = s -> System.out.println("[Prefix] " + s);
		Consumer<String> addSufix= s -> System.out.println(s + " [Sufix] ");
		
		String s = "foobar";
		addPrefix.andThen(addSufix).accept(s);
	}
	
}
