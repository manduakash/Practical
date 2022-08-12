package thread;

public class DeadLockDemo extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		infiniteLoop();	
		notify();	// it will notify after completion of infiniteLoop method
	}
	public synchronized void infiniteLoop() {
		while(true) {
			//infinite loop is running
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		DeadLockDemo obj1 = new DeadLockDemo();
		DeadLockDemo obj2 = new DeadLockDemo();
		
		obj1.start();
		obj1.wait();	// deadlock occurs
		
		obj2.start();	//obj2 will be never execute
		
	}
}
