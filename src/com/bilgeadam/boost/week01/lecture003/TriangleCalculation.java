package com.bilgeadam.boost.week01.lecture003;

import java.util.Scanner;

public class TriangleCalculation 
{
	public static void main(String[] args) 
	
	{	double x, y, z, a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first angle: ");
		x = scan.nextDouble();
		System.out.print("Enter the line length for first angle: ");
		a = scan.nextDouble();
		System.out.print("Enter second angle: ");
		y = scan.nextDouble();
		System.out.print("Enter the line length for second angle: ");
		b = scan.nextDouble();
		scan.close();
		
		z = 180 -(x+y);
		double zRad = Math.toRadians(z);
		
		double temp = Math.pow(a, 2) + (b*b) - (2*a *b *(Math.cos(zRad)));
		
		Math.pow(temp, 0.5);
		
		c = Math.sqrt(temp);
		System.out.println("Third angle is: " + z);
		System.out.println("Third side is: " + c);
	}

}

