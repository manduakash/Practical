package collections_package;

import java.util.HashSet;
import java.util.Set;

public class HashSetNullDemo {	//main class
	public static void main(String[] args) {	//main method
		
		//creating hashset object using set reference
		Set<String> set = new HashSet<>();
		//adding elements
		set.add("ram");
		set.add("rime");
		set.add("shyam");
		set.add("rahim");
		set.add("saleem");
		
		//adding null element
		set.add(null);			//set allow only one null value
		
		System.out.println("Traversing of set:");
		set.forEach(System.out::println);		//internal iteration
		
	}
}
