package Encapsulation;
//Hiding the content of the class using private method then generating the getter and setters
class Student {
	private String name;
	private int age;
	private double marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public class Encapsulation1 {

		public static void main(String[] args) {

			Student std1 = new Student();
			std1.setName("Arbiya");

		}

	}

}