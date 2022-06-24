/*
@Author AKASH SINGH
*/

//JAVA PROGRAM TO GET A INPUT FROM USER

import javax.swing.*; //importing packages for GUI dialog box
import java.util.Calendar; //importing calendar 
import java.util.GregorianCalendar; //importing GregorianCalendar 


class GetInput{
	//main method
	public static void main(String args[]){
		
		
		JFrame jFrame = new JFrame(); //using JFrame class for GUI dialog box
		GregorianCalendar time = new GregorianCalendar(); //using GregorianCalendar class for taking current time
		
		//taking user input from a GUI dialog box
		String getName = JOptionPane.showInputDialog(jFrame, "Type your name in the box");  
		
		//storing current time in a hour variable
		int hour = time.get(Calendar.HOUR_OF_DAY); 
		
		//greeting logic
		String greeting = null;
		if (hour >= 0 && hour < 12) //good morning logic
			greeting = "Good morning!";
		else if (hour >= 12 && hour < 17) //good afternoon logic
			greeting = "Good afternoon!";
		else if (hour >= 17 && hour < 21) //good evening logic
			greeting = "Good evening!";
		else if (hour >= 21 && hour <=24) //good night logic
			greeting = "Good night!";
		
		//output
		JOptionPane.showMessageDialog(jFrame, "Hello " + getName + "... " + greeting); //concatinating message, username and greeting
	}
}
