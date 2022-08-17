package collections_package;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		//creating and adding datas into the deque object
		Deque<String> deque = new ArrayDeque<>();
		deque.add("pallabi");
		deque.add("subhrajit");
		deque.add("mamta");
		deque.add("monalisa");
		deque.offerFirst("anju");		//adding element at first position
//		deque.offerLast("anju");		//adding element at last position
		
		System.out.println("\nBEFORE");
		//traversing before any operation
		deque.forEach(System.out::println); 				//internal iteration
		
		deque.pollLast();		//delete the last element
//		deque.pop();			//removes the first element
		
		System.out.println("\nAFTER");
		//traversing after any operation
		deque.forEach(System.out::println); 				//internal iteration
		
	}
}
