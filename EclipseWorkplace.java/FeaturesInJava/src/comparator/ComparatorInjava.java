package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funInterface implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2; //small -high
	}
}


public class ComparatorInjava {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(2);
		list.add(45);
		list.add(23);
		
		
		System.out.println(list);		
		System.out.println("Using Function Interface");
		Collections.sort(list, new funInterface());
		
		System.out.println("Using lambda expression");
		Collections.sort(list, (a,b)->a-b);
		System.out.println(list);

	}

}
