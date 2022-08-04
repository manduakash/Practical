// creating thread class by implementing it from interface
public class ThreadByRunnable implements Runnable{
	
	@Override
	public void run(){	
		System.out.println("I am a thread...by implementing the runnable interface ");
	}
	
	public static void main(String[] args) {		//main method
		// instantiating objects
		Runnable r = new ThreadTest2();
		Thread t = new Thread(r);
		
		//invoking run method
		t.start();
	}
}
