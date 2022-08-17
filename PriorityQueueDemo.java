package collections_package;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("akash");
		queue.add("sayan");
		queue.add("sankhajit");
		queue.add("hasan");
		queue.add("jaita");
		queue.add("Owashim");
		queue.add("tanmoy");

		
		queue.forEach(System.out::println); 				//internal iteration
		
		System.out.println("head: "+queue.element());
		System.out.println("peek: "+queue.peek());			//fetch the top element; check element is there or not
		queue.poll();										//fetch and remove top most element
		queue.remove();										//removes the top element
		queue.forEach(System.out::println); 				//internal iteration
	}
}
