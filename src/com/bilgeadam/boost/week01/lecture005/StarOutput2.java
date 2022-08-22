package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class StarOutput2 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter how many lines you wanna draw: ");
		int n = scan.nextInt();
		scan.close();
				
		for (int i = 0; i < n*2; i = i+2) 
		{	System.out.print("*");
			for (int j = 2; j <= i; j++) 
			{
				System.out.print("*");
			}
				System.out.println("");
		}
		

	}
}
