import java.util.Scanner;

public class Employee {

	String name; // null
	int salary;// 0
	String email;
	String password;
	char gender;// null char
	String dob; // 22-apr-1990 Date

	void enroll() {

		Scanner scr = new Scanner(System.in);

		//from where we have to scan ? 
		//keyboard -> System.in 
		

		System.out.println("Enter Name");
		name = scr.next();// String scan
		System.out.println("Enter Email");
		email = scr.next();
		System.out.println("Enter Password");
		password = scr.next();
		System.out.println("Enter Salary");
		salary = scr.nextInt(); // nxtFloat() nextDouble()
		System.out.println("Enter DoB");
		dob = scr.next();
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Salary : " + salary);
		System.out.println("DOB : " + dob);
	}

	public static void main(String[] args) {
		Employee e = new Employee();

		e.enroll();
		e.display();
	}
}


class A{
	
}

class B{
	
}



