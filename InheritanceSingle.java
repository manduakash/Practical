//@Author Akash Singh
//Single level inheritance

class SuperClass { // Parent class
	void run() {
	System.out.println("This is a Super Class");
	}
}
	class SubClass extends SuperClass{ // Child class
		void run() {
			System.out.println("This is a Sub Class");
		}
}

	public class InheritanceSingle {
		//main method
		public static void main(String[] args) {
		
			//creating objects of super and sub classes
			SuperClass parent = new SuperClass(); 
			SubClass child = new SubClass();
			
			//prining the output
			parent.run();
			child.run();
	}

}
