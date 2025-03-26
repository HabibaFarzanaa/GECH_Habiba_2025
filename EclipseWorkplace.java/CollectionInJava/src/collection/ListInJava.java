package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
	public static void main(String[] args) {
		/*
		 * LISTS
		 * It is child interface of collection
		 * It will contain some of the built in methods that used inside a list 			implemented classes only
		 *When you represent a group of individual object as a single entity
		 *where the order is preserved and index based access and duplicate is allowed 
		 *
		 *collection does know what type of elements are store in collection
		 *Also we need to do typecasting explicitly 
		*/
		
		List list = new ArrayList();
		list.add(2);
		list.add("hello");
		list.add(10.00);
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double value = (double) list.get(2);
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
