package com.bilgeadam.boost.homeworkproject.no001;

import java.util.Scanner;



public class SieveOfEratosthenes
{	

	public static void main(String[] args) 
	{	
		SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
		sieveOfEratosthenes.sieve();
	}	
	

	private void sieve() 
	{
		boolean isInteger = true;
		while (isInteger) 
		{
			
			System.out.print("Please enter a positive number : ");
			Scanner input = new Scanner (System.in);
			if(!input.hasNextInt()) 
			{
				System.err.println("Wrong Input..!");
				continue;
			}
			int upperBound = input.nextInt();
			if(upperBound <=0) 
			{
				System.err.println("Number has to be POSITIVE..!");
				continue;
			}
			input.close();
			
			int[ ]numbers = new int[upperBound+1];
			
			for(int assign = 2; assign<upperBound+1; assign++)
			{
				numbers[assign] = assign;
			}
			
			System.out.println("All the prime numbers up to "+ upperBound + " are : ");
			int i = 2;
			while(i<upperBound+1) 
			{
				for(int j = 2 ; i*j<upperBound+1; j++) 
				{
					numbers[i*j]=0;
				}
				if(numbers[i]!=0) 
				{
					System.out.print(i + "	");
				}
			i++;
			}
			isInteger = false;
		}		
	}
}	
	
