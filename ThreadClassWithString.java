package thread;

public class ThreadClassWithString {	//main class
	public static void main(String[] args) {	//main method
		//creating thread object
		Thread obj = new Thread("First thread");
		obj.start();					//it send thread to active state
		String s = obj.getName();		//returns the name of thread
		System.out.println(s);		//sop 
	}
}
