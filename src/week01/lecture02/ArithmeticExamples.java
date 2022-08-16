package week01.lecture02;

import java.util.Scanner;

public class ArithmeticExamples {

public static void main(String[] args)

	//How to get a number from user and respond to it.
	
//	{	
//		int a;
//	Scanner scan = new Scanner (System.in);
//	System.out.print("Please enter a number: ");
//	a = scan.nextInt();
//	
//	System.out.println("Number you choose: "+a);
//	}
	
	//How to get a number from user and respond by increasing it by 1.

	{
		int a;
	Scanner scan = new Scanner (System.in);
	System.out.print("Please enter a number: ");
	a = scan.nextInt();
		
	System.out.println("Your number +1 is: "+ ++a);
	}
}

