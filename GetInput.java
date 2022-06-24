/*
@Author AKASH SINGH
*/

//JAVA PROGRAM TO GET A INPUT FROM USER

import javax.swing.*; //importing packages for GUI dialog box
import java.util.Calendar;
import java.util.GregorianCalendar;


class GetInput{
	//main method
	public static void main(String args[]){
		
		
		JFrame jFrame = new JFrame();
		GregorianCalendar time = new GregorianCalendar();
		
		//taking input from user
		String getName = JOptionPane.showInputDialog(jFrame, "Type your name in the box"); 
		
		//storing time in a variable
		int hour = time.get(Calendar.HOUR_OF_DAY); 
		
		//greeting logic
		String greeting = null;
		if (hour >= 0 && hour < 12)
			greeting = "Good morning!";
		else if (hour >= 12 && hour < 17)
			greeting = "Good afternoon!";
		else if (hour >= 17 && hour < 21)
			greeting = "Good evening!";
		else if (hour >= 21 && hour <=24)
			greeting = "Good night!";
		
		//output
		JOptionPane.showMessageDialog(jFrame, "Hello " + getName + "... " + greeting);
	}
}