// creating thread class by extending it
public class ThreadTest2 extends Thread{
	
	public void run(){	
		System.out.println("I am a thread...");
	}
	
	public static void main(String[] args) {		//main method
		// instantiating objects
		ThreadTest2 obj = new ThreadTest2();
		
		//invoking run method
		obj.start();
	}
}
