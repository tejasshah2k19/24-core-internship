
public class StringDemo {

	
	public static void main(String[] args) {
		
		
		String s; // lang 
					// import java.lang.*; 
		
		String name = "rock";
		String lastName = new String("patel");
	
		name = "jack";
		
		int len = name.length();
		System.out.println(len);
		
		System.out.println(name.length());
		
		name = "          ";
		name = name.trim(); 
		if(name.length() == 0 ) {
			System.out.println("Please Enter Name");
		}else {
			System.out.println(name.length());
		}
	
	
		String email = "jack@gmail.com"; 
		String dbEmail = new String("JACK@gmail.com"); 
		
		
		if(email.equals(dbEmail ) ) { //values -> case sensitive 
			System.out.println("BothAreSame");
		}else {
			System.out.println("BothAreNotSame");
		}
	
		
		// equals -> case ignore 
		
		
		//email -> lower case 
		//dbEmail -> lower case 
		
		email = email.toLowerCase(); 
		dbEmail = dbEmail.toLowerCase(); 
		
		if(email.equals(dbEmail ) ) { //values -> case sensitive 
			System.out.println("BothAreSame");
		}else {
			System.out.println("BothAreNotSame");
		}
	
		
		//convert string data into upper case 
		
		email = email.toUpperCase(); 
		dbEmail = dbEmail.toUpperCase(); 
		
		if(email.equals(dbEmail ) ) { //values -> case sensitive 
			System.out.println("BothAreSame");
		}else {
			System.out.println("BothAreNotSame");
		}
		
		
		String data = "Sun,Mon,Tue,Wed" ;
		String data2 = "jony jony yes papa";//jony 
		String data3 = "3456789,9876545678,98765456789,987445678";
		
		
		String x[] = data.split(",");//Sun Mon Tue Wed  
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		
		System.out.println("Split => ");
		for(String val:x) {
			System.out.println(val);
		}
		
		
		
		
	
	
	
	}
	
}
