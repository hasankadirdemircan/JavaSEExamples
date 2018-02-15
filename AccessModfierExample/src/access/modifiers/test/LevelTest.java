package access.modifiers.test;

import access.modifiers.AccessLevel;

public class LevelTest {

	public static void main(String[] args) {
		
		AccessLevel accessLevel = new AccessLevel();
		
		System.out.println(accessLevel.publicString());
		
		/*If we try to compile LevelTest, we get a compiler error.
		 * Because;
		 * when we created object to different package
		 *   A private member is invisible
		 *   A protected member is invisible
		 *   A default member is invisible 
		 */
		 
	
		System.out.println(accessLevel.privateString()); //error
		System.out.println(accessLevel.proctectedString());//error
		System.out.println(accessLevel.defaultString());//error
		
	}
}
