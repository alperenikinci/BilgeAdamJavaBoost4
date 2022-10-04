package com.bilgeadam.boost.week04.lecture005;

import java.time.LocalDate;

public class LocalDateAndLocalTimeExamples 
{

	public static void main(String[] args)
	{
		LocalDate currentlocaldateDate = LocalDate.now();
		System.out.println(currentlocaldateDate);
		LocalDate twentySevenFeb2017LocalDate = LocalDate.of(2017, 2, 27);
		System.out.println(twentySevenFeb2017LocalDate);
	}

}
