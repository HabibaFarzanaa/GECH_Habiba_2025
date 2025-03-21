package ArrayStringInJava.arrays;

import java.util.Scanner;

public class ArrayAssignment {
	public static void main(String[] args) {
		System.out.println("Storing the values in array by taking inputs from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		
		System.out.println("Enter values of array :");
		for (int i = 1; i <= array1.length; i++) {
			System.out.println("Enter the " + i + "th element: ");
			array1[i-1] = sc.nextInt();
		}

		System.out.println("Array elements are: ");
		for (int j = 1; j <= array1.length; j++) {
			System.out.println(array1[j-1]+ " ");
		}
		sc.close();
	}
}
