package constructor;

class Employee {
	
	Employee(){
		this(1000);
		System.out.println("no-arg Employee constructor");
	}
	
	Employee(int salary){
		super();
		System.out.println("Employee Salary : " + salary + " $");
	}
	//Constructor overloaded
}


public class ConstructorTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		System.out.println("Main");
	}
}

