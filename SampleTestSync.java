package thread;

class SampleTest {
	synchronized void print(int num) {
		for(int i=1; i<=5; i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}
}

class ThreadTest extends Thread{
	SampleTest t;
	public ThreadTest(SampleTest t) {	//I have made changes in this line
		this.t=t;						//setting argument intput to instance reference 't'
	}
	public void run() {
		t.print(3);
	}
}


class ThreadTest1 extends Thread{
	SampleTest t;
	public ThreadTest1(SampleTest t) {	//I have made changes in this line
		this.t=t;						//setting argument intput to instance reference 't'
	}
	public void run() {
		t.print(5);
	}
}

public class SampleTestSync{
	public static void main(String[] args) {	//main method
		//instantiating objects
		SampleTest s = new SampleTest();
		ThreadTest t = new ThreadTest(s);	//passing the reference of s into constructor
		ThreadTest1 t1 = new ThreadTest1(s);	//passing the reference of s into constructor
		
		t.start();
		t1.start();
	}
}


