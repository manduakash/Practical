
public class TestArray2D {

public static void main(String[] args) { // main method
		
		int[][] a = {{1,2,3},{2,3,4,},{5,6,7}}; 	// instantiating array and initializing array
		
	
		// traversing array
		for(int i=0; i< 3;i++) {		// for row
			for(int j=0; j< 3;j++) {	// for col
			System.out.print(a[i][j]+" ");
			}
			System.out.println("");		// after compliting the iteration of each col
		}
	}

}
