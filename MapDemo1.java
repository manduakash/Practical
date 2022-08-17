package collections_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//non-generic map example
public class MapDemo1 {
	public static void main(String[] args) {//main method
		Map map = new HashMap(); //creating non-generic map object
		//adding datas
		map.put(1, "pallabi");
		map.put(2, "rahul");
		map.put(5, "sweta");
		map.put(7, "karan");
		
		//traversing map
		Set set = map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry en = (Map.Entry)i.next();
			System.out.println(en.getKey()+ " "+ en.getValue());
		}
	}
}
