package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Check {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String s1 = "10/11/1996";
		String s2 = "04/08/1978";
		
		Date d1 = formatter.parse(s1);
		Date d2 = formatter.parse(s2);
		
		System.out.println(d1.toString()); // converts to string
		
		System.out.println(d1.getTime()); // Gives a long milliseconds from 1970 jan 1
		
		System.out.println(d1.after(d2)); // true coz first date is after second date
		
		System.out.println(d1.before(d2)); // false
		
		System.out.println(d1.compareTo(d2)); // returns 1 as date1 is later than date2
		
		System.out.println(d1.equals(d2));  // return false 
		
	}

}
