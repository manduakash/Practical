import java.util.ArrayList;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		
		//boxing 
		a1.add(5);
		a1.add(2);
		
		//unboxing
		int a = a1.get(0);
		System.out.println(a); 		//printing the unboxed data
		
	}

}
