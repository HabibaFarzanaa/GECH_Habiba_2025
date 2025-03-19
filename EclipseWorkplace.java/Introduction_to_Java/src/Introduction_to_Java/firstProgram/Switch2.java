package Introduction_to_Java.firstProgram;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 - 7");
		int day = sc.nextInt();
		String res = switch(day) {
		case 1,2,3,4,5 -> "Weekday";
		case 6,7 -> "Weekend";
		default -> "Invalid";
		
		};	
		System.out.println("The result is : " +res);
	}
}
