package com.bilgeadam.boost.week01.lecture002;

import java.util.Scanner;


//Execution time is experimented in this drill.
public class HMW_RawPriceCalculation 
{
	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
		
		float a, b, c;
	
		Scanner scan = new Scanner (System.in);
	
		System.out.print("Please enter final price: ");
		a = scan.nextFloat();
		
		System.out.print("Please enter VAT rate: ");
		b = scan.nextFloat();
		
		System.out.print("Please enter profit rate: ");
		c= scan.nextFloat();
		
		float NoVATPrice = (a*100)/(100+b);
		float rawPrice = (NoVATPrice*100)/(100+c);
		
		System.out.println("Final Price: "+ a +"\n"+ "NoVATprice: "+ NoVATPrice+ "\n"+"RawPrice: "+ rawPrice);
		
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("\nExecution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
		scan.close();
	}

}