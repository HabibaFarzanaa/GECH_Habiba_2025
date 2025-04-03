package predefinedFunctionalInterface;

import java.util.function.*;

public class PredicateInJava {

	public static void main(String[] args) {
		/*
		 * Predicate:
		 * It will holds a condition
		 * 
		 */
		// I need to find the number is even or odd
		
		Predicate<Integer> p = a-> a%2 == 0;
		System.out.println(p.test(21));
	}

}
