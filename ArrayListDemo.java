package collections_package;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("sayan");
		al.add("akash");
		al.add("sagnik");
		al.add("mrinal");
		al.add("owashim");
		al.add("pritam");
		
		// printing size of arraylist 
		System.out.println("size of array list: "+al.size());
		
		// removing element of index 5
		al.remove(5);
		
		// printing elements of arraylist using iterator
		System.out.println("Sop using iterator");
		Iterator<String> i = al.iterator();		//creating iterator object
		while(i.hasNext()) {		//checking elements present or not
			System.out.print(i.next()+" ");	//printing next element
		}
				
		
		// printing size of arraylist 
		System.out.println("\nafter removing, size is: "+al.size());
		
		// printing elements of arraylist after removing 
		System.out.println(al);
		
		// printing elements of arraylist index wise 
		System.out.println("element at index 4: "+al.get(4));
		
		
		
	}

}
