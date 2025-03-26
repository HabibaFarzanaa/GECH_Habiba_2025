package generics;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	/*
	 * ArrayList:
	 * -->Array list is the improved version of array(dynamic array)
	 * -->Array List underline data structure is Dynamic array
	 * -->Array list will allow duplicate
	 * -->Array list will allow random access
	 * -->Array list will allow null value
	 * -->Array list will preserve the order of insertion
	 * 
	 * */
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(12);
	list.add(1);
	list.add(1);
	list.add(null);
	list.add(null);
	list.add(34);
	System.out.println(list);
	//ramdom access
	System.out.println(list.get(3));
//	Integer i =34;
//	list.remove(i);
	list.remove(3);
	System.out.println(list);
	
	}
}