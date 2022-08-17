package com.bilgeadam.boost.week01.lecture003;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) 
	{
		
		int x = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		x = scan.nextInt();
		
		if (x<0) 
		{
		System.out.println("X is negative");
		}
		
		else if (x==0)
		{
			System.out.println("X is neutral");
		}
		
		else 
		{
			System.out.println("X is positive");
		}
		
	}
}
				
