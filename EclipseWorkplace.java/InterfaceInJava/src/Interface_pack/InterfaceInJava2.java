package Interface_pack;


interface Interface1 {
	public void mathod();
	public default void defaultMethod() {
		System.out.println("This is default method in interface");
	}
	public static void staticmethod() {
		System.out.println("This is static method");
	}
	
}
class Child3 implements Interface1{

	@Override
	public void mathod() {
		System.out.println("This is method");
	}
}

public class InterfaceInJava2{
	//default and static method inside the interface\
	
	public static void main(String[] args) {
		Child3 child = new Child3();
		child.mathod();
		child.defaultMethod();
	//static class will not be shown here
	}
}
