package com.bilgeadam.boost.week05.lecture001;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18NDate {
	public static void main(String[] args) 
	{
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.CANADA);
		printDate(Locale.CHINA);
		printDate(Locale.FRANCE);
		printDate(Locale.GERMANY);
		printDate(Locale.JAPAN);
		
	}
	
	static void printDate(Locale locale) {
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		Date currentDate = new Date();
		
		String date = formatter.format(currentDate);
		System.out.println(date + "  " + locale);
	}
}
