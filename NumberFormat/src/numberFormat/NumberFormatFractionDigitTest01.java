package numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatFractionDigitTest01 {

	public static void main(String[] args) {
		double salary = 1234.56789;
		System.out.println(salary); //girilen degerin hepsini yazar.
		//
		NumberFormat nf = NumberFormat.getInstance(); //nokta ve virgule uygun yazar.
		System.out.println(nf.format(salary));
		
		System.out.println(nf.getMaximumFractionDigits());//virgülden sonraki maximum basamak sayisi
		System.out.println(nf.getMinimumFractionDigits());
		//
		nf.setMaximumFractionDigits(5);//virgülden sonra maximum basamak sayisini 5 yapiyoruz.
		nf.setMinimumFractionDigits(5);
		System.out.println(nf.format(salary));
		System.out.println(nf.format(150));
		
		try {
			System.out.println(nf.parse("1234,567"));
			nf.setParseIntegerOnly(true);//sadece integer alaninin alinma ozelligini true yapiyoruz.
			System.out.println(nf.parse("1234,567")); //sadece integer alanini yazar.
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
