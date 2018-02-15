package access.modifiers;

public class LevelTestSamePackage {

	public static void main(String[] args) {
		
		AccessLevel accessLevel = new AccessLevel();
		
		System.out.println(accessLevel.publicString());
		System.out.println(accessLevel.defaultString());
		System.out.println(accessLevel.protectedString());
		
		//If we try to compile UseARoo, we get a compiler error.
		//Because ; 
		//A private member is invisible to any code
		//outside the member's own class.
		System.out.println(accessLevel.privateString());
		
	}
}
