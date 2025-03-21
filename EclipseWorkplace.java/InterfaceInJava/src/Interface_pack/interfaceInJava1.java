package Interface_pack;

interface A{
	public void methodA();
}
interface B{
	public void methodB();
}
class Child implements A,B{

	@Override
	public void methodA() {
		System.out.println("This is method A");
		
	}

	@Override
	public void methodB() {
		System.out.println("This is method B");
		
	}
	
}

interface C{
	public void methodC();
}

interface D{
	public void methodC();
}

class Child1 implements C,D
{

	@Override
	public void methodC() {
		System.out.println("This is method C");
		
	}
	
}
public class interfaceInJava1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.methodA();
		child.methodB();
		
		Child1 child1 = new Child1();
		child1.methodC();
		

	}

}

