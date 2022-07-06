//@author akash singh
//Aggregation
public class Address {
	String city, state, country;
	public Address(String city, String state, String country) { // constructor
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Student1 { // another class
	int id;
	String name;
	Address address;	//aggregation
	
	public Student1 (int id, Address address, String name) { // constructor 
		this.id=id;
		this.address=address;
		this.name=name;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
}

public class Student {
	public static void main(String[] args) { //main method
		
		//creating objects of Address class
		Address a1 = new Address("gh","kk","ii");
		Address a2 = new Address("dh","jd","ndn");
		
		//creating objects of student1 class
		Student1 s1 = new Student1(68,a1,"hasan");
		Student1 s2 = new Student1(89,a2,"Akash");
		
		//output
		s1.display();
		s2.display();
	}

}
