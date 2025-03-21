package Inheritance;

//1. single level
class Parent {
	int pData = 100;

	public void parentMethod() {
		System.out.println("This is parent method");
	}
}

class Child2 extends Parent {
	int cData = 200;

	public void childmethod() {
		System.out.println("This is child method");
	}
}


public class InheritanceInJava{
	public static void main(String[] args) {
		/*
		 * Inheritance
		 * extending the properties of parent class to child class
		 * properties(child, action(behavious)
		 * 
		 * types:
		 * 1.single level
		 * 2.multilevel
		 * 3.heirarchial level
		 * 4. hybrid
		 * 5. multiple - not possible in java
		*/
		Child2 child = new Child2();
		child.parentMethod();
		System.out.println(child.pData);

	}

}
