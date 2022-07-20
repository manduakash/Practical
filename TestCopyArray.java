
public class TestCopyArray {	//class

	public static void main(String[] args) { // main method
		// instantiating and initializing
		char[] copyFrom = {'d','e','c','f','f','e','i','n'};
		// declaring destination array
		char[] copyTo = new char[7];
		
		// coping array
		System.arraycopy(copyFrom, 1, copyTo, 0, 7);
		System.out.println(String.valueOf(copyTo));
	}

}
