package collections_package;

import java.util.HashMap;
import java.util.Map;


//generic map example
public class HashMapDemo2 {
	public static void main(String[] args) {//main method
		Map<Integer,String> map = new HashMap<>(); //creating generic map object
		//adding keys and values
		map.put(1, "pallabi");
		map.put(2, "rahul");
		map.put(5, "sweta");
		map.put(7, "karan");
		
		//adding null keys and values
		map.put(null, "anju");
		map.put(8, null);
		
		//traversing map
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
	}
}
