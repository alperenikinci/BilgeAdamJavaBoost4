package com.bilgeadam.boost.week03.lecture004.Arrays;

import java.util.Arrays;

public class ArrayIntro 
{
	public static void main(String[] args) 
	{
		
		//declared an array with [].
		int[] data;
		
		//allocate memory
		data = new int [10];
		
		//declaration	allocation
		double[] datas = new double[12];
		
		// declare and initialize
		int[] age = {14,15,23,45};
		
		data[0] = 12;
		data[1] = 6;
		data[2] = 5;
		
//		System.err.println("Single index printout ");
		System.out.println(age[1]);
		System.out.println();
	
		
//		System.err.println("Arrays.toString printout ");
		System.out.println(Arrays.toString(age));
		System.out.println();
		
//		System.err.println("Printout via for loop which covers through index 0 to array.length) ");	
		for(int i = 0; i<age.length; i++)
		{
			System.out.print(age[i]+"");
		}
		System.out.println();
		System.out.println();
//		System.err.println("Foreach printout)		
		for (int i : age) 
		{
			System.out.print(i);
		}
	}
	
}
