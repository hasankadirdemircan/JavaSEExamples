package calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//
		System.out.println(calendar.get(Calendar.YEAR)); //bulundugumuz yili verir.
		System.out.println(calendar.get(Calendar.MONTH)); //bulundugumuz ayi verir.(0-11 arasinda deger aliyor.)
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));// 1den baslar, ayin kacinci gunu?
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));// yilin kacinci gunu
		
		//
		System.out.println(calendar.get(Calendar.HOUR));// 12 lik dilim.
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//24 lik dilim
		
		//
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));// ay son gunu
	}
}
