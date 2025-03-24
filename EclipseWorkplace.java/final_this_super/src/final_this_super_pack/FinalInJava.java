package final_this_super_pack;

class Person{
	public final void walking() {
		System.out.println("The person is walking");
	}
}

//class Habiba extends Person{ //can't extend when there is final keyword
//	public void walking() {
//		
//	}
//}
final class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}



/*
 * class Dog extends Animal{
 * 
 * }
 */
public class FinalInJava {
	public static void main(String[] args) {

		/*
		 * final -> we can't change the value variables, method, class variables ->the
		 * variable value cannot be changed method -> we cannoot override final class
		 * ->we cannot extends that class
		 */

		final double PI = 3.14;
		System.out.println(PI);
		Animal animal = new Animal();
		animal.eat();
	}
}
