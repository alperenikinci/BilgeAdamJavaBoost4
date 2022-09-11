package com.bilgeadam.boost.homeworkproject.no001;

import java.util.Arrays;
import java.util.Scanner;

public class FractionCalculator 
{	Scanner input;

	public static void main(String[] args) 
	{
		FractionCalculator fraction = new FractionCalculator();
		fraction.welcome();
	}

	private void welcome() 
	{	int selection;
		System.out.println("Welcome to the fraction calculator!");
		while(true)
		{
		System.out.println("\nSummation(1) \nSubtraction(2) \nMultiplication(3) \nDivision(4) \nExit(0)");
		System.out.print("\nPlease chose what mathematical operation would you like to do : ");
		
		input = new Scanner(System.in);
		if (!input.hasNextInt()) 
		{
			System.err.println("\nPlease enter a NUMBER..! ");
			continue;
		}
		
		selection = input.nextInt();
		if (selection <5 && selection >-1) 
		{
			break;
			}
		
		else 
		{
		System.err.println("\nPlease enter a VALID number..!");
		continue;
		}
		
		}
		
//		switch (selection) 
//		{
//		case 1:
//			summation();
//		
//		case 2:
//			subtraction();
//			
//		case 3:
//			multiplication();
//			
//		case 4:
//			division();
//		case 5:
//			exit();
//			
//		}
//		
//		
//	}
//
//	private void getFraction() 
//	{
//		int totalNumerator = 0;
//		int totalDenominator = 0;
//		int i = 1;
//		int[] fractal = new int[3];
//		
//		while(true) 
//		{
//			while(true) 
//			{
//				System.out.println("Please enter fractal number "+ i + " in the form of (a/b) : ");
//				if(input.nextLine().contains("/"));
//			}
//			
//		}
		
	}




}
