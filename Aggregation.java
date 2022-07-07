class SqureClass{ 
	public int squre(int n) {
		return n*n;
	}
}

class Circle{
	SqureClass s = new SqureClass();
	double pi = 3.14;
	double area(int radius) {
		int squre = s.squre(radius);
		return pi*squre;
	}
}

public class Aggregation {
	public static void main(String args[]) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
