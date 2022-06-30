//@Author Akash Singh
//Java program to find the area of square

class SquareClass{
	//initializing the side variable
	int side;

	void insertSides(int a) { 
		//taking the input as parameters assigning it to side variable
		side = a;
	}

	void areaOfSquare() {
		System.out.println(side*side); //logic
	}
}


public class AreaOfSquare {

	public static void main(String[] args) { //main method
		
		SquareClass s1 = new SquareClass(); // creating s1 object
		SquareClass s2 = new SquareClass(); //creating s2 object
		
		//giving the inputs as parameter
		s1.insertSides(8); 
		s2.insertSides(3);
		
		//showing the output
		s1.areaOfSquare();
		s2.areaOfSquare();

	}

}
