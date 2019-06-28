package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		double salary = 1567.678;
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(salary)); //bilgisayarın varsayilan Locale ülkesine göre işlem yapar.
		
		Locale localTR = new Locale("tr","TR"); //ulkenin para formatina gore islem yapmak icin.
		
		NumberFormat nfTR = NumberFormat.getInstance(localTR);
		System.out.println(nfTR.format(salary));
	}
}
