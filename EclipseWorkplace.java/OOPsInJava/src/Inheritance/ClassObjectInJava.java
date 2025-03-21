package Inheritance;

class Student{
	//states
	public int age =23;
	public String name = "Bushra Arbiya";
	public double marks = 12.21;
	
//	actions
	public void isplaying() {
		System.out.println(this.name+ " is playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name+ " is sleeping");
	}
}
public class ClassObjectInJava {

	public static void main(String[] args) {
			
		/*
		 * class:
		 * Class will represent the state and behaviour 
		 * State ->property
		 * Behaviour -> action
		 * We can assign only two modifiers in class ie public and private
		 * Multiple class can be created in the single file but public keyword should not be given to other class rather filename class
		 * --------------------------------------------------------------
		 * Object: 
		 * Object is implementation of class(state and action) 
		 * example: Student
		 * -----------------------------------------------------------------------
		 * Property:
		 * USN
		 * Name
		 * Branch
		 * ---------------------------------------------------------------
		 * Action:
		 * isPlaying()
		 * isSleeping()
		 * 
		 * How to declare class and object
		 * 
		 * class class_name{
		 * state
		 * action
		 * }
		 * 
		 * ex:
		 * class Student{
		 * 	property:
		 * 	public int age = 30;
		 * 
		 * 	action:
		 * 	public void isplaying(){
		 * 		syso("She is playing")
		 * }
		 *  student obj - new student();
		 *   
		 */
		Student std1 = new Student();
		System.out.println(std1.name);
		System.out.println(std1.marks);
		System.out.println(std1.age);
		std1.isplaying();
		std1.isSleeping();
	}

}
