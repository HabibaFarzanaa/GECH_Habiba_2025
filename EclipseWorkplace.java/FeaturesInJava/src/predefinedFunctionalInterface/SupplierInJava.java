package predefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInJava {
public static void main(String[] args) {
	/*
	 * Supplier
	 * 
	 * It wont take anything but it returns the value
	*/
	
	Supplier<Date> s = ()-> new Date();
	Date date = s.get();
	System.out.println(date);
}
}
