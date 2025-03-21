package Interface_pack;

interface Animal {
	public void makesound();
}

class Dog implements Animal {
	@Override
	public void makesound() {
		System.out.println("dog barks");
	}
}

class Cat implements Animal {

	@Override
	public void makesound() {
		System.out.println("Cat sounds");

	}

}

public class InterfaceInJava {

	public static void main(String[] args) {
		/*
		 * Interface: It is the blue print of the class The methods in the interface by
		 * default abstract(does not contain from java 8 we can write default and static
		 * methods in java
		 * 
		 * 
		 * interface interface_name //code
		 * 
		 * interface animal(){ public void makesound(); }
		 * 
		 * 
		 */
		Dog dog1 = new Dog();
		dog1.makesound();
		Cat cat1 = new Cat();
		cat1.makesound();
	}

}
