package com.bilgeadam.boost.week01.lecture004;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	
	{	double a,b, result;
		int operator;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		a = scan.nextDouble();
		System.out.print("Please enter second number: ");
		b = scan.nextDouble();
		System.out.print("Please choose the operation; \n1-Summation (1): \n2-Substraction (2): \n3-Multiplication: (3) \n4-Division: (4) ");
		operator = scan.nextInt();
		
		scan.close();
		
		switch (operator)
		{
		case 1:
		{
			result = a + b;
			System.out.println("Result is: "+result);
			break;
			
		}
		case 2:
		{
			result = a - b;
			System.out.println("Result is: "+result);
			break;
		}
		case 3:
		{
			result = a * b;
			System.out.println("Result is: "+result);
			break;
			
		}
		case 4:
		{
			result = a / b;
			System.out.println("Result is: "+result);
			break;
		}	default:
				System.out.println("Operator is not correct!");
				break;	
		}
			
	}

}
