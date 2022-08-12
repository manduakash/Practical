package thread;

public class DaemonIllegalThreadExaception extends Thread{
	public void run() {	//overriding run method from thread class
		
		if(Thread.currentThread().isDaemon()) {		//taking boolean args. by calling isDaemon method
			System.out.println("A daemon thread is alive");
		}else {
			System.out.println("user thread");
		}
	}
	public static void main(String[] args) { //main thread
		
		//instantiating objects
		DaemonIllegalThreadExaception t1 = new DaemonIllegalThreadExaception();		
		
		//running thread
		t1.start();
		try {t1.setDaemon(true);} 	//it will throw IllegalThreadException
		catch (Exception e) {		//handeling exception
			System.out.println(e);
		}
		
	}
}
