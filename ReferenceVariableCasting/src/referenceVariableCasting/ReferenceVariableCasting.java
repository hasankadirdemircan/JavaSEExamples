package referenceVariableCasting;

class Animal {
	
	public void eat() {
		System.out.println("animal class eat");
	}

}

class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("dog class eat");
	}

	public void run() {
		System.out.println("dog class run");
	}
}

class Cat extends Animal{
	
}

public class ReferenceVariableCasting {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
//		animal.run();// does not class found.
		
		//Dog IS-A Animal
		Dog dog = (Dog) animal;
		dog.eat();
		dog.run();
		
		Cat cat = new Cat();
		
		//upcasting
		Animal animal1 =(Animal) cat;
		//Animal animal1 = cat;
		animal1.eat();
		
		Animal animal2 = new Animal();
//		Dog dog1 = (Dog) animal2; //runtime error -> java.lang.ClassCastException
	}
}
