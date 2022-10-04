package com.bilgeadam.boost.week04.lecture002.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SomeOtherStreamApiFeatures {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList();
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
//		list.stream().forEach(number -> System.out.println(number));
		list.stream()
		.filter(number -> number>60)
		.forEach(number -> System.out.println(number));
		System.out.println();
	
		//distinct 
		list.stream().distinct().forEach(number -> System.out.println(number)); 
		System.out.println();
		
		//sorted
		list.stream().sorted().forEach(number -> System.out.println(number));
		System.out.println();
		
		//reversesort
		list.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));
		System.out.println();
		
		//limit
		list.stream().limit(5).forEach(number -> System.out.println(number));
		System.out.println();
		
		//skip
		list.stream().skip(5).limit(2).forEach(number -> System.out.println(number));
		System.out.println();
		
		//count
		Long count = list.stream().filter(number -> number<=40).distinct().count();
		System.out.println(count);
		System.out.println();
		
		//anyMatch   contains ile aynı
		boolean match=list.stream().anyMatch(number -> number == 25);
		System.out.println(match);
		System.out.println();
		
		//allMatch
		boolean allMatch = list.stream().allMatch(number -> number == 25);
		System.out.println(allMatch);
		System.out.println();
		
		//noneMatch
		boolean noneMatch = list.stream().noneMatch(number -> number < 3);
		System.out.println(noneMatch);
		
		
	}

}
