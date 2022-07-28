
public class StringExample {
	//method 1
	public void show() {
		char[] arr = {'j','a','v','a'};
		
		String s = new String(arr);
		System.out.println("The value is " +s);
		System.out.println(arr);
	}
	
	// method 2
	public void myFunction() {
		String n1 = "akash";
		String n2 = new String("akash");
		
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
	}
	
	public static void main(String[] args) {	//main method 
		StringExample obj = new StringExample(); 	// instantiating object
		
		//invocation of mehtods
		obj.show();
		obj.myFunction();
	}
}
