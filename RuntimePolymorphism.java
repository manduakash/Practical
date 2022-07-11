class Shape { // parent class
	void drawShape() { 
		System.out.println("It is a shape");
	}
}

class Circle1 extends Shape { // child class of shape class
	@Override
	void drawShape() {  
		System.out.println("It is shape of a Circle");
	}
}

class Square1 extends Shape { // child class of shape class
	@Override
	void drawShape() {
		System.out.println("It is shape of a Square");
	}
}

class Triangle1 extends Shape { // child class of shape class
	@Override
	void drawShape() {
		System.out.println("It is shape of a Triangle");
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) { // main method
		//Creating objects using dynamic memory dispatching
		Shape c = new Circle1();
		Shape s = new Square1();
		Shape t = new Triangle1();
		 
		//calling the methods
		c.drawShape();
		s.drawShape();
		t.drawShape();
	}
}
