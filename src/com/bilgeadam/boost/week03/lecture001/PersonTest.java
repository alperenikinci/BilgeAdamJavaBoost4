package com.bilgeadam.boost.week03.lecture001;

public class PersonTest 
{

	public static void main(String[] args) 
	{
		Person person = new Person();
		person.setName("Alperen");
		person.setSurname("Ikinci");
		person.setGender("Male");
		person.setAge(26);
		
		Person person1 = new Person("Cagri","Turkmen","Male",30);
		
		person.showPeople();
		person1.showPeople();
	
	}

}
