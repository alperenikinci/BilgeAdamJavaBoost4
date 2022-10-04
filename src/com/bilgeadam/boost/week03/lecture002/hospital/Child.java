package com.bilgeadam.boost.week03.lecture002.hospital;

public class Child extends Person 
{

	public Child(String name, boolean isHealty, int age) {
		super(name, isHealty, age);
	}
	void getVaccinated() 
	{
		System.out.println("Patient has been vaccinated. ");
	}
	@Override
	
	void checkUp() 
	{
		System.out.println("Child has been given a candy. ");
		System.out.println("Child has been checked up. ");
	}

	@Override
	void examinePatient() 
	{
		System.out.println("Child has been examined during playing games. ");
		
	}
	@Override
	public String toString() {
		return "Child [getName()=" + getName() + ", isHealty()=" + isHealty() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
	
	
	
	

