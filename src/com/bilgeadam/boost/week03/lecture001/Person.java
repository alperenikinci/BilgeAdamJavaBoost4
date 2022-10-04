package com.bilgeadam.boost.week03.lecture001;

public class Person 
{
	private String name;
	private String surname;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
	}

	public Person(String name, String surname, String gender, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
	}

	void showPeople()
	{
		System.out.println("Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", age=" + age + "]");
	}
	
}