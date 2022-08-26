package com.bilgeadam.boost.week02.lecture003.RockPaperScissorsPack;

import java.util.Scanner;

public class NumberGenerator {
	
	public static void cheatChecker() 
	{
		boolean wrongInput = true;
		boolean checkAgain = true;
		boolean testAgain = true;
		int oneCounter = 0;
		int twoCounter = 0;
		int threeCounter = 0;
		int counter = 0;
		int testCount;
		
		while(testAgain) 
	{	
		
		while(wrongInput) 
		{
		System.out.println("\nWelcome to the Cheat Checker!!!");
		System.err.println("QUICK TIP: Test with higher amount for better sensitivity.");
		System.out.print("\nPlease enter how many times you want computer to play: ");
	
		Scanner scan = new Scanner(System.in);
		testCount = scan.nextInt();
		if (testCount == (int) testCount)
		{
			wrongInput = false;
		}
		else 
		{
		
		}
		while(counter<testCount) 
		{
		int randomNumber = (int) (Math.random()*3+1);
		
		counter++;
		if (randomNumber == 1) 
		{
			oneCounter++;
		}
		else if (randomNumber == 2) 
		{
			twoCounter++;
		}
		else if (randomNumber == 3)
		{
			threeCounter++;
		}
		
			System.err.println("\n\nCheat Checker finished simulation!!!");
			System.out.println(		
				"\nComputer played "+ testCount+" times and results are: \n"+
				"\nComputer picked Rock		: "+oneCounter+" times."+
				"\nComputer picked Paper		: "+twoCounter+" times"+
				"\nComputer picked Scissors	: "+threeCounter+" times.\n");
		}
		
		while(checkAgain) {
		System.out.print("Would you like to check again? (Y/N) : ");
		String checkAnswer = scan.next();
		if (checkAnswer.equalsIgnoreCase("Y"))
		{
			checkAgain = false;
			testAgain = true;
		}
		else if (checkAnswer.equalsIgnoreCase("N")) 
		{
			checkAgain = false;
			testAgain = false;
		}
		else 
		{
			System.out.println("You entered a wrong input!!! ");
		}
		}
		
		
	}
	}	
						
	}
	
		

	
	
}
