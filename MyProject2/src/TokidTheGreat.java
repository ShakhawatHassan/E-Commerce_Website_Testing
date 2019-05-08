//javaclass3
public class TokidTheGreat {

	public static void main(String[] args) {
		TokidTheGreat comp = new TokidTheGreat();
comp.compare (10,50);
	}

	void compare(int a, int b) {

		int number1 = a;
		int number2 = b;
		if (number1 > number2) {
			System.out.println(number1 + " is greater than " + number2);
		} else {
			System.out.println(number2 + " is greater than " + number1);
		}
	}
}