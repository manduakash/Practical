package fileHandeling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExample {
	public static void main(String[] args) throws IOException {
		
		//instantiating FileOutputStream objects
		FileOutputStream obj1 = new FileOutputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt");
		FileOutputStream obj2 = new FileOutputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\sample2.txt");
		
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		byteArray.write(65);
		byteArray.writeTo(obj1);
		byteArray.writeTo(obj2);
		byteArray.close();
		System.out.println("Done");
		
	}
}
