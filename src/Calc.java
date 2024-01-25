import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
//		BasiCalc basicCalc = new BasiCalc();
//		basicCalc.add();
//		basicCalc.sub();
//		basicCalc.mul();
//		
		SciCalc sciCalc = new SciCalc();
		sciCalc.add();
		sciCalc.sub();
		sciCalc.mul();

		sciCalc.sqrt();
		sciCalc.cube();
		sciCalc.sin();
		sciCalc.power();
	}
}

class BasiCalc {

	int a, b, ans;// instance variable
	Scanner scr = new Scanner(System.in);

	void input() {
		System.out.println("Enter Two numbers");
		a = scr.nextInt();// scan integer data
		b = scr.nextInt();
	}

	void add() {
		input();
		ans = a + b;
		System.out.println("Addition = " + ans);
	}

	void sub() {
		input();
		ans = a - b;
		System.out.println("Subtraction = " + ans);
	}

	void mul() {
		input();
		ans = a * b;
		System.out.println("Multiplication = " + ans);
	}

}

class SciCalc extends BasiCalc {
	int num;
	int num2;
	Scanner scr = new Scanner(System.in);

	void input() {
		System.out.println("Enter number");
		num = scr.nextInt();
	}

	void inputTwonum() {
		System.out.println("Enter two number");
		num = scr.nextInt();
		num2 = scr.nextInt();
	}

	void sqrt() {
		input();
		double ans = Math.sqrt(num);
		System.out.println("Sqrt of " + num + " = " + ans);
	}

	void cube() {
		input();
		int ans = num * num * num;
		System.out.println("cube of " + num + " = " + ans);
	}

	void sin() {
		input();
		double ans = Math.sin(num);
		System.out.println("Sin of " + num + " = " + ans);
	}

	void power() {
		inputTwonum();// num num2
		// 2 4
		// 4 5
		double ans = Math.pow(num, num2);
		System.out.println("Pow of " + num + " ^ " + num2 + " = " + ans);

	}
}