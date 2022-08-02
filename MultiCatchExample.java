package exceptionHandel;
import java.util.*;

public class MultiCatchExample {
	public static void main(String[] args) {
		
	//instantiating object
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers");
    
    try {
    	int x = scan.nextInt();
    	int y = scan.nextInt();
    	System.out.println(" "+(x/y));
    }catch(InputMismatchException e) {
    	System.out.println("You have entered wrong input");
    }catch(Exception e) {
    	System.out.println(e);
    }
    
    scan.close();
    
 }
}
