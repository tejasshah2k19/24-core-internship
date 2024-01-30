
public class Book {

	String author;// null
	String title;// null
	int publishYear; // 0
	int price;// 0
	// 0.0
	// false

	// constructor

	// implicit - default - no arg

	// explicit
	Book() {
		publishYear = 2024;
	}

	Book(int y) {// 2030
		this.publishYear = y;
	}

	Book(int y, String title) {// 2030
		publishYear = y;
		this.title = title;
	}

	void getData() {

	}

	void printInfo() {
		System.out.println(author);
		System.out.println(title);
		System.out.println(publishYear);
		System.out.println(price);
	}

	public static void main(String[] args) {

		Book b = new Book();
		b.getData();
		b.printInfo();

		Book x = new Book(2030);
		x.printInfo();

		Book y = new Book(2035, "C");
		y.printInfo();
	}
}
