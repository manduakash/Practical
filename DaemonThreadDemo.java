package thread;

public class DaemonThreadDemo extends Thread{
	public void run() {	//overriding run method from thread class
		
		if(Thread.currentThread().isDaemon()) {		//taking boolean args. by calling isDaemon method
			System.out.println("A daemon thread is alive");
		}else {
			System.out.println("user thread");
		}
	}
	public static void main(String[] args) { //main thread
		
		//instantiating objects
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		DaemonThreadDemo t2 = new DaemonThreadDemo();
		DaemonThreadDemo t3 = new DaemonThreadDemo();
		
		t1.setDaemon(true);	//now t1 is set as daemon thread
		
		//running all threads
		t1.start();
		t2.start();
		t3.start();
	}
}
