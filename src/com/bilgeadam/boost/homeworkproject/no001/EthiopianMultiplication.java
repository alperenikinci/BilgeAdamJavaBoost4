package com.bilgeadam.boost.homeworkproject.no001;

import java.util.Scanner;

public class EthiopianMultiplication 
{
	int numberOne;
	int numberTwo;

	 public static void main(String[] args) 
	 {
		 EthiopianMultiplication ethiopianMultiplication = new EthiopianMultiplication();
		 ethiopianMultiplication.initiate();

	 }

	private void initiate() 
	{	
		Scanner input;
		int numberOne;
		int numberTwo;
			
			while(true) 
			{	
				input = new Scanner(System.in);
				System.out.print("Please enter the first number : ");
				if (!input.hasNextInt()) 
				{
					System.err.println("Please enter a NUMBER..! :\n ");
					continue;
				}
				numberOne = input.nextInt();
				break;
			}
				while(true) 
			{	
				input = new Scanner(System.in);
				System.out.print("Please enter the second number : ");
				if (!input.hasNextInt()) 
				{
					System.err.println("Please enter a NUMBER..! :\n ");
					continue;
				}
				numberTwo = input.nextInt();
				break;
			}
			input.close();
			
			int leftNumber;
			int rightNumber;
			if(numberOne>numberTwo) 
			{
				leftNumber 	= numberTwo;
				rightNumber	= numberOne;
			}
			else 
			{
				leftNumber 	= numberOne;
				rightNumber	= numberTwo;
			}

			int total = 0;
			 System.out.println("\n"+"Multiplier"+"	"+"Multiplied"+"		"+"SumTotal");
			while(leftNumber!=0)
			{
				if(leftNumber%2!=0) 
				{
					total = total +rightNumber;
					
					System.err.println(leftNumber+"		"+rightNumber+"		add	"+total);
					
				}
				else 
				{
					System.out.println(leftNumber+"		"+rightNumber+"			"+total);
				
				}
				leftNumber = leftNumber/2;
				rightNumber =rightNumber*2;
			}
				System.out.println("\n############	RESULT	############");
				System.out.print(numberOne+"	*	"+ numberTwo +"	=		"+total);			
	}			
}
