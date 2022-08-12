
interface FunctionalInterface{
	int add(int a, int b);
}
public class LamdaFunctionDemo {
	public static void main(String[] args) {
		FunctionalInterface obj = (a,b)-> {return (a+b);};
		
		System.out.println("Output: "+obj.add(40, 50));
	}
}
