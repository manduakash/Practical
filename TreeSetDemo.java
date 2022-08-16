package collections_package;

import java.util.TreeSet;

public class TreeSetDemo {	//main class
	public static void main(String[] args) {	//main method
		
		//creating treeset object
		TreeSet<String> set = new TreeSet<>();
		
		//adding elements
		set.add("M");
		set.add("N");
		set.add("O");
		set.add("P");
		set.add("Q");
				
		System.out.println("Traversing of set:");
		set.forEach(System.out::println);		//internal iteration
		
		//NavigableSet methods
//		System.out.println("reverse order: "+ set.descendingSet());	//reverse
		System.out.println("Lowest value: "+ set.pollFirst());	//lowest element
		System.out.println("Head set: "+ set.headSet("O",true));	//headSet method
		System.out.println("sub set: "+ set.subSet("M", "Q"));	//subSet method
		System.out.println("tail set: "+ set.tailSet("O"));	//tailSet method
	}
}
