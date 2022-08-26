package com.bilgeadam.boost.week02.lecture003;

public class Course 
{
	private String name;
	private Person student;
	private Person teacher;
	
	public static void main(String[] args) 
	{
		Course c1 = new Course();			//firstname publicte
		c1.name = "Java";					//lastname defaultta (Yani paket içerisinden erişilebiliyor)
		c1.student.firstName = "Alperen";	//age private olduğu için başka class'tan görünmüyor.
		c1.student.lastName = "İkinci";
		
		Course c2 = new Course();
		c2.name = "";
	}
}
