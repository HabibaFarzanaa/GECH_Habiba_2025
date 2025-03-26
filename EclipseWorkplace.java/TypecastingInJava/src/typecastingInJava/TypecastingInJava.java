package typecastingInJava;

public class TypecastingInJava {

	public static void main(String[] args) {
		/*
		 * Type casting 
		 * Conversion of one data type to other
		 * 
		 * 2 types
		 * 1.implicit type casting
		 * byte -> short -> int -> long ->float -> double
		 * 
		 * 2. explicit type casting
		 * double -> float -> long -> int ->short -> byte
		 */
//		Implicit type casting
		int a =10;
		long a2 = a;
		
		System.out.println("int: " +a);
		System.out.println("Long :" + a2);
		
		
// 		explicit type casting		
		long a3 = 10;
		int a4 = (int)a3;
		System.out.println("int: " +a4);
		System.out.println("Long :" + a3);
		
	}

}
