package assignmentOperator;

class Person {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class AssignmentOperatorTest {

	public static void main(String[] args) {
		Person person1 = new Person();
	
		person1.setAge(22);
		person1.setName("hasan");
		System.out.println("---Person1---");
		System.out.println(person1);
		
		
		Person person2 = new Person();
		person2 = person1;
		
		person2.setAge(30);
		person2.setName("kadir");
		System.out.println("---Person1 and Person2");
		System.out.println(person1);
		System.out.println(person2);
		
	}
	
}
