package Inheritance;

class Student1 {
	// states
	public int age = 23;
	public String name = "Bushra Arbiya";
	public double marks = 12.21;
	
	//full arg constructor: when no. of states and constructor are same 
	public Student1(int age, String name, double marks) {
//		super();
		System.out.println("----------------------------------------");
		System.out.println("Full Argument Constructor");
		System.out.println("----------------------------------------");		
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	public Student1() {
		System.out.println("----------------------------------------");
		System.out.println("No arg constructor");
		System.out.println("----------------------------------------");
	}

//	actions
	public void isplaying() {
		System.out.println(this.name + " is playing");
	}

	public void isSleeping() {
		System.out.println(this.name + " is sleeping");
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Marks: " + this.marks);
	}
	
	
}

public class ConstructorInJava {

	public static void main(String[] args) {
		Student1 std1 = new Student1(22, "Habiba", 321);
		std1.display();
		Student1 std2 = new Student1();
		std2.display();
	}

}
