package com.bilgeadam.boost.week02.lecture002;

public class FindMinimumNumber {

	public static void main(String[] args) 
	{
		System.out.println(Compare (-5,5));
	}
	
	public static int Compare (int a, int b) 
	{
	int min;
	
	if (a>b) 
	{
		min = b;
	}
	else 
	{
		min = a;
	}
	return min;


	}
}