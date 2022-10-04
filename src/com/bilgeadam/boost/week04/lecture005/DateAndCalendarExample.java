package com.bilgeadam.boost.week04.lecture005;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; //util date kullanılacak.
import java.util.GregorianCalendar;

public class DateAndCalendarExample 
{

	public static void main(String[] args) 
	{
		long date = System.currentTimeMillis();
		
		Date date2 = new Date(date);
		
		Date today = new Date();
//		System.out.println(today);
		
		Date twentySevenFeb2017Date = new Date(117,1,27); //deplecated yöntem. date üstüne tıkla ve gör.
		System.out.println(twentySevenFeb2017Date);
		
		Calendar twentySevenFeb17Calendar = new GregorianCalendar(2017,1,27);
		System.out.println(twentySevenFeb17Calendar.getTime()); //güncel method
		
		DateFormat ddMMyyySDF = new SimpleDateFormat("dd/MM/yyyy"); //buradaki format değiştirilirse output da farklı gelir.
		System.out.println(ddMMyyySDF.format(twentySevenFeb2017Date));
	}
	

}
