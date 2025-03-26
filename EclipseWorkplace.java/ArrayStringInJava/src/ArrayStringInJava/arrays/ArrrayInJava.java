package ArrayStringInJava.arrays;

import java.util.Scanner;

public class ArrrayInJava {

	public static void main(String[] args) {
		/*
		 * Arrays in java
		 * If we want to store the values of the same datatype we have to go for the array
		 * ----------------------------------------------------------
		 * how to declare the arrrfay
		 * <datatype> [] array_name = new <datatype>[size]
		 * 
		 * int [] array1 = new int[3];
		 * ---------------------------------------------------------------
		 * Types of array:
			 * 1D array - single row
			 * int [] array1 = new int[3];
		 * 
			 * 2D array - In the form of matrix/table 
			 * int [][] array1 = new int[3][3];
		 * ------------------------------------------------------
		 * Drawbacks:
		 * We cannot extends the size of the array
		 * we cannot store the multiple type of element
		 * we delete the array, it will not shrink
		 * To overcome the drawbacks we go for collection.
		 * 
		 * Advantages:
		 * Random access
		 * Type casting is not required inside the array
		 * 
		 */
		
		int [] arr = new int[5];
		arr[0] = 30;
		arr[1] = 30;
		arr[2] = 30;
		arr[3] = 30;
		arr[4] = 30;
//		arr[5] = 30; array index out of bound exception
		for(var i: arr) {
			System.out.print(i+ " ");
		}
	}
}
