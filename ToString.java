
public class ToString {
	int rollno;
	String name, address;
	
	ToString(int r, String n, String a){
		this.rollno=r;
		this.name=n;
		this.address=a;
	}
	
	public String toString() {
		return super.toString();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString s1 = new ToString(1,"ram","mumbai");
		ToString s2 = new ToString(2,"karan","delhi");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
