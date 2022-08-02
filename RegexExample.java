package StringClass;

import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {	//main method
		Pattern p = Pattern.compile(".a"); 	//single dot
		Matcher m = p.matcher("ma");
		boolean b = m.matches();
		
		boolean bb = Pattern.compile("..m").matcher("aam").matches();
		boolean b1 = Pattern.matches("[a-zA-Z0-9]{8,}","Anudip123ppp");
		boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}","8348222888");	//phone number validating
		boolean b3 = Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z]{3}","manduakash@gmail.com");	//email validating
		boolean b4 = Pattern.matches("^[a-z0-9+_.-]{8,}","@Akash.123");	//password validating pattern
		
		System.out.println(b+" "+bb+" "+" "+b1+" "+b2+" "+b3+" "+b4+" ");
	}
}
