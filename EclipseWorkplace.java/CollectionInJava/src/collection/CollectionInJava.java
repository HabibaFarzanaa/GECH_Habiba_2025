package collection;

public class CollectionInJava {

	public static void main(String[] args) {
		/*
		 * Collection is a root interface of collection hierarchy
		 * Why we need collection
		 * to overcome the drawbacks of the array we have to make use of collection
		 * 
		 *  drawbacks of array:
		 *  1. Fixed array
		 *  2.same data type elements
		 *  3. we cannot reduce the size of an array
		 *  
		 *  Advantages if an array;
		 *  1.Random access
		 *  2. Type safety - the elements inside the array is based on the datatype
		 *  3. Type casting - to print elements in array, no need to type cast
		 *   
		*/
		
		int [] arr = new int[4];
		arr[0] = 12;
		arr[1] = 'h';
		System.out.println((int)arr[0]);// no need of type casting
		System.out.println(arr[1] = 'd');//print ASCII value 
	}

}
