package exceptionInJava;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {

//	recursion
//	Error
//	
//	public static void display() {
//		display();
//	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Exception in Java: There is a unwanted or un-expected event occur in the
		 * program When ever there us exception the normal flow will stops.
		 * 
		 * 2.types: 
		 * 1. checked exception(compile time) - FileNotFoundException 
		 * 2. unchecked exception(run time) - arrayIndexOutBoundException
		 * 
		 * Error: It is a program where the programmer can't handle it ex: Stackoverflow
		 * error
		 * 
		 */
//			ExceptionInJava.display(); This is for error

		/*
		 * CHECKED EXEPTION: 1.try catch 2.throws
		 */

//		try {
//			PrintWriter printWriter = new PrintWriter("abc.txt");
//			printWriter.println("Hello World");
//			System.out.println("Hello world");
//			printWriter.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		2.throws
		PrintWriter printWriter = new PrintWriter("abc.txt");
		printWriter.println("Hello World");
		System.out.println("Hello world");
		printWriter.close();
		
		
	}
}
