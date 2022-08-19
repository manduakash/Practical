package collections_package;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) { //main method
		//creating object
		TreeMap<Integer,String> tm = new TreeMap<>();
		//adding elements
		tm.put(200, "riya");
		tm.put(205, "priya");
		tm.put(202, "rima");
		tm.put(201, "rohit");
		tm.put(203, "akash");
//		tm.put(null, "akash");		//this line will be throw NullPointerException 
		tm.putIfAbsent(209, "akash");
		
		//traversing map
		for(Map.Entry<Integer, String> m: tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//these all methods are present in navigable Map interface
		
		System.out.println("headMap: "+tm.headMap(201,true));		//head map
		System.out.println("tailMap: "+tm.tailMap(201,true));		//tail map
		System.out.println("subMap: "+tm.subMap(201,true , 205,true));//sub-map
		
		//these all methods are present in sorted Map interface
		System.out.println("headMap: "+tm.headMap(201));		//head map
		System.out.println("tailMap: "+tm.tailMap(201));		//tail map
		System.out.println("subMap: "+tm.subMap(201, 205));//sub-map
		
	}
}
