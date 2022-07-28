import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {	// main method
		String str1, str2;
		Scanner ab = new Scanner(System.in);	//instantiating scanner object
		
		// taking 1st string as user input
		System.out.println("Enter first string...");
		str1 = ab.nextLine();

		// taking 2nd string as user input
		System.out.println("Enter second string...");
		str2 = ab.nextLine();
		
		//comparing strings
		if(str1.equals(str2))
			System.out.println("Equal");
		else {
			System.out.println("Not Equal");
		}
		
		ab.close(); //closing scanner class
	}

}
