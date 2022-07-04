//@Author Akash Singh
//Java program to write non parameterize constructor

public class NonParaConstructor {
	
	NonParaConstructor(){ //creating a constructor 
		System.out.println("It is a non parameterize constructor");
	}
	public static void main(String[] args) { //main method
		
		//creating object
		NonParaConstructor obj1 = new NonParaConstructor(); 
	
		//Output
		System.out.println(obj1.name);
	}

}
