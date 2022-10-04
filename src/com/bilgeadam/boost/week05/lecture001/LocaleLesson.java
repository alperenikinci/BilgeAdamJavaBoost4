package com.bilgeadam.boost.week05.lecture001;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleLesson {

	public static void main(String[] args) 
	{
		Locale locale = new Locale("tr","TR");
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		
		
		
	}

	static void printCurrency(Locale locale) {
		double number = 105000.1234;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(number);
		System.out.println(currency + " " + locale);
	}
}
