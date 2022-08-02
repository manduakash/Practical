package exceptionHandel;
import java.util.*;

public class NestedExceptionExample {

		public static void main(String[] args) {	//main method
			
		//instantiating object
		Scanner scan = new Scanner(System.in);		// for taking user input
	    System.out.println("Enter two numbers");
	    
	    try {										//normal try block
	    	int x = scan.nextInt();					
	    	int y = scan.nextInt();
	    	try {									//nested try block
	    	System.out.println(" "+(x/y));
	    	}catch(ArithmeticException e) {			//nested catch block
		    	System.out.println("You are not allow to input zero as denominator");
		    }
	    }catch(Exception e) {						//normal catch block
	    	System.out.println(e);
	    }
	    
	    scan.close();
	    
	 }
	}
