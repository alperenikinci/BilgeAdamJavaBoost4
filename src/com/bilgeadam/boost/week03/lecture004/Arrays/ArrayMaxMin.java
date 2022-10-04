package com.bilgeadam.boost.week03.lecture004.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMin {

	public static void main(String[] args) 
	{
		Integer[] numbers = {56,34,1,8,101,-2,-33};
		System.out.println(Collections.min(Arrays.asList(numbers)));
		System.out.println(Collections.max(Arrays.asList(numbers)));
	}

}
