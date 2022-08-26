package com.bilgeadam.boost.week02.lecture002;

public class SumBetweenTwoNumbers {

	public static int summary (int a, int b) 
	{
		if(a<b) 
		{
		 int sum = a+summary(a+1,b);
		 return sum;
		}
		return a;
	} 
	
	
	public static void main(String[] args)
	{
		int result = summary(15,20);
		System.out.println(result);

	}
}
