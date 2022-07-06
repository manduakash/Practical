//@Author Akash Singh
//An example of a Multi-level inheritance

class Vehicle { // Vehicle is parent class of Car 
	Vehicle(){ // Constructor
		System.out.println("It is a vehicle");
	}
}

class Car extends Vehicle { //Car is child class of Vehicle
	Car(){ // Constructor
		System.out.println("It is a Car also");
	}
}

class Aulto extends Car { //Aulto is child class of Car class
	Aulto(){ // Constructor
		System.out.println("It is a Aulto"); 
	}
	void run() { 
		System.out.println("Aulto is ready to run...");
	}
}

public class InheritanceCar { // main class

	public static void main(String[] args) { //main method
		
		Aulto c = new Aulto(); //creating an object of Aulto 
		
		/*here vehicle and car constructor will be invoked
		because Aulto is containing all properties and methods of their parent classes*/
		
		c.run();// output

	}

}
