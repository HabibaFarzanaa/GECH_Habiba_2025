package FunctionsInJava_pack;

public class Function {
	
	public int add1(int a, int b) {
		return a + b;
	}

	public void add2(int a, int b) {
		System.out.println("addition of c and d :" + (a + b));
	}
	
	public int add3() {
		return 321;
	}
	
	public void add4() {
		System.out.println("Function not accepting and not returning the value");
	}

	/*
	 * Functions/methods in java:
	 * 
	 * <access modifier> return_type function_name(parameters){ code }
	 * 
	 * public void add(int a,intb){ syso(a+b);
	 * ------------------------------------------
	 * 
	 * 2 types of functions: 1.built-in -> next(),nextLine(),println(),equals() 2.
	 * User defined:
	 * 
	 * -------------------------------------------
	 * 
	 * a. function return a value not accepting a parameter b. function return a
	 * value accepting a parameter c. function not return a value accepting a
	 * parameter d. function not return a value not accepting a parameter
	 */
	public static void main(String[] args) {
		Function obj1 = new Function();
		int res = obj1.add1(50, 9);
		System.out.println("Result:" + res);

		obj1.add2(10, 20);
		
		obj1.add3();
		System.out.println(obj1.add3());
		
		obj1.add4();
	}

}