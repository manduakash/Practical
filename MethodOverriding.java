//@author Akash singh
//method overriding

class Addition1{ // parent class
	//creating a add method
	int add(int a ,int b) { 
		return a+b;
	}
}

class Addition2 extends Addition1{ // creating child class of Additon1 class
	@Override // overriding the add method
	int add(int a ,int b) { 
		return a+b;
	}
}

public class MethodOverriding {

	public static void main(String[] args) { // main method 
		
		// Creating objects
		Addition1 a1 = new Addition1();
		Addition2 a2 = new Addition2();
		
		//output
		System.out.println(a1.add(5, 7)); // using add method of Additon1
		System.out.println(a2.add(12, 2)); // using overriden add method of Additon2

	}

}
