//overriding example 

class Vehicle1{ // parent class 
	void run() {
		System.out.println("Vehicle is running...");
	}
}

class Car1 extends Vehicle1{ // child class
	@Override
	void run() { // overriding the run
		System.out.println("Car is running...");
	}
}

public class VehicleOverriding {
	// Main method
	public static void main(String[] args) {
		
		Car1 c = new Car1(); // creating instance of Car
		c.run(); // running the overriden method
		
	}

}
