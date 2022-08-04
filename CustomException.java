package exceptionHandel;

class InvalidException extends Exception{

	public InvalidException(String string) {
		super(string);
	}
	
}

public class CustomException {//class
	public static void checkAge(int a) throws InvalidException {	//declaring exception
		
		if(a>=18 || a<25) {
			throw new InvalidException("Invalid age");		//throwing exception
		}else {
			System.out.println("Proper age");
		}
	}
	public static void main(String[] args) throws InvalidException{	//main method
		//invoking the method
		checkAge(13);
		System.out.println("rest of the code");
	}
}
