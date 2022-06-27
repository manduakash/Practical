//@Author Akash Singh
//even or odd number checking program

import java.util.Scanner;


public class OddEven{
	//main method
	public static void main(String[] args) {
		
		//taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for checking odd or even number");
		int n = scan.nextInt();
		
		//logic
		if (n%2==0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
	
    }
}