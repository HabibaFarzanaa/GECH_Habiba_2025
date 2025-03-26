package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		/*
		 * collection
		 * 
		 * collection -> root interface in the framework
		 * collections-> It will provide some of the ability methods to works with 			collection
		 * 
		 * Collection:
		 * When you represent a group of individual object as a simple entity then we 			should go for the collection
		 * Root interface in collection framework
		 * this will provide the some of the built in methods to work with any collection class
		 * 
		 */
		
		Collection collection = new ArrayList();
		collection.add((12));
		collection.add("Name");
		collection.add(10.19);
//		collection.remove(12);
//		collection.clear();
		
		System.out.println(collection);
		
		
		
	}

}
