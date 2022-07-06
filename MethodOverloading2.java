//@author Akash singh
//method overloading by changing the return data type of methods

class AdditionNew{
	static int add(int a ,int b) { //taking two arguments
		return a+b;
	}
	
	static double add(double a, double b) { //taking three arguments but name is same
		return a+b;
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) { // main method 
		
		//output
		System.out.println(AdditionNew.add(5, 7)); // two arguments wala add method invoked
		System.out.println(AdditionNew.add(5.9, 6.5)); // three arguments wala add method invoked
	}
}
