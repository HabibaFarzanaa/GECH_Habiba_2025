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
		Child2 child = new Child2();
		child.parentMethod();
		System.out.println(child.pData);

	}

}
