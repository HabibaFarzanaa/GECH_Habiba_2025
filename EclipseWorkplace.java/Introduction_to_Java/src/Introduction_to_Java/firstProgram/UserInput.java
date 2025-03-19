package Introduction_to_Java.firstProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		/*		
		 * byte = nextByte();
		 * short = nextShort();
		 * float = nextFloat();
		 * 
		*/		int stdAge = 0;
		System.out.println("Enter the student age: ");
		Scanner sc = new Scanner(System.in);
		stdAge = sc.nextInt();
		System.out.println("The age of the student is: " +stdAge);
		
		byte range = 0;
		System.out.println("Enter the value betwwn -127 to +127: ");
		range = sc.nextByte();
		System.out.println("The value is: " +range);
		
		System.out.println("Enter the short value ranging -32000 to +32000: ");
		short shrtval = sc.nextShort();
		System.out.println("The Short Value is: " +shrtval);
		
		sc.nextLine();
		
//		character
		System.out.println("Enter the gender: ");
		char gender =  sc.nextLine().charAt(0);
		System.out.println("Gender is : " +gender);
		
	}

}
