package com.bilgeadam.boost.week03.lecture002.hospital;

public abstract class Person 
{
	private String name;
	private boolean isHealty;
	private int age;
	
	//All args constructor
	public Person(String name, boolean isHealty, int age) {
		super();
		this.name = name;
		this.isHealty = isHealty;
		this.age = age;
		
	}
	
	void checkIfHealty() 
	{
		if(this.isHealty==true) 
		{
			checkUp();
		}
		else 
		{
			examinePatient();
			givePerscription();
		}
	}
	
	abstract void checkUp();
	abstract void examinePatient();

	void givePerscription() 
	{
		System.out.println("Patient has been given prescription. ");
	}
	
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHealty() {
		return isHealty;
	}

	public void setHealty(boolean isHealty) {
		this.isHealty = isHealty;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
