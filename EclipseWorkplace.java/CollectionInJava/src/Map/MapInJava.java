package Map;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {

	public static void main(String[] args) {
		/*
		 * Map:
		 * When you represent a group of individual object as a single entity in the form of key value pair then we should go for map
		 * 
		 * 
		 */
		
		Map<Integer, String> map = new HashMap();
		map.put(1,  "one");
		map.put(2,  "Two");
		map.put(3,  "Three");
		map.put(4,  "Four");
		map.put(5,  "Five");
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(3));//return false because we have removed the value three and now the value '3' is not present in the list
		System.out.println(map.containsValue("Four"));//return tru bcz "Four" is present
	}

}
