
//@Author Akash Singh
//Java program to find the area of rectangle

class Rectangle{
	//initializing side variables
	int lenght;
	int width;

	void insertSides(int a, int b) { 
		//taking the input as parameters assigning it to side variable
		lenght = a;
		width = b;
	}

	void areaOfSquare() {
		System.out.println(lenght*width); //logic
	}
}


public class AreaOfRectangle {

	public static void main(String[] args) { //main method
		
		Rectangle r1 = new Rectangle(); // creating r1 object
		Rectangle r2 = new Rectangle(); //creating r2 object
		
		//giving the inputs as parameter
		r1.insertSides(8,5); 
		r2.insertSides(3,3);
		
		//showing the output
		r1.areaOfSquare();
		r2.areaOfSquare();

	}

}
