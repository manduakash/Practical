import java.util.Scanner;

public class TestUserInputArray {

	public static void main(String[] args) {	// main method
		
		
		Scanner scan = new Scanner(System.in); 	//instantiating scanner class 
		
		// taking array lenght by user input
		System.out.println("Enter array lenght");
		int arrLenght=scan.nextInt();
		int[] arr = new int[arrLenght];		// instantiating array and giving user input size
		
		// passing the values to array
		System.out.println("Enter array elements...");
		for (int i = 0; i < arr.length; i++) {		// for loop
			arr[i]=scan.nextInt();
		}
	
		// traversing the array
		System.out.println("Your array:");
		for(int i:arr) {					// enhanced for loop
		System.out.print(i + " ");
		}
		
		scan.close();		// closing scanner class
	}
}
