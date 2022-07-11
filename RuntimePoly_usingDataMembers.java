class PehlaClass{ // parent class
	int EkVarible = 10;
}

class DusraClass extends PehlaClass{ // child class
	int EkVariable = 20; // overriding the EkClass variable
}


public class RuntimePoly_usingDataMembers {

	public static void main(String[] args) { // main method
		
		DusraClass obj = new DusraClass(); // objecject instantiating
		System.out.println("It is overriden EkVariable = " + obj.EkVariable); // output

	}
}
