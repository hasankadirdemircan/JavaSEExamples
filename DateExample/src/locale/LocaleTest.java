package locale;

import java.util.Locale;

public class LocaleTest {
		
	public static void main(String[] args) {
		Locale [] locales = Locale.getAvailableLocales();
		
		for(Locale locale : locales) {
			System.out.println(locale); //locale dil ayarlarini yazdirir.
		}
	}
}
