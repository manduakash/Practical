//@Author Akash Singh
// Achieving the encapsulate using private data members, getters and setters

class Account{
	
	//private data members
	private String name;
	private int accountNumber;
	private String email;
	private int amount;
	
	//for name
	public String getName() {	// getting name
		return name;
	}
	public void setName(String name) {	// setting name
		this.name = name;
	}
	
	//for account number
	public int getAccountNumber() { 	//getting Account number
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {	//setting Account number
		this.accountNumber = accountNumber;
	}
	
	//for email
	public String getEmail() {	//getting email
		return email;
	}
	public void setEmail(String email) {	//settign email
		this.email = email;
	}
	
	//for amount
	public int getAmount() {	// getting amount
		return amount;
	}
	public void setAmount(int amount) {		// setting amount
		this.amount = amount;
	}
	
	
}
public class Bank_Encapsulate {

	public static void main(String[] args) { //main method
		// creating instance of account
		Account obj = new Account();
		
		// setting values using setter methods
		obj.setName("Akash Singh");
		obj.setAccountNumber(123456789);
		obj.setEmail("akashsingh@gmail.com");
		obj.setAmount(10000000);
		
		// getting values using getter methods
		System.out.println("Name is "+obj.getName());
		System.out.println("Account number is "+obj.getAccountNumber());
		System.out.println("Email is "+obj.getEmail());
		System.out.println("Amount is "+obj.getAmount());
	}

}
