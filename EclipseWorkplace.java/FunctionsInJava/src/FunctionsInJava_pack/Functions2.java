package FunctionsInJava_pack;

public class Functions2 {
	//1.Public Function
	//--> anywhere
	
	public void publicFunction() {
		System.out.println("This is publicFunction");
	}
	
	//2.Private Function
		//--> within the class
		
		private void privateFunction() {
			System.out.println("This is privateFunction");
		}
		
	//3.default Function
	//--> within the package
	
	public void defaultFunction() {
		System.out.println("This is defaultFunction");
	}
	
	//4.Protected Function
	//--> within the package and subclass in other package
	
	public void protectedFunction() {
		System.out.println("This is protectedFunction");
	}
	
public static void main(String[] args) {
	Functions2 obj1 = new Functions2();
	obj1.publicFunction();
	obj1.privateFunction();
	obj1.defaultFunction();
	obj1.protectedFunction();
}
}