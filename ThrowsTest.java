package exceptionHandel;


public class ThrowsTest {//class
	public static void Eligible(int age) throws ArithmeticException {	//declaring exception
		
		if(age<18) {
			throw new ArithmeticException("You are not eligible for vote");		//throwing custom exception
		}else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {	//main method
		//invoking the method
		Eligible(13);
		System.out.println("rest of the code");
	}
}
