package fileHandeling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization converts objects to a byte stream; we use it in order to send our object data one location to another location

	
	
	class Student implements Serializable{
		int id;
		String name;
		transient int fees; 	//transient keyword avoid the serialization for this data member
		
		public Student(int id, String name, int fees) {
			this.id=id;
			this.name=name;
			this.fees=fees;
			
		}
	}
	

public class SerializationDemo {
	public static void main(String[] args) {
		try {
			Student s = new Student(65, "akash", 2500);	//this obj. will convert into byte stream
			FileOutputStream file = new FileOutputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt\\");	//file object
			
			ObjectOutputStream obj = new ObjectOutputStream(file);	//this class help to converting 
			obj.writeObject(s);	//converting into stream and saving it to file location
			file.close(); //file closed
			System.out.println("serialization done, now check your file.");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
