package StringClass;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void my() {
		//creating tokenizer object
		StringTokenizer t = new StringTokenizer("Anudip Foundation skill and Carrier Developer Center"," ");
		StringTokenizer st = new StringTokenizer("I am riya, Staying in kolkata");
	
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken(" "));
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}
	}
	
	public static void main(String[] args) {
		my();	//invoking static 'my' method
	}
}
