package fileHandeling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {	//main method
		try {
			//creating object of stream and passing file obj. as argument
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt\\"));
			Student s = (Student)obj.readObject();	//deserializing object
			System.out.println("id: "+s.id+"\nname: "+s.name+"\nfees: "+s.fees);
			obj.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
