package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("one","two","three","four");
		List<String> new_list=list.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());//remember list is the source
		//map is the intermediate and count is the termination
		System.out.println(new_list);
	}

}