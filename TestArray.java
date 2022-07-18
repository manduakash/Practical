
public class TestArray {	// class

	public static void main(String[] args) { // main method
		
		int[] a = new int[7]; 	// instantiating array
		
		// initializing array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		
		// traversing array
		for(int i=0; i< a.length;i++) {		// for loop
			System.out.println(a[i]);
		}
	}

}
