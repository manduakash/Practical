import java.util.ArrayList;

public class TestArrayList_Compare {

	public static void main(String[] args) {	//main method
		//instantiating array list 1
		ArrayList<String> al = new ArrayList<String>();
		
		//initializing list 1
		al.add("Rose");
		al.add("SunFlower");
		al.add("Lily");
		al.add("Daisy");
		al.add("MariGold");
		al.add("Tulip");
		al.add("Jasmin");
		
		System.out.println(al);	//output list 1
		
		//instantiating array list 2
		ArrayList<String> al1 = new ArrayList<String>();
		
		//initializing list 1
		al1.add("Rose");
		al1.add("SunFlower");
		al1.add("Lily");
		al1.add("Daisy");
		al1.add("MariGold");
		al1.add("Tulip");
		al1.add("Jasmin");
		
		System.out.println(al1); //output list 2
		
		//comparing array lists
		boolean b = al.equals(al1);		//comparing
		System.out.println("Is both array list have same elements: "+ b);
		
		al1.add("Black Rose");  // adding new element to list 2
		System.out.println("adding element Black rose to list 2...");
		boolean b1 = al.equals(al1);	// comparing again
		System.out.println("Is both array list have same elements: "+ b1);
	
	}

}
