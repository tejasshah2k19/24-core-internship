import java.util.Scanner;

class JBMenu {
	int choice;
	int qty;
	int bill = 0;
	Scanner scr = new Scanner(System.in);

	void menu() {

		System.out.println("1 For Dabeli(25Rs)");
		System.out.println("2 For VadaPav(30Rs)");
		System.out.println("3 For CholeKulche(80Rs)");
		System.out.println("Enter Choice....");
		choice = scr.nextInt(); // 3
		System.out.println("Enter Qty:");
		qty = scr.nextInt(); // 10

		if (choice == 1) {
			bill = 25 * qty;
		} else if (choice == 2) {
			bill = 30 * qty;
		} else if (choice == 3) {
			bill = 80 * qty;
		} else {
			System.out.println("Invalid Choice PTA!!!");
		}

		System.out.println("Bill : " + bill);

	}
}

public class JB {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int choice;
		int qty;
		int bill = 0;

		System.out.println("1 For Dabeli(25Rs)");
		System.out.println("2 For VadaPav(30Rs)");
		System.out.println("3 For CholeKulche(80Rs)");
		System.out.println("Enter Choice....");
		choice = scr.nextInt(); // 3
		System.out.println("Enter Qty:");
		qty = scr.nextInt(); // 10

		if (choice == 1) {
			bill = 25 * qty;
		} else if (choice == 2) {
			bill = 30 * qty;
		} else if (choice == 3) {
			bill = 80 * qty;
		} else {
			System.out.println("Invalid Choice PTA!!!");
		}

		System.out.println("Bill : " + bill);

	}
}
