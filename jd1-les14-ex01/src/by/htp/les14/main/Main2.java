package by.htp.les14.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main2 {

	public static void main(String[] args) {
		String str1 = "XMinsk";
		String str2 = "Moskva";
		
		System.out.println(str1.equals(str2));
		
		
		System.out.println(str1.compareTo(str2));
		
		if(str1.compareTo(str2) < 0) {
			
		}else if(str1.compareTo(str2) > 0) {
			
		}else {
			
		}
		
		
		Calendar calendar1 = new GregorianCalendar(2020, 6, 23, 22, 12);
		Calendar calendar2 = new GregorianCalendar(2020, 5, 23, 22, 13);
		
		System.out.println(calendar1.compareTo(calendar2));

	}

}
