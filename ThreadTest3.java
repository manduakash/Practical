package thread;

public class ThreadTest3 extends Thread {
	public void run() {
		

		System.out.println(Thread.currentThread().getName()+ " start");	//before executing loop, it will run
		
		for(int i=0; i<5; i++) {//for start
		try {//try block
			Thread.sleep(1000); //exception throwing line
		}catch(InterruptedException e) {}
		System.out.println(i);
		}//for end
		System.out.println(Thread.currentThread().getName()+ " end");	//after executing loop, it will run
	}
	
	//main method
	public static void main(String[] args){
		
		//creating thread objects
		ThreadTest3 t1 = new ThreadTest3();
		ThreadTest3 t2 = new ThreadTest3();
		ThreadTest3 t3 = new ThreadTest3();
		
		//setting name of threads
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		//setting priority
		t3.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		
		//sending threads to active state
		System.out.println("priority of t1: "+t1.getPriority());
		System.out.println("priority of t2: "+t2.getPriority());
		System.out.println("priority of t3: "+t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		
	}
}
