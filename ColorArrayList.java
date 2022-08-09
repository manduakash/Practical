package collections_package;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorArrayList {	//main class
	public static void main(String[] args) {	//main method
		//creating arraylist object
		ArrayList<String> arList = new ArrayList<>();
		
		//adding elements 
		arList.add("Red");
		arList.add("Green");
		arList.add("Orange");
		arList.add("White");
		
		System.out.println("Traversing using iterator:");
		Iterator<String> i = arList.iterator();				//creating iterator object for travering
		
		//traversing arraylist using iterator
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}
}
