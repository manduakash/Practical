package fileHandeling;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter obj1 = new FileWriter("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt\\");
			obj1.write("Welcome to anudip foundation");
			FileReader obj2 = new FileReader("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt\\");
			
			int i = 0;							
			while((i=obj2.read()) != -1) {	//condition for reading file; if there is nothing in the file it will return '-1'
				System.out.print(((char)i));	//typecasting the int 'j' to char 
			}
			
			System.out.println("done");
			obj1.close();
			obj2.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
