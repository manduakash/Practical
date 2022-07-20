//@author Akash Singh
// A real life example of jagged array; seperating each items according to their shops 

public class ExampleJaggedArray {	//class

	public static void main(String[] args) {	//main method
		
		// instantiating and initializing the array
		String arr[][]={{"book","pen","pencil"},{"apple","banana","jackFruit","grapes","melon"},{"potato","tomato","chili","carrot"}};	// array

		
		// traversing the jagged array
		for(int i = 0; i < arr.length; i++) {			// for row-wise traversing
			   System.out.print("Shop "+ (i+1) +": ");	// concatinating shop with shop no.; not recommended
			
			for(int j = 0; j < arr[i].length; j++){		// for col-wise traversing
			   System.out.print(arr[i][j]+", ");			
			}
			System.out.println();
		}
	
		
	}	
}
