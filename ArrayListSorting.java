package collections_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {	//main class
	public static void main(String[] args) {	//main method
		//creating string type arraylist object
		ArrayList<String> al = new ArrayList<>();
	
		//adding elements to arraylist
		al.add("subrajit");
		al.add("mamta");
		al.add("anju");
		al.add("bhaskar");
		al.add("pallabi");
		al.add("suruti");
		al.add("khusbu");
		al.add("samik");
		al.add("monalisha");
		
		//sop before sorting
		System.out.println("Before sorting");
		for (String s : al) {System.out.print(s+" ");}
		
		Collections.sort(al); //sorting using Collections class
		
		//sop after sorting
		System.out.println("\nsop After sorting");
		for (String s : al) {System.out.print(s+" ");}
		
		
		//creating string type arraylist object
		ArrayList<Integer> al1 =  new ArrayList<> (Arrays.asList(34,56,32,97,99,23,35,57,332));
		
		//sop before sorting
		System.out.println("\n\nBefore sorting");
		for (Integer s : al1) {System.out.print(s+" ");}
		
		Collections.sort(al1); //sorting using Collections class
		
		//sop after sorting
		System.out.println("\nsop After sorting");
		for (Integer s : al1) {System.out.print(s+" ");}
	}
}
