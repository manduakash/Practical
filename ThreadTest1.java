
public class ThreadTest1{
	public void run() throws InterruptedException{	//handeling exception
		
		for(int i=0; i<5; i++) {
			
			Thread.sleep(500);					//the thread spleeps for 5 millisecond
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException{		//main method
		// instantiating objects
		ThreadTest1 obj1 = new ThreadTest1();
		ThreadTest1 obj2 = new ThreadTest1();
		ThreadTest1 obj3 = new ThreadTest1();
		
		//invoking run method
		obj1.run();
		obj2.run();
		obj3.run();
	}
}
