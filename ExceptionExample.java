package exceptionHandel;

public class ExceptionExample {
	public void show() {
		String a = "I am error.";
		
		System.out.println(a);
		
		try {	//try block
			int i = 50/0;
			System.out.println(i);
		}catch(Exception e){	//exception handling
			System.out.println("There is an exception: "+e);
		}
	}
	
	//main method
	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		obj.show();
	}
}
