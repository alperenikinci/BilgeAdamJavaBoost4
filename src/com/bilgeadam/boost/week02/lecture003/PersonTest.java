package com.bilgeadam.boost.week02.lecture003;

public class PersonTest 
{
	public static void main (String[] args) 
	{
		Person p1 = new Person();
		System.out.println(p1.toString());
		p1.firstName = "Ali";
		p1.initialPassword("abc");
		
		String msg = p1.isPasswordCorrect("cde")?"doğrudur":"yanlıştır";
		System.out.println("Verilen şifre " + msg);
		System.out.println("Şifre değişti: "+ p1.setPassword("abc", msg));
		
	}
	
}
