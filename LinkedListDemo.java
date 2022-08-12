package collections_package;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//creating linkedlist objects
		LinkedList<String> l1 = new LinkedList<>();	
		LinkedList<String> l2 = new LinkedList<>();
		
		//adding elements to l1
		l1.add("anudip");
		l1.add("anudip");
		l1.add("anudip");
		l1.add("anudip");
		l1.add("anudip");
		l1.add("anudip");
		System.out.println(l1);
		
		//adding elements to l2
		l2.add("foundation");
		l2.add("foundation");
		l2.add("foundation");
		l2.add("foundation");
		l2.add("foundation");
		System.out.println(l2);
		
		l1.addAll(l2);				//adding l2 into l1 object
		System.out.println("aftter adding all elements of l2 in the l1");
		System.out.println(l1);
		
		l1.addFirst("Start");		//adding element at first position
		System.out.println("aftter adding all elements of l2 in the l1");
		System.out.println(l1);
		
		l1.addLast("End");			//adding element at last position
		System.out.println("aftter adding all elements of l2 in the l1");
		System.out.println(l1);
		
		l1.addLast("End");			//adding element at last position
		System.out.println("aftter adding all elements of l2 in the l1");
		System.out.println(l1);
		
		l1.removeFirst();	//removing first element
		l1.removeLast();	//removing last element
		
		l1.removeFirstOccurrence("foundation");	//removing first occurrence of foundation
		l1.removeLastOccurrence("anudip");	//removing last element occurrence of anudip
		
		l1.clear(); 						//remove all element of l1 list
	}
}
