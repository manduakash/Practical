//primitive to wrapper
public class WrapperClass {

	public static void main(String[] args) {	//main method
		
		int a = 10;							//primitive
		Integer i = Integer.valueOf(a);		//boxing
		Integer j = a;						//boxing; primitive to wrapper
		
		System.out.println(a + " " +i+ " " +j);
		

	}

}
