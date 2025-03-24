package polymorphism_pack;

class Person{
	public void walking() {
		System.out.println("The person is walking");
	}
}

class Mohan extends Person{
	public void walking() {
		System.out.println("Mohan is walking");
	}
}

//2.Method overloading
class Addition{
	public static void add(int a, int b) {
		System.out.println("Addition is :" +(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition is :" +(a+b+c));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * polymorphism
		 * 
		 * poly->many
		 * morphism ->forms
		 * It is a mechhanism that methods will perform a different actions based on the situation
		 * 1. method-overloading(one class)
		 * 2.method-overriding(two class)
		*/
		
		/*
		 * 1. Method-overriding/dynamic polymorphism/Dynamic binding/runtime polymorphism  - override the parent default class, where the child
		 * class override by changing the default of the parent class
		 */
		
		Mohan obj = new Mohan();
		obj.walking();
		
		/*
		 * 2. method-overloading/static binding/static polymorphism/compile time
		 * polymorphism: same method name with different parameters within the same
		 * class
		 */
		Addition addition = new Addition();
		addition.add(2, 120,3);
	}

}
