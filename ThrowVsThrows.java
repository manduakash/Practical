package exceptionHandel;

public class ThrowVsThrows {//class
	//whether student pass or not
	public static void mydisplay(int a) throws ArithmeticException {	//declaring exception
		//logic
		if(a>=0 && a<35) {
			throw new ArithmeticException("Fail");		//throwing exception
		}else {
			System.out.println("Pass");
		}
	}
	public static void main(String[] args) {	//main method
		//invoking the method
		mydisplay(13);
		System.out.println("rest of the code");
	}
}
