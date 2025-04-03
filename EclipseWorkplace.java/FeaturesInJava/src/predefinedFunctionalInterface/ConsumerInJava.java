package predefinedFunctionalInterface;

import java.util.function.*;

public class ConsumerInJava {

	public static void main(String[] args) {
		/*
		 * Consumer:
		 * 
		 * it will consumes the value but wont return anything
		 */
		Consumer<String> c = s-> System.out.println(s);
		c.accept("Hello World");
	}

}
