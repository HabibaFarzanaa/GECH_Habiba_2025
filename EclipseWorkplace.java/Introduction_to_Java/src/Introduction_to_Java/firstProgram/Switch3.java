package Introduction_to_Java.firstProgram;

public class Switch3 {
	public static void main(String[] args) {
		Object obj1 = 10;
		switch(obj1) {
			case String s -> System.out.println("String Type");
			case Integer i -> System.out.println("Integer Type");
			default -> System.out.println("Invalid");
		}
	}
}
