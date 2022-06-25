//@Author AKASH SINGH

//DIVITION OF TWO NUMBERS
import javax.swing.*; //import for GUI dialog box


class div{
	//main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame(); //using jframe class for dialog boxes
	    
		String num1 = JOptionPane.showInputDialog(jFrame,"1st Number for divition"); //taking 1st number from user 
		String num2 = JOptionPane.showInputDialog(jFrame,"2nd Number for divition"); //taking 2nd number from user 
		
		//changing input data type string to float
		float num1F = Float.parseFloat(num1); 
		float num2F = Float.parseFloat(num2); 
		
		float res = num1F/num2F; //logic
	 	
	    //output
	    JOptionPane.showMessageDialog(jFrame,"Divition of " + num1 + " and " + num2 + " = " + res);
	}
}
