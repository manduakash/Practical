package collections_package;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		//adding elements to ll
		ll.add("anudip");
		ll.add("anudip");
		ll.add("anudip");
		ll.add("anudip");
		ll.add("anudip");
		ll.add("anudip");
		
		//traversing linkedlist
		Iterator<String> i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
