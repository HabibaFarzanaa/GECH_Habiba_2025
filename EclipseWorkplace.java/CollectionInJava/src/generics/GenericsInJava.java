package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
public static void main(String[] args) {
	/*
	 * Generics:
	 * to provide the type safety and to avoid the type casting in 
	 * collection then we should go for generic */
	
	char [] arr= {'a','b','c'};//type safety means only data of single data type is allowed
	char firstele=arr[0]; //without type casting
	System.out.println(firstele);
	
	//without generics
	List arr1=new ArrayList(); //here there is no type safety
	arr1.add(12);
	arr1.add(10.2);
	arr1.add("hello");
	int value=(int)arr1.get(0); //explict type casting
	System.out.println(value);
	
	
	//generics
	List<Integer> list =new ArrayList<>();//here all the elements in the array list  are integer
	list.add(12); 
	list.add(120);
	list.add(300);
	int a=list.get(1);//there is no concept of type casting
	System.out.println(a);
	System.out.println(list);
	
}
}