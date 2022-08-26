package com.bilgeadam.boost.week02.lecture003.RockPaperScissorsPack;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		int oneCounter = 0;
		int twoCounter = 0;
		int threeCounter = 0;
		int allCounter = 0;
		
		while(allCounter<3000000) 
		{
		int number = (int) (Math.random()*3+1);
		
		allCounter++;
		if (number == 1) 
		{
			oneCounter++;
		}
		else if (number == 2) 
		{
			twoCounter++;
		}
		else if (number == 3)
		{
			threeCounter++;
		}
			
		}
		System.out.println("amount of 1's : "+oneCounter+"\nAmount of 2's : "+twoCounter+"\nAmount of 3's : "+threeCounter);
	}

}
