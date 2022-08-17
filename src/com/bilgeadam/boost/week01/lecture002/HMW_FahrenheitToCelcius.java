package com.bilgeadam.boost.week01.lecture002;

import java.util.Scanner;

public class HMW_FahrenheitToCelcius 
{
	public static void main(String[] args) 
	{	
		int a;
		Scanner	scan = new Scanner (System.in);
		System.out.print("Please enter Fahrenheit degree: ");
		a = scan.nextInt();
		int conversion = (int) ((a-32)/1.8);
		System.out.println(a + " Fahrenheit is approximately: "+ conversion + " Celcius degrees");
		scan.close();
	}
}