package week01.lecture02;

import java.util.Scanner;

public class ModAndDivision {

	public static void main(String[] args) {
		//How to get 2 integers from user, divide them and print out result and remainder as double.
	{
		double a,b;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter the first number: ");
		a = scan.nextInt();
	
		System.out.print("Please enter the second number: ");
		b= scan.nextInt();
			
		double div = a/b;
		double mod = a%b;
			
		System.out.println("Result is; "+ div +"\n" + "Remainder is: "+ mod);
		

	}
	
}}