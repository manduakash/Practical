//@Author Akash Singh
//MULTIPLICATION OF TWO NUMBERS

import javax.swing.*; //importing GUI dialog box packages

class mult{
	//main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame(); // using JFrame class for GUI dialog boxes
		
		//taking input from user
		String a = JOptionPane.showInputDialog(jFrame, "Tyepe 1st number for multiplication"); 
		String b = JOptionPane.showInputDialog(jFrame, "Type 2nd number for multiplication"); 
		
		//changing data type of input variables
		int a_Int = Integer.parseInt(a);
		int b_Int = Integer.parseInt(b);
		
		//output
		JOptionPane.showMessageDialog(jFrame,"Multiplication of "+ a + " and "+ b + " = " + (a_Int*b_Int));
	}
}
