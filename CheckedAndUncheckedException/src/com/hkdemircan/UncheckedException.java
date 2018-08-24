package com.hkdemircan;

public class UncheckedException {

	public static void main(String[] args) {
		String name = null;
		//kotu yaklasim.
		try {
			if(name.equals("kadir")) {
				System.out.println("name : kadir");
			}
		}catch(NullPointerException e) {
			System.out.println("catch!");
			// dogru bir yaklasim degil.
			// NullPointerException yakalama.
			//Bu gibi unchecked exception'larda kodu fix yapmaya calisacagiz.
		}
		
		// guzel bir yaklasim.
		if(name != null && name.equals("kadir")) {
			System.out.println("name : kadir");
		}
		
		//En iyi  yaklasim.
		if("kadir".equals(name)) {
			System.out.println("name : kadir");
		}
		
	}
}
