package com.bilgeadam.boost.week03.lecture005.arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) 
	{
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6};
		int[] mergeArray = new int[array1.length+array2.length];
		
		int pos = 0;
		for (int i : array1) 
		{
			mergeArray[pos]=i;
			pos++;	
		}
		for (int i : array2) 
		{
			mergeArray[pos]=i;
			pos++;
		}
		
		System.out.println(Arrays.toString(mergeArray));
		
	}

}
