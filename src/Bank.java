
public class Bank {

	// class -> variable , method

	String customerName;
	int balance;
	String userName;
	String password;

	void accountOpen() {
		System.out.println("Enter Your Name");
		customerName = "ram";
		System.out.println("Enter Your UserName");
		userName = "ram123";
		System.out.println("Enter Your Password");
		password = "pass123";
		System.out.println("Enter your Balance");
		balance = 99999;
	}

	// variable -> data name -> store the value
	// customerName ->

	// class -> first letter upper case , if it has second word , then first letter
	// of second word should be in upper case

	// variable -> first letter lower case,if it has second word , then first letter
	// of second word should be in upper case

	// method -> first letter lower case,if it has second word , then first letter
	// of second word should be in upper case

	public static void main(String[] args) {
		System.out.println("This is my First Program...");

		Bank b = new Bank();
		
		b.accountOpen();
		//object -> property -> dot operator 
		// GC ->

	}

}
