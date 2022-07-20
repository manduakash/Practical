//@author Akash Singh
// A real life example of copied array; seperating each items according to their customer order

import java.util.Arrays;


public class ExampleCopyArray {
	public static void main(String[] args) { // main method
	
		//instantiating and initializing returant array array
		String[] resturantItems = {"Buger","Coke","French-Fries","Cutting-Chai","Vada-Pav","parle-G biscuit","Pizza","Fried-Momos","Masala-dosa","Idli","Uttapam","sambhar","coconut-chatni"};
		
		//instantiating and coping customer array
		String[] customer_1 = Arrays.copyOfRange(resturantItems, 0, 3);
		String[] customer_2 = Arrays.copyOfRange(resturantItems, 3, 6);
		String[] customer_3 = Arrays.copyOfRange(resturantItems, 6, 8);
		String[] customer_4 = Arrays.copyOfRange(resturantItems, 8, 13);
				
		//converting arrays into string value and SOP
		System.out.println("_____________________JAGGED ARRAY____________________\n");
		System.out.println("customer 1:  " + Arrays.toString(customer_1));
		System.out.println("customer 2:  " +Arrays.toString(customer_2));
		System.out.println("customer 3:  " +Arrays.toString(customer_3));
		System.out.println("customer 4:  " +Arrays.toString(customer_4));
		
	}
}
