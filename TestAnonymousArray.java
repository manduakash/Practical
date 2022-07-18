
public class TestAnonymousArray {
	
	static void print(int arr[]) {	// passing array as argument
		// logic
		for(int i=1; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {	//main method
		// calling the static method
		print(new int[] {10,20,20,30,40,50,60,70});		// anonymous array
	}

}
