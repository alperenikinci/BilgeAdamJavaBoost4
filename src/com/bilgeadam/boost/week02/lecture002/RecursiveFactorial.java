package com.bilgeadam.boost.week02.lecture002;

public class RecursiveFactorial {

	public static void main(String[] args) 
	{
	int result = factorial(5);
	System.out.println(result);
	}
	
	public static int factorial (int n) 
	{
		if(n != 0) 
		{
			return n*factorial(n-1);	
		}
		else
			return 1;
		
		//5*fact(4)
		//fact(4) = 4* fact(3)
		//fact(3) = 3* fact(2)
		//fact(2) = 2* fact(1)
		//fact(1) = 1* fact(0)
	}
}
