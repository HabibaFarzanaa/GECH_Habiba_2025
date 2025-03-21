package Inheritance;

interface interface2{
	public void interfaceMethod();	
}
class ParentC{
	public void parentMethod() {
		System.out.println("This is parent/intership class");
	}
}

class Child extends ParentC implements interface2 {
	@Override
	public void interfaceMethod() {
		System.out.println("Arbiya implement");		
	}
	
	public void childMethod() {
		System.out.println("Bushra Extends");
	}
	
}

public class Multilevel3 {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.parentMethod();
		child.childMethod();
		child.interfaceMethod();
	}

}
