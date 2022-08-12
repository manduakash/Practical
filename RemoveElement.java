//@author Akash Singh
package collections_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {	//main class
	public static void main(String[] args) {	//main method
		
		//instantiating object of array list
		ArrayList<String> al = new ArrayList<>(Arrays.asList("Red","Green","white","Blue","Yellow"));

		//traversing before removing element
		System.out.println("Before any operation:");
		System.out.println(al);
		
		al.remove(2);	//removing element from index 3
		
		//traversing after removing element
		System.out.println("\nAfter removing:");
		System.out.println(al);
		
		
		//QUESTION NO. 2:
		Collections.shuffle(al);	//shuffling the elements
		
		//traversing after shuffling elements
		System.out.println("\nAfter shuffling:");
		System.out.println(al);
				
		
	}
}
