package collections_package;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {	//main class
	public static void main(String[] args) {	//main method
		
		//creating LinkedHashSet object using set reference
		Set<String> set = new LinkedHashSet<>();
		//adding elements
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("five");
		set.add("six");
		
		//removing element
		set.add("six");
		
		System.out.println("Traversing of set:");
		set.forEach(System.out::println);		//internal iteration
		
	}
}
