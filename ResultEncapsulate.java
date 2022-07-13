//@Author Akash Singh
import java.util.Scanner;

class ResultEncapsulate{
	
	//private data members for encapsulate
	private String name;
	private String userId;
	private String password;
	
	//public data members
	public int sub1, sub2, sub3, sub4, sub5, totalMarks=500, sum; 
	
	// for name
	public void setName(String name) {		// setter for name
		this.name = name;
	}
	public String getName() { 	// getter for name
		return name;
	}
	
	// for userId
	public void setUserId(String userId) {  //setter for user id
		this.userId = userId;
	}
	public String getUserId() {		//getter for user id
		return userId;
	}
	
	// for password
	public void setPassword(String password) {	//setter for password
		this.password = password;
	}
	public String getPassword() { 	//getter for password
		return password;
	}
	
	// for total marks 
	public void setObtainMarks(int sub1, int sub2, int sub3, int sub4, int sub5) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;	
	}
	public int getObtainMarks() { 	// getter for Obtain marks
		this.sum = this.sub1+this.sub2+this.sub3+this.sub4+this.sub5;
		return this.sum;
	}
	
	//for percentage method
	public double getPercentage() {	// getter for percentage
		return (this.sum/this.totalMarks)*100;
	}
}
public class Result_Encapsulate {

	public static void main(String[] args) {	//main class
		// creating objects
		ResultEncapsulate obj = new ResultEncapsulate();
		Scanner scan = new Scanner(System.in);
		
		//taking inputs using setters
		System.out.println("Write your name...");
		obj.setName(scan.nextLine());			//setter
		System.out.println("Write your user Id...");
		obj.setUserId(scan.nextLine());			//setter
		System.out.println("Write your password...");
		obj.setPassword(scan.nextLine());		//setter
		
		System.out.println("Write your marks for your 5 subjects...");
		//taking marks as input
		int sub1 = scan.nextInt();
		int sub2 = scan.nextInt();
		int sub3 = scan.nextInt();
		int sub4 = scan.nextInt();
		int sub5 = scan.nextInt();
		obj.setObtainMarks(sub1, sub2, sub3, sub4, sub5); // invoking the setter
		
		//output using getters
		System.out.println("Student Name is "+obj.getName());
		System.out.println("User Id is "+obj.getUserId());
		System.out.println("Password is "+obj.getPassword());
		System.out.println("User obtain total marks = "+ obj.getObtainMarks());
		System.out.println("Here it is your percentage = "+ obj.getPercentage()+"%");
		scan.close();
	}
}
