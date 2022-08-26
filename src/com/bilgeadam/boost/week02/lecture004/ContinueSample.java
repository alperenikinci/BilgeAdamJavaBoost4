package com.bilgeadam.boost.week02.lecture004;

import java.util.Scanner;

public class ContinueSample {

	public static void main(String[] args) 
	
	{
		while(true) 
		{
			Scanner scan = new Scanner (System.in);
			System.out.print("Please enter a number between 1 and 10: ");
			int n = scan.nextInt();
			
			if(n > 10) 
			{
				System.out.println("Wrong input");
				continue;
			}
			System.out.println(n);
			
		}

	}

}
