package exceptionInJava;

public class unchecked_exception {
	public static void main(String[] args) {
		/*
		 * Unchecked Exception(run time)
		*/
		
		int a =40;
		int b =0;
		try {
			System.out.println("Result is :" +(a/b));
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Hello World");
		
	} 
}
