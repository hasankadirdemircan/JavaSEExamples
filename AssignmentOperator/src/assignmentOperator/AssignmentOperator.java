package assignmentOperator;

public class AssignmentOperator {
	//javada assignment operator -> = operatoru demektir.
	public static void main(String[] args) {
		
		Animal animalRef = new Animal();
		Animal animal = animalRef; // obje assignment ettik, yani AnimalRef ve animal ayni yeri gosteriyor.
			
		int number = 100;
		byte b = 10; // 10->integer literal, decimal literal ->int
		
		System.out.println(b);
		
		byte number1 =  5; //burada otomatik casting islemi var int -> byte
		byte number2 = 10;
		System.out.println(number1);
		
		byte number3 = (byte) (number1 + number2);//casting mecburi
		System.out.println(number3);
		
		double doubleLocal1 = 5.4;
		double doubleLocal2 = 3.3;
		
		int intVariable = (int) (doubleLocal1 + doubleLocal2); // casting mecburi, veri kaybi riski var.
		int intLocal1 = 3;
		int intLocal2 = 5;
		double doubleVariable = intLocal1 + intLocal2; // otomatik cast ediyor. Veri kaybi riski yok.
	}
	
}

class Animal {
	
	
}
	
