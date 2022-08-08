package exceptionHandel;
import java.io.FileOutputStream;

public class FileOutputStreamExample {	//main class
	
	

	public static void main(String[] args) { //main method
		try {
			FileOutputStream obj = new FileOutputStream("C:\\Users\\mandu\\OneDrive\\Desktop\\text1.txt");
			obj.write(96);
			String s ="welcome to java world";
			byte b []= s.getBytes();
			
			obj.write(b);
			obj.close();
			System.out.println("khatam");
		} catch (Exception e) {		//handeling the exece
			System.out.println(e);
		}
	}
	
}
