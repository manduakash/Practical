//@Author Akash Singh
//Java program to find perimeter of rectangle

class PerimeterOfRectangle{
	//initilizing sides of rectangle
	int side1;
	int side2;

	void insertSides(int a, int b) { //taking the input as parameters 
		
		//assigning the perimeters to side variables
		side1 = a;
		side2 = b;
	}

	void perimeter(){
		System.out.println(2*(side1+side2)); //logic
	}
}


public class PeriOfRectangle{

	public static void main(String[] args) { //main method
		
		PerimeterOfRectangle r1 = new PerimeterOfRectangle(); // creating r1 object
		PerimeterOfRectangle r2 = new PerimeterOfRectangle(); //creating r2 object
		
		//giving the inputs as parameter
		r1.insertSides(8,9); 
		r2.insertSides(5,7);
		
		//showing the output
		r1.perimeter();
		r2.perimeter();

	}

}
