package dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		DateFormat df = DateFormat.getInstance();
	
		System.out.println(df.format(date));
		
		DateFormat dffull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dffull.format(date));
		
		DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfMedium.format(date));
		
		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfShort.format(date));
		
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); //kendimiz zamani formatlamak istiyorsak.
		System.out.println(df1.format(date));
		
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd"); //
		System.out.println(df2.format(date));
		
		DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //
		System.out.println(df3.format(date));
	}
}
