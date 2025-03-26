package set;

import java.util.TreeSet;

public class TreeSetInJava {
public static void main(String[] args) {
	/*
	 * It will arrange the elements in ascending order
	 * ((a,b) ->(b-a)):If we want ot change the order like wnat in descendong order then we use this.
	*/
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	treeSet.add(89);
	treeSet.add(61);
	treeSet.add(100);
	treeSet.add(2);
	treeSet.add(22);
	treeSet.add(50);
	
	System.out.println(treeSet);
	
	TreeSet<Integer> treeSet1 = new TreeSet<Integer>((a,b) ->(b-a));
	treeSet1.add(89);
	treeSet1.add(61);
	treeSet1.add(100);
	treeSet1.add(2);
	treeSet1.add(22);
	treeSet1.add(50);
	
	System.out.println(treeSet1);
	
}
}
