package com.bilgeadam.boost.week02.lecture003;

public class Person {
	public String firstName; 	//Her yerden erişilebiliyor - umuma açık
	String lastName;			//Default görünürlük; aynı paket içerisinde başka bir classta erişilebilir.
	private int age;			//Private sadece tanımlı olduğu sınıfta görünür.
	private String password;
	
	public static void main(String[] args) 
	{
	Person p1 = new Person();
	p1.firstName = "Alperen";
	p1.lastName = "Ikinci";
	p1.age = 26;
	}
	
	public void initialPassword(String initialPassword) 

	{
		this.password = initialPassword;
	}
	
	public boolean setPassword(String oldPassword, String password) 
	{
		if (oldPassword.equals(this.password))
		{
			this.password = password;
			return true;
		}
		return false;
	}
	
	public boolean isPasswordCorrect(String password) 
	{
		return password.equals(this.password);
	}
}
