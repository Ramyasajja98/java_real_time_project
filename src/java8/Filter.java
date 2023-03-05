package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(5);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println(array);
		List<Integer> list = array.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
		
	}
}
