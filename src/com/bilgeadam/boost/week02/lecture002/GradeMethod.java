package com.bilgeadam.boost.week02.lecture002;

import java.util.Scanner;

public class GradeMethod {

	public static void main(String[] args) 
	{
		double n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your grade: ");
		n = scan.nextDouble();
		scan.close();
		System.out.println(grade(n));
	}
	
	public static String grade (double n1)
	{
		String rank = "";
	if (n1 >= 200.5) 
	{
		return "You are Rank: A";	
	}
	else if (n1 > 122.4)
	{
		rank = "You are Rank: B";
	}
	else
	{
		rank = "You are Rank: C";
	}
	
	return rank;
	}

}
