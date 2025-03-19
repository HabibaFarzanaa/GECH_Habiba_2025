package Introduction_to_Java.firstProgram;

public class ControlStatement {


		public static void main(String[] args) {
			/*
			 * if,if else, else if and switch statements
			 * 
			 * if(condition){
			 * }
			 * 
			 * if(condition){
			 * }
			 * else{
			 * }
			 * 
			 * if(condition){
			 * }
			 * else if(condition){
			 * }
			 * else if(condition){
			 * }
			 * else {
			 * }
			 * 
			 */
			
			int a=20;
			int b =40;
			
			System.out.println("if statement:");
			if(b>a) {
				System.out.println("b is larger \n");
			}
			
			
			System.out.println("if else statement:");
			if(b>a) {
				System.out.println("b is larger \n");
			}
			else
				System.out.println("a is larger \n");
			
			
			int c=50;
			int d=40;
			int e=30;
			System.out.println("else if statement:");
			if(c>d) {
				System.out.println("c is larger");
			}
			else if(d>e) {
				System.out.println("d is larger");
			}
			else {
				System.out.println("e is larger");
			}

		}

	}
