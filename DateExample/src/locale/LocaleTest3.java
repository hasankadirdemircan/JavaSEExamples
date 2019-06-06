package locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest3 {

	public static void main(String[] args) {
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormat.format(date)); //varsayilen sistem turkce oldugu icin default turkiye standartinde tarihi yazar.
		
		Locale locGE = Locale.GERMANY;
		DateFormat dateFormatGE = DateFormat.getDateInstance(DateFormat.FULL, locGE);
		System.out.println(dateFormatGE.format(date)); //alman dilinde ve alman standartinda tarihi yazar.
		
	}
}
