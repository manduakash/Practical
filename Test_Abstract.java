abstract class TestAbstract{
	TestAbstract(){
		System.out.println("Abstract class is created");
	}
	
	abstract void run();
	
	void changeSpeed() {
		System.out.println("Speed changed");
	}
}

class Child extends TestAbstract{
	void run() {
		System.out.println("Running");
	}
}
public class Test_Abstract {

	public static void main(String[] args) {
		
		TestAbstract obj = new Child();
		obj.run();
		obj.changeSpeed();

	}

}
