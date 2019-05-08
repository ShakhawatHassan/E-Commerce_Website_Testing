package my_java;

public class ClassA {
	// inside the class, but not inside the method(instance method)

	public static void main(String[] args) {

		ClassA c = new ClassA();
		int number1 = c.numberint();
		float number2 = c.numberfloat();
		System.out.println("This is the value of number:" + number1);
		System.out.println("This is the value of number:" + number2);

		// I'm multiplying here
		int multiply = c.sum();
		System.out.println("The sum of two numbers:" + multiply);
		// I'M adding here for any variables

		int numberThree = c.addition2(22, 50);
		System.out.println("Addition of 22 and 50:" + numberThree);

		// I'm adding 3 variables here
		int numberFour = c.addition3(10, 20, 30);
		System.out.println("Addition of 10, 20 and 30:" + numberFour);

	}

	float numberfloat() {
		float a;
		a = 10;
		return a;
	}

	int numberint() {
		int a;
		a = 20;
		return a;
	}

	int sum() {
		int numberOne = 100;
		int numberTwo = 3000;
		int numberThree = numberOne * numberTwo;
		return numberThree;
	}

	int addition2(int a, int b) {
		int num1 = a;
		int num2 = b;
		int num3 = a + b;
		return num3;
	}

	int addition3(int a, int b, int c) {
		int numb1 = a;
		int numb2 = b;
		int numb3 = c;
		int numb4 = a + b + c;
		return numb4;
	}

}