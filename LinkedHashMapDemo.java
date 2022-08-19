package collections_package;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		//creating object of LinkedHashMap
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
	
		//adding element
		lhm.put(200, "riya");
		lhm.put(205, "priya");
		lhm.put(202, "rima");
		lhm.put(201, "rohit");
		lhm.put(203, "akash");
		lhm.put(null, "sayan");
		lhm.put(207, null);
		lhm.put(null, null);
		lhm.putIfAbsent(204, "rajesh");
		
		
		//removing
		lhm.remove(205);
		
		//traversing map
		for (Map.Entry<Integer, String> m: lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
	}
}
