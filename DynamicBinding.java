class Class_01{ // parent class
	void run() {
		System.out.println("Simple ouput");
	}
}
class Class_02 extends Class_01{ // child class
	@Override
	void run() {
		System.out.println("Dynamic binded ouput");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// Main method
		
		Class_02 obj = new Class_02(); // creating object 
		obj.run(); // output
	}

}
