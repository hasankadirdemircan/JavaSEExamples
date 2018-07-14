package variablaScope;

public class VariableScope {

	//brcause staticVariable is declared outside of any method, it is in scope to all methods,
	//any method can access staticVariable
	static int staticVariable;
	
	int instanceVariable = 30;
	
	public static void main(String[] args) {
		
		staticVariable = 50;
		System.out.println("staticVariable first value : " + staticVariable); //output: 30
		
		doSomething();
		System.out.println("staticVariable second value : " + staticVariable);//output: 10
	}
	
	static void doSomething() {
		staticVariable = 10;
	}
	
	static void doSomethingLocally() {
		
		//because y is declared inside of tihs method, it is local to this method,
		//no other method has access to localVariable.
		int localVariable = 100;
	}
}

//static variable > instance variable > local variable
