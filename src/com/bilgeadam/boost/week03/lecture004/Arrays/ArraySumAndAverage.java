package com.bilgeadam.boost.week03.lecture004.Arrays;

public class ArraySumAndAverage {

	public static void main(String[] args) 
	{
		int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
		double total = 0;
		
		for(int i = 0;i<numbers.length;i++) 
		{
			total = numbers[i] + total;
		}
		double average = total/numbers.length;
		System.out.println(total);
		System.out.println(average);
	}

}
