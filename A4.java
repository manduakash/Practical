
public interface TestInterface {
	void print();
}

class A4 implements TestInterface{
	public void print() {
		System.out.println("Hello guys...");
	}
	
	public static void main(String[] args) {
		A4 obj = new A4();
		obj.print();
	}
	
}
