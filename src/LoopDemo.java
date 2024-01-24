
public class LoopDemo {

	public static void main(String[] args) {
		// i++ => i = i + 1
		for (int i = 1; i <= 10; i = i + 1) {
			if (i % 2 == 0) {
				System.out.print("-" + i + " ");
			} else {
				System.out.print(i + " ");
			}
		}

		// num = 5

		// 5 10 15 20 25 30 35 .... 50

		System.out.println("\n\n");
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(5 + " * " + i + " = " + 5 * i);

		}

		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15
		// ...
		// 5 * 10 = 50

		// 0 1 1 2 3 5 8 13
		// a b c
		//
		int a = 0;
		int b = 1;
		int c = a + b;

		System.out.print(a + " " + b + " " + c + " ");

		for (int i = 1; i <= 5; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + " ");// 2 3
		}
		// goto line 39

	}
}

//1 3 5 7 9 

//1 -2 3 -4 5 -6  7 -8 9 -10 
