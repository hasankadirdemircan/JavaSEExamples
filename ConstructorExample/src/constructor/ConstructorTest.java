package constructor;

class SuperClass {
	
	SuperClass(){
		this(5);
		System.out.println("SuperClass no arg constructor.!");
	}
//overloaded
	SuperClass(int number){
		System.out.println("SuperClass int constructor.!");
	}
}

class SubClass extends SuperClass {
	
	SubClass() {
		this(10);
		System.out.println("SubClass no arg constructor.!");
	}
//overloaded
	public SubClass(int i) {
		System.out.println("SubClass int constructor.!");
	}
	
	
}
public class ConstructorTest  {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		//reference variable
		//local variable
		//temp type SubClass(left)
		//object type SubClass (right)
		System.out.println("main.!");
	}
	
}
