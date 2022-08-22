package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class ZodiacSigns 
{

	public static void main(String[] args) 
	{
		int day;
		String month;
		System.out.println("To learn your zodiac sign please enter; ");
		Scanner scan = new Scanner (System.in);
		System.out.print("1- Your birth month in full name: ");
		month = scan.next();
		System.out.print("2- Your birth day (1-31): ");
		day = scan.nextInt();
		scan.close();
		
	if (day >= 1 && day <=31) 
	{
				
	if (month.equalsIgnoreCase("December") && day >=22 || month.equalsIgnoreCase("January") && day <= 21)
	{	System.out.println("\nYour zodiac sign is: Capricorn");	}
	
	else if (month.equalsIgnoreCase("January") && day >=22 || month.equalsIgnoreCase("February") && day <= 19)
	{	System.out.println("\nYour zodiac sign is: Aquarius");	}
	
	else if (month.equalsIgnoreCase("February") && day >=20 || month.equalsIgnoreCase("March") && day <= 20)	
	{	System.out.println("\nYour zodiac sign is: Pisces ");	}
	
	else if (month.equalsIgnoreCase("March") && day >=21 || month.equalsIgnoreCase("April") && day <= 20)
	{	System.out.println("\nYour zodiac sign is: Aries");	}
	
	else if (month.equalsIgnoreCase("April") && day >=21 || month.equalsIgnoreCase("May") && day <= 21)			
	{	System.out.println("\nYour zodiac sign is: Taurus");	}
	
	else if (month.equalsIgnoreCase("May") && day >=22 || month.equalsIgnoreCase("June") && day <= 22)	
	{	System.out.println("\nYour zodiac sign is: Gemini");	}
	
	else if (month.equalsIgnoreCase("June") && day >=23 || month.equalsIgnoreCase("July") && day <= 22)
	{	System.out.println("\nYour zodiac sign is: Cancer");	}
	
	else if (month.equalsIgnoreCase("July") && day >=23 || month.equalsIgnoreCase("August") && day <= 22)
	{	System.out.println("\nYour zodiac sign is: Leo");	}
	
	else if (month.equalsIgnoreCase("August") && day >=23 || month.equalsIgnoreCase("September") && day <= 22)
	{	System.out.println("\nYour zodiac sign is: Virgo");	}
	
	else if (month.equalsIgnoreCase("September") && day >=23 || month.equalsIgnoreCase("October") && day <= 22)
	{	System.out.println("\nYour zodiac sign is: Libra");	}
	
	else if (month.equalsIgnoreCase("October") && day >=23 || month.equalsIgnoreCase("November") && day <= 21)
	{	System.out.println("\nYour zodiac sign is: Scorpio");	}
	
	else if (month.equalsIgnoreCase("November") && day >=22 || month.equalsIgnoreCase("December") && day <= 21)
	{	System.out.println("\nYour zodiac sign is: Sagittarius");	}
	
	else System.out.println("Please enter a valid month! ");
	}
	else System.out.println("Please enter a valid day! ");
	}
}


