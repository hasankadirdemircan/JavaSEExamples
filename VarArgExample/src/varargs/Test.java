package varargs;

public class Test {

	public void VarArgs(int ...number) {
		
		for(int i : number) {
			System.out.println(i);
		}
		System.out.println("******");
	}
}
