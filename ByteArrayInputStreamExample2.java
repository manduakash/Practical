package fileHandeling;
import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample2 {
	public static void main(String[] args) {
		byte[] arr = {65, 37, 70, 39, 81};
		ByteArrayInputStream obj = new ByteArrayInputStream(arr);
		
		//while loop
		int i = 0;							
		while((i=obj.read()) != -1) {	//condition for reading file; if there is nothing in the file it will return '-1'
			char ch = ((char)i);
			System.out.println("ASCII character "+i+ " value is "+ch);	//typecasting the int 'j' to char type
		}
		
	}
}
