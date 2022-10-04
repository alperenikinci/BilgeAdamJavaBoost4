package com.bilgeadam.boost.week05.lecture001;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18NSample {
	// greetings -Hello, Hallo, Bonjour
	
	// inquiry - How are you?, Wie gehst du?, Comment allez-vous
			
	// farewell -Goodbye , Tschüss, Au revoir
	
	public static void main(String[] args) 
	{
		
		chooseLanguage();
	
		
	
	}

	private static void chooseLanguage() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What language would you like to display? ");
		System.out.println("1- English (EN)  ");
		System.out.println("2- German (DE) ");
		System.out.println("3- French (FR) ");
		int selection = input.nextInt();
		input.close();
		
		switch (selection)
		{
		case 1: {
			Locale currentLocale = new Locale("en","EN");
			ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
			System.out.println(messages.getString("greetings"));
			System.out.println(messages.getString("inquiry"));
			System.out.println(messages.getString("farewell"));
			break;
		}
		case 2: {
			Locale currentLocale = new Locale("de","DE");
			ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
			System.out.println(messages.getString("greetings"));
			System.out.println(messages.getString("inquiry"));
			System.out.println(messages.getString("farewell"));
			break;
		}
		case 3:{
			Locale currentLocale = new Locale("fr","FR");
			ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
			System.out.println(messages.getString("greetings"));
			System.out.println(messages.getString("inquiry"));
			System.out.println(messages.getString("farewell"));
			break;
		}
	
		
		}
		
		
	}

}
