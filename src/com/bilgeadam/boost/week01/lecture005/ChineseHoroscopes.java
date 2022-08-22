package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class ChineseHoroscopes {

	public static void main(String[] args) 
	{
		int n = 0;
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter your birth year: ");
		n = scan.nextInt();
		scan.close();
		
		int horoscope = n%12;
		
		switch (horoscope) {
		case 0: 
			{
				System.out.println("Your zodiac sign is: Monkey ");
				break;
			}
		case 1:
			{
				System.out.println("Your zodiac sign is: Rooster ");
				break;
			}
		case 2:
			{
				System.out.println("Your zodiac sign is: Dog ");
				break;
			}
		case 3:
			{
				System.out.println("Your zodiac sign is: Pig ");	
				break;
			}
		case 4:
			{
				System.out.println("Your zodiac sign is: Mouse ");
				break;
			}
		case 5:
			{
				System.out.println("Your zodiac sign is: Ox ");
				break;
			}
		case 6:
			{
				System.out.println("Your zodiac sign is: Tiger ");
				break;
			}
		case 7:
			{
				System.out.println("Your zodiac sign is: Rabbit ");
				break;
			}
		case 8:
			{
				System.out.println("Your zodiac sign is: Dragon ");
				break;
			}
		case 9:
			{
				System.out.println("Your zodiac sign is: Snake ");
				break;
			}
		case 10:
			{
				System.out.println("Your zodiac sign is: Horse ");
				break;
			}
		case 11:
			{
				System.out.println("Your zodiac sign is: Sheep ");
				break;
			}
		default:
			throw new IllegalArgumentException("You have entered wrong input. Please enter positive number. ");
		}
		
		
	}

}
