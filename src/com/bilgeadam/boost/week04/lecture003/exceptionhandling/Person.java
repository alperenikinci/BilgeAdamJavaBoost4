package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class Person {
	
	String name;
	int age;
	boolean isWoman;
	
	 void welcome() {
		if(isWoman = true) {
			System.out.println("Welcome!");
		}
		
	}
	
	public Person() {
		super();
	}

	public Person(String name, int age, boolean isWoman) {
		super();
		this.name = name;
		this.age = age;
		this.isWoman = isWoman;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isWoman() {
		return isWoman;
	}
	public void setWoman(boolean isWoman) {
		this.isWoman = isWoman;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isWoman=" + isWoman + "]";
	}
	
	
}
