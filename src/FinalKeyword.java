
public class FinalKeyword {

	int abc = 10;
	int xyz;

	final int abcd = 10;// final variable must be initialized

	final String name;

	FinalKeyword() {
		name = "Gabbar";
	}

	void update() {
		final int iAmLocal = 420;
		abc = abc * 20;
		xyz = xyz / 20;
//		abcd = abcd + 50; //final variable must be reassign 
	}

	// final variable ---> constant variable

	public static void main(String[] args) {

	}
}

//final -> 
//class -> YES -> can not inherited 
//method -> YES  -> can not override 
//variable -> YES -> can not reassign 

//final 
class AQ {
	final void add() {
		// logic
	}
}

class BQ extends AQ {
	void sub() {
		// logic
	}

//	void add() {
//		// logic2
//	}
}
