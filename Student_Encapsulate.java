class StudentEncapsulate{
	
	private String name; //private data member
	
	public String getName() {	//getter method for name
		return name;
	}
	public void setName(String name) {	//setter method for name
		this.name=name;
	}
	
}
public class Student_Encapsulate {
	public static void main(String[] args) {
		StudentEncapsulate obj = new StudentEncapsulate();
		obj.setName("Akash");	// setting the value
		System.out.println(obj.getName());	// getting the value
	}
}
