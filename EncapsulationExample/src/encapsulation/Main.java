package encapsulation;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("Hasan Kadir");
		person.setSurname("Demircan");
		person.setAge(23);
		
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		
	}
}
