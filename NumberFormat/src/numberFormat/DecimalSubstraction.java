package numberFormat;

import java.math.BigDecimal;

public class DecimalSubstraction {

	public static void main(String[] args) {
		System.out.println(2.0 - 1.1);
		//Hesap kitap, para islemlerinde bigdecimal kullanilir, hatalar ile karsilasmamak icin
		BigDecimal decimal1 = new BigDecimal("2.00");
		BigDecimal decimal2 = new BigDecimal("1.1");
		
		System.out.println(decimal1.subtract(decimal2));
		
	}
}
