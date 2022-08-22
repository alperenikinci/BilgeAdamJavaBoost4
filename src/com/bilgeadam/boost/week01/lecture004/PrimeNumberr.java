package com.bilgeadam.boost.week01.lecture004;

import java.util.Scanner;

public class PrimeNumberr 
{
	//TODO Fix it
	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		n = scan.nextInt();
		scan.close();
		int i = 2;
		int root = (int) Math.sqrt(n);
		
		if (n <= 1)
			System.out.println(n+ " is not a prime number");
		
		else if (n == 2) 
			
			System.out.println(n+ " is a prime number");
		
		else if (n%2 == 0) 
			System.out.println(n+ " is not a prime number");
		
		else
		{
			while (i < root);
			{	i++;
				if (n%i == 0) 
				{
					System.out.println(n+ " is not a prime number.");
					
				}
				else 
				{	
					System.out.println(n+ " is a prime number.");	
				}
				
			}
		}
	
	}
}


	
