package overloaded;

class Calculator {
	
	public int Sum (int number1, int number2) {
		System.out.println("int int");
		return number1 + number2;
	}
	
	public float Sum(float number1, float number2) {
		System.out.println("float float");
		return number1 + number2;
	}
	
	public double Sum(double number1, double number2) {
		System.out.println("double double");
		return number1 + number2;
	}
	
	public int Sum(byte number1, byte number2) {
		System.out.println("byte byte");
		return number1 + number2;
	}
}

public class TestOverloaded {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.Sum(10, 15); //int int
		calculator.Sum(10, 15.0);//int double
		calculator.Sum(10, 15.0f);//int float
		calculator.Sum(10.0f, 15.0f);//float float		
		calculator.Sum((byte)10, (byte)15);//byte byte
		
	}
}
