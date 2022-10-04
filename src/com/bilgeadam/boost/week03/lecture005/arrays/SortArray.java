package com.bilgeadam.boost.week03.lecture005.arrays;

import java.util.Arrays;

public class SortArray 
{

	public static void main(String[] args) 
	{
		int[] array = {3,7,3,12,43,54,43,28,3,19,-24,-19};
		
		for(int i= 0; i<array.length;i++) 
		{
			for(int j = i+1;j<array.length;j++) 
			{
				int temp = 0;
				if(array[i]>array[j]) 
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
			System.out.println(Arrays.toString(array));
		}
//		System.out.println(Arrays.toString(array));
	}
}

