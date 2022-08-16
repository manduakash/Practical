package collections_package;

import java.util.HashSet;

public class HashSetDemo {	//main class
	public static void main(String[] args) {	//main method
		
		//creating hashset object
		HashSet<String> set = new HashSet<>();
		//adding elements
		set.add("ram");
		set.add("rime");
		set.add("shyam");
		set.add("rahim");
		set.add("ram");		//it will not allow; cause in set we cant store duplicates
		
		//removing element
		set.add("ram");
		
		//creating second hashset object
		HashSet<String> set1 = new HashSet<>();
		//adding elements
		set1.add("akash");
		set1.add("rime");
		set1.add("shyam");
		set1.add("the mighty akash");
		set1.add("the mighty akash");
		
		set1.removeAll(set);		//it deletes all elements from 'set1' that is same in 'set'

		System.out.println("traversing of set:");
		set.forEach(System.out::println);		//internal iteration
		System.out.println("traversing of set1:");
		set1.forEach(System.out::println);		//internal iteration
	}
}
