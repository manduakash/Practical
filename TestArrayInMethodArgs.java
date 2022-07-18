
public class TestArrayInMethodArgs {	// class
	
	//	static method
	static void max (int a[]) { 	// taking array as argument
		//logic
		int max = a[0];
		for (int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("the max value among the array is " + max);
	}

	public static void main(String[] args) { // main method
		
		int[] arr = {10,20,30,40,50,60,70}; 	// instantiating and initializing the array
		
		// traversing array
		for(int i:arr) {		// enhanced for loop
			System.out.println(i);
		}
		
		//calling the static method
		max(arr);
	}

}
