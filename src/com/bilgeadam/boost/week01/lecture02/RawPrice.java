package com.bilgeadam.boost.week01.lecture02;

import java.util.Scanner;


//Execution time is experimented in this drill.
public class RawPrice {

	public static void main(String[] args) 
	{
		
		long startTime = System.nanoTime();
		
		float a;
		float b;
		float c;
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
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
		scan.close();
		
	}

}
