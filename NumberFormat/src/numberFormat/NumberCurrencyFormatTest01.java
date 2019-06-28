package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberCurrencyFormatTest01 {

	public static void main(String[] args) {
		NumberFormat numberCurrenyGE = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		double salary = 1124.567;
		
		System.out.println(numberCurrenyGE.format(salary));
		
		NumberFormat numberCurrenyUK = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(numberCurrenyUK.format(salary));
		
		NumberFormat nCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nCurrency.format(salary));
		
		NumberFormat numberCurrenyItaly = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(numberCurrenyItaly.format(salary));
		
	}
}
