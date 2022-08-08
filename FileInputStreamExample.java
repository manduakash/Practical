package fileHandeling;
import java.io.FileInputStream;

public class FileInputStreamExample {	//main class
	
	public static void main(String[] args) { //main method
		try {
			// instantiating the FileInputStream object and passing the address of the file
			FileInputStream obj = new FileInputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\text1.txt");
			
			int i = obj.read();
			System.out.println(((char)i));
			
			//while loop
			int j = 0;							
			while((j=obj.read())!=-1) {	//condition for reading file; if there is nothing in the file it will return '-1'
				System.out.print(((char)j));	//typecasting the int 'j' to char type
			}
			obj.close();			//closing the file
			
		} catch (Exception e) {		//handeling the exception
			System.out.println(e);
		}
	}
	
}
