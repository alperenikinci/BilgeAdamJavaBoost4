package com.bilgeadam.boost.week01.lecture002;

import java.util.Scanner;

public class ThreeVariables {

	private static Scanner scan;

	public static void main(String[] args)
	
	{
		int a,b,c;
		
		scan = new Scanner (System.in);
		System.out.print("Please enter first number: ");
		a = scan.nextInt();
		
		System.out.print("Please enter second number: ");
		b= scan.nextInt();
		
		System.out.print("Please enter third number: ");
		c= scan.nextInt();
		
		System.out.println("Your Result is: "+ a*(b+c));
	}

}
