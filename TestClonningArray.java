
public class TestClonningArray {

	public static void main(String[] args) {	// main method
		// instantiating and initializing the array
		int[] arr = {44, 4, 5, 6};
		
		System.out.println("Traversing the actual array...");
		// traversing actual one
		for(int i:arr) {	// for each loop
			System.out.print(i+" ");
		}
		
		System.out.println();  //for new line; not recommded
		
		System.out.println("Traversing the clone array...");
		//travering clone one
		int[] copyArr=arr.clone();	// cloning 
		for(int i:copyArr) {		//for each loop
			System.out.print(i+" ");
		}
		System.out.println();  //for new line; not recommded
		
		
		// checking references
		System.out.println("Is references are equal :");
		System.out.print(arr==copyArr);
		

	}

}
