//@Author Akash Singh
//Multi level inheritance

class FatherClass { // Parent class
	
	String height = "Tall";
	void run() {
	System.out.println("Father");
	}
}
	class SonClass extends FatherClass{ // Child class of Father class
		String skinTone = "Brown";
		void run() {
			System.out.println("Son");
		}
}
	
	class GrandSonClass extends SonClass{ // Child class of Son class
		void run() {
			System.out.println("Grand son");
		}
}

	public class InheritanceMultiLevel {
		//main method
		public static void main(String[] args) {
		
			//creating objects of super and sub classes
			FatherClass f = new FatherClass(); 
			SonClass s = new SonClass();
			GrandSonClass gs = new GrandSonClass();
			
			// using run method for output
			f.run(); //father
			s.run(); //son
			gs.run(); //Grand son
			
			// grandson is inherit the father and his grand father's properties 
			System.out.println(gs.skinTone); //properties of Father Class
			System.out.println(gs.height);  //properties of Son Class
	}

}
