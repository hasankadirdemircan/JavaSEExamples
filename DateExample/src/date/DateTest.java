package date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); //gün ay saat yıl seklinde bilgi verir.
		
		long time = date.getTime();
		System.out.println(time);//epoch time olarak cevap dondurur.
		//epoch 1.1.1970 00:00:000 zamaninda baslayip gunumuze kadar gelen zaman. 
		
		long time2 = System.currentTimeMillis(); //getTime() ile ayni isi yapar.
		System.out.println(time2);
	}
}
