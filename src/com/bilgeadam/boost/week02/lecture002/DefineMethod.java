package com.bilgeadam.boost.week02.lecture002;

public class DefineMethod {

	public static void main(String[] args) {
		
	//Some code
	int a = 5;
	int b = 4;
		
	int result =sum(a,b);
	//System.out.println(result);
	
	
	System.out.println(hello("Alperen","Ikinci"));
	}
	
	
	
	
	//public : Access modifier
	//static : When you run it the code in the method comes automatically. No static means we gotta call the codes.
	// The bracket parts : allows us to define parameters.
	public static int sum(int n1, int n2) //Whatever the data type is in the "int" part of the method, return must be the same value.
	{
//		int result = n1+n2;
		
		return n1+n2;	
	}
	
	public static String hello(String name, String surname)
	{
		return "Name:	"+name+"\nSoyadi:	"+surname;
	}
}
