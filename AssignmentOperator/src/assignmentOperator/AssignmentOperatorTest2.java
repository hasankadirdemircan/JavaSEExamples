package assignmentOperator;

class Employee {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}

public class AssignmentOperatorTest2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setAge(30);
		employee1.setName("hasan");
		System.out.println("---Employee1---");
		System.out.println(employee1);
		
		AssignmentOperatorTest2 assign = new AssignmentOperatorTest2();
		assign.changeEmployee(employee1);
		System.out.println("---Employee1---");
		System.out.println(employee1);
		
	}
	
	public void changeEmployee(Employee employee) {
		Employee employee2 = new Employee();
		employee2.setAge(50);
		employee2.setName("kadir");
		employee = employee2;
//		
		System.out.println("---Employee1---");
		System.out.println(employee);
		
		System.out.println("---Employee2---");
		System.out.println(employee2);
		
	}
}
