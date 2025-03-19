package Introduction_to_Java.firstProgram;

import java.util.Scanner;

public class NonPremitive {

	public static void main(String[] args) {
		
		/*
		 * 1. array
		 * 
		 * 
		 * 2. String
		 * String name = "";
		 * 
		*/
//		
//		int[] array1 = {1,2,3,4,5,6};
//		System.out.println(array1[3]);
//		
//		String name = "Arbiya Bushra";
//		System.out.println(name);
//		
//		String name1 = "Hello world";
//		System.out.println(name1);
//		
//		Scanner sc = new Scanner(System.in);
//		sc.next();
//		sc.nextLine();
		
		/*
		 * student name - String
		 * student age - byte, int
		 * student marks - double
		 * student gender - char
		 * student branch - String
		 * student address - string
		 * 
		*/
		Scanner sc = new Scanner(System.in);
		String stdname = "";
		System.out.println("Enter student name");
//		sc.next(); print sing word
		stdname = sc.nextLine(); //print complete string
		System.out.println("Enter age: ");
		byte age = sc.nextByte();
		System.out.println("Enter Marks");
		double marks = sc.nextDouble();
		System.out.println("Enter Gender");
		
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		System.out.println("Enter Branch");
		String branch = sc.next();
		System.out.println("Enter Address");
		String address = sc.next();
		
		System.out.println("Name : "+ stdname);
		System.out.println("Age : "+ age);
		System.out.println("Marks : "+ marks);
		System.out.println("Gender: "+ gender);
		System.out.println("Branch : "+ branch);
		System.out.println("Address : "+ address);
		
	}

}
