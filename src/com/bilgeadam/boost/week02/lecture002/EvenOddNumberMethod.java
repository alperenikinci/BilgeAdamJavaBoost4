package com.bilgeadam.boost.week02.lecture002;

import java.util.Scanner;

public class EvenOddNumberMethod {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	int n = scan.nextInt();
	scan.close();
	
	boolean condition = true;
	
	if (n%2 == 0) 
	{
		condition = true;
	}
	else 
	{
		condition = false;
	}
	
	if(condition == evenOdd(n))
	System.out.println("Method is tested");
	else 
	{
	System.out.println("There is something wrong");
	}
	
	System.out.println("Return value is : "+evenOdd(n));
	

	}
	
	public static boolean evenOdd(int a)
	{
		if (a%2==0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}

}
