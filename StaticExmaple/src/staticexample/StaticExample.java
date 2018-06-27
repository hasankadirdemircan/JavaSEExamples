package staticexample;

public class StaticExample {

	static int number =500;
	
	public static void main(String[] args) {
		//static bir methodtan static bir variable erisilebilir.
		System.out.println(number);
		//static bir methodtan static methoda erisim icin obje'ye gerek yoktur.
		testStatic();
		//instance methodlar icin obje olusturmak zorundayiz.
		StaticExample instance = new StaticExample();
		instance.testInstance();
		
	}
	
	static void testStatic() {
		System.out.println("static method");
	}
	
	public void testInstance() {
		System.out.println("instance method");		
	}
}
