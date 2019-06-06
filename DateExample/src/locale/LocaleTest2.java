package locale;

import java.util.Locale;

public class LocaleTest2 {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale); //locale ayarimizi yazdirir.
		
		Locale localeTR = new Locale("tr", "TR");
		System.out.println(localeTR.getCountry());
		System.out.println(localeTR.getLanguage());
		System.out.println(localeTR.getDisplayLanguage());
	}
}
