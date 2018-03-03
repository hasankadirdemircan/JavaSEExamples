package abstractclass;

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager("Manager", 3);
		Employee employee = new Employee("Employee", 8);
		
		//***Manager Detail***
		System.out.println(manager.workerName + " : " + manager.getSalary() + "$");
		
		//***Employee Detail***
		System.out.println(employee.workerName + " : " + employee.getSalary() + "$");
	}
}
