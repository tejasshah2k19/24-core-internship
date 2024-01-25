import java.util.Scanner;

public class InhTask {

	public static void main(String[] args) {
		Regular r = new Regular();
		r.getData();
		r.display();
	}
}

class Staff {

	Scanner scr = new Scanner(System.in);
	String code;
	String name;

	void getData() {
		System.out.println("Enter Code and Name");
		code = scr.next();
		name = scr.next();
	}

	void display() {
		System.out.println("Code : " + code);
		System.out.println("Name : " + name);
	}

}

class Teacher extends Staff {
	String subject;
	String publication;

	void getData() {
		System.out.println("Enter Subject and  Publication");
		subject = scr.next();
		publication = scr.next();
	}

	void display() {
		System.out.println("Subject : " + subject);
		System.out.println("Publication : " + publication);
	}
}

class Typist extends Staff {
	int speed;

	void getData() {
		super.getData();
		System.out.println("Enter Speed");
		speed = scr.nextInt();
	}

	void display() {
		super.display();
		System.out.println("Speed : " + speed);
	}
}

class Officer extends Staff {
	String grade;

	void getData() {
		System.out.println("Enter Grade");
		grade = scr.next();
	}

	void display() {
		System.out.println("Grade : " + grade);
	}
}

class Regular extends Typist {
	int salary;

	void getData() {
		super.getData();
		System.out.println("Enter Salary");
		salary = scr.nextInt();
	}

	void display() {
		super.display();
		System.out.println("Salary : " + salary);
	}
}

class Casual extends Typist {
	int dailyWages;

	void getData() {
		System.out.println("Enter DailyWages");
		dailyWages = scr.nextInt();
	}

	void display() {
		System.out.println("DailyWages : " + dailyWages);
	}
}
