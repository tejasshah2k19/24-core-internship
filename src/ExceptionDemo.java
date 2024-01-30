import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Enter two numbers");
			Scanner scr = new Scanner(System.in);
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b; // exception throw -> jre
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second value");
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only Whole Digits");
		} catch (Exception e) {
			System.out.println("Something went wrong PTA");
			e.printStackTrace();
		}
	}
}
//  error ? 
//		1) compile time error -> javac  
//		2) run time error -> exception 
//