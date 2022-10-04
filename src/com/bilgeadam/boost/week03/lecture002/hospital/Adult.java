package com.bilgeadam.boost.week03.lecture002.hospital;

public class Adult extends Person
{

	public Adult(String name, boolean isHealty, int age) {
		super(name, isHealty, age);
	}

	@Override
	void checkUp() 
	{
		System.out.println("Check up has been applied");
	}

	@Override
	void examinePatient() 
	{
		System.out.println("Patient has examined. ");
	}

	
	

}
