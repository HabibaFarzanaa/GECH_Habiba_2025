package featuresInJava;

@FunctionalInterface
interface Interface2{
	public void display();
}

interface Interface3{
	public int string2(String s) ;
	
}

public class FunctionalInterfaceInJava2 {

	public static void main(String[] args) {
		Interface2 i = () -> System.out.println("Hello wrold");
		i.display();
		
		Interface3 i3 = s-> s.length();
		int res = i3.string2("Welcome");	
		System.out.println("Result is : " +res);
	}
}
