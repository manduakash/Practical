//Example of interface
public interface Aa {
	void abc();
	void cde();
	void efg();
	void ghi();
}

abstract class Abc implements Aa{
	public void efg(){
		System.out.println("efg");
	}
}

class InterfaceDemo extends Abc{
	public void abc() {
		System.out.println("abc");
	}
	
	public void cde() {
		System.out.println("cde");
	}
	
	public void ghi() {
		System.out.println("ghi");
	}
	
	public static void main(String[] args) {
		InterfaceDemo h = new InterfaceDemo();
		h.abc();
		h.cde();
		h.efg();
		h.ghi();
	}
}
