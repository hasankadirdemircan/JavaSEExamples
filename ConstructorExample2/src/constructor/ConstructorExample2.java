package constructor;

class Calculator {
	
	private int number1;
	private int number2;
	
	public Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
}

class Sum extends Calculator {

	public Sum(int number1, int number2) {
		super(number1, number2);
		sum(number1,number2);
	}
	
	public void sum(int number1, int number2) {
		System.out.println("Sum : " + number1 + number2);
	}
	
}
public class ConstructorExample2 {

	public static void main(String[] args) {
		Sum summ = new Sum(3,5);
	}
}
