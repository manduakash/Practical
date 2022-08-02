package StringClass;

import java.util.Scanner;

public class StringTest {
	public void show() {	//method
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String A = s.next();
		String B = s.next();
		
		System.out.println(A.length()+B.length()); 					//adding length of A and B
		System.out.println(A.compareTo(B)>0 ? "Yes" : "No");		//comparing lexicographally using ternary condition
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(3)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
		s.close();
	}
	public static void main(String[] args) {	//main method
		// instantiating object
		StringTest t = new StringTest();
		t.show();//invoking show method
	}

}
