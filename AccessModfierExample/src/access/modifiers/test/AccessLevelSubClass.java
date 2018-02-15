package access.modifiers.test;

import access.modifiers.AccessLevel;

public class AccessLevelSubClass extends AccessLevel {

	public void testLevel() {
		System.out.println(publicString());
		System.out.println(protectedString());
		
		/* If we try to compile AccessLevelSubClass, we get a compiler error.
		 Because;
		 1) A private member is invisible to any code
		 2) A default member is invisible to sub class
		*/
		System.out.println(defaultString);
		System.out.println(privateString);
		
	}
}
