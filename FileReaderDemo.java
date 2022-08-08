package fileHandeling;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\mandu\\OneDrive\\Desktop\\sample1.txt\\");
			
			int i = 0;							
			while((i=fr.read()) != -1) {	//condition for reading file; if there is nothing in the file it will return '-1'
				System.out.print(((char)i));	//typecasting the int 'j' to char 
			}
			System.out.print("done");
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
