class AnimalClass { // parent class
	void eats() { 
		System.out.println("Animal eats food.");
	}
}

class Cat extends AnimalClass { // child class of Animal class
	@Override
	void eats() {  
		System.out.println("Cat eats fish.");
	}
}

class Cow extends AnimalClass { // child class of Animal class
	@Override
	void eats() {
		System.out.println("Cow eats grass.");
	}
}

class Tiger extends AnimalClass { // child class of Animal class
	@Override
	void eats() {
		System.out.println("Tiger eats meat.");
	}
}

public class RuntimePolymorphismAnimal {
	public static void main(String[] args) { // main method
		
		//Creating objects Animal class using dynamic memory dispatch
		AnimalClass cat = new Cat();
		AnimalClass cow = new Cow();
		AnimalClass tiger = new Tiger();
		 
		//calling the overriden methods
		cat.eats();
		cow.eats();
		tiger.eats();
	}
}
