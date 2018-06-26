package varargs;

public class VarArgTest {

	public static void main(String[] args) {
		
		Test test = new Test();
		test.VarArgs(1);
		test.VarArgs(1,2);
		test.VarArgs(1,2,3);
		
		int array[] = {4,5,6,7,8};
		test.VarArgs(array);
		
	}
	
}
