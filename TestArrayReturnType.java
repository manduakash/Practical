
public class TestArrayReturnType {
	
	static int[] get() {	// static method that returns an array
		return new int[] {34, 95, 95, 86, 12};
	}
	
	public static void main(String[] args) {	// main method
		
		int[] arr = get();	// instantiating an array by callin static mehtod
		
		//	traversing the array
		System.out.println("Traversing the array");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
}
