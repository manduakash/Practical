//@Author Akash Singh
//Multi level inheritance

class FatherClass1 { // Parent class
	
	String height = "Tall";
	void run() {
	System.out.println("Father");
	}
}
	class SonClass1 extends FatherClass1{ // Child class of Father class
		String skinTone = "Brown";
		void run() {
			System.out.println("Son");
		}
}
	
	class GrandSonClass1 extends SonClass1{ // Child class of Son class
		void run() {
			System.out.println("Grand son");
		}
}

	class GrandDaughterClass1 extends SonClass1{ // Child class of Son class
		void run() {
			System.out.println("Grand daughter");
		}
}
	
	public class InheritanceHierarchical {
		//main method
		public static void main(String[] args) {
		
			//creating objects of super and sub classes
			FatherClass1 f = new FatherClass1(); 
			SonClass1 s = new SonClass1();
			GrandSonClass1 gs = new GrandSonClass1();
			GrandDaughterClass1 gd = new GrandDaughterClass1();
			
			// using run method for output
			f.run();  // father
			s.run();  // son
			gs.run(); // Grand son
			gd.run(); // Grand Daughter
			
			// grandson is inherit the father and his grand father's properties 
			System.out.println(gd.skinTone); //properties of Father Class
			System.out.println(gd.height);  //properties of Son Class
	}

}
